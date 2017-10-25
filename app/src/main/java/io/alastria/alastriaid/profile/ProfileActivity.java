package io.alastria.alastriaid.profile;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.alastria.alastriaid.R;
import io.alastria.alastriaid.util.EnterPinDialogFragment;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class ProfileActivity extends AppCompatActivity implements ProfileContract.View, EnterPinDialogFragment.EnterPinDialogListener {

    private ProfileContract.Presenter mProfilePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mProfilePresenter = new ProfilePresenter(this);
        mProfilePresenter.start();

        final EditText txtFirstName = (EditText)findViewById(R.id.txtFirstName);
        final EditText txtLastName = (EditText)findViewById(R.id.txtLastName);
        final EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
        final EditText txtPhone = (EditText)findViewById(R.id.txtPhoneNumber);
        final EditText txtDni = (EditText)findViewById(R.id.txtDni);

        final Button btnRegister = (Button)findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mProfilePresenter.validateForm(txtFirstName.getText().toString(), txtLastName.getText().toString(), txtEmail.getText().toString(), txtPhone.getText().toString(), txtDni.getText().toString())){
                    DialogFragment dialogPin = new EnterPinDialogFragment();
                    dialogPin.show(getFragmentManager(), "EnterPinDialogFragment");
                }
            }
        });
    }

    @Override
    public void populateProfile(String firstName, String lastName, String email, String phoneNumber, String dni){
        ((EditText) findViewById(R.id.txtFirstName)).setText(firstName);
        ((EditText) findViewById(R.id.txtLastName)).setText(lastName);
        ((EditText) findViewById(R.id.txtEmail)).setText(email);
        ((EditText) findViewById(R.id.txtPhoneNumber)).setText(phoneNumber);
        ((EditText) findViewById(R.id.txtDni)).setText(dni);
    }
    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mProfilePresenter = presenter;
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {

        final EditText txtFirstName = (EditText)findViewById(R.id.txtFirstName);
        final EditText txtLastName = (EditText)findViewById(R.id.txtLastName);
        final EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
        final EditText txtPhone = (EditText)findViewById(R.id.txtPhoneNumber);
        final EditText txtDni = (EditText)findViewById(R.id.txtDni);

        mProfilePresenter.saveUser(txtFirstName.getText().toString(), txtLastName.getText().toString(), txtEmail.getText().toString(), txtPhone.getText().toString(), txtDni.getText().toString());
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
    }
}
