package io.alastria.alastriaid.register;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.alastria.alastriaid.R;
import io.alastria.alastriaid.util.EnterPinDialogFragment;
import io.alastria.alastriaid.util.Utils;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class RegisterActivity extends AppCompatActivity implements RegisterContract.View, EnterPinDialogFragment.EnterPinDialogListener {

    private RegisterContract.Presenter mRegisterPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mRegisterPresenter = new RegisterPresenter(this);

        final EditText txtFirstName = (EditText)findViewById(R.id.txtFirstName);
        final EditText txtLastName = (EditText)findViewById(R.id.txtLastName);
        final EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
        final EditText txtPhone = (EditText)findViewById(R.id.txtPhoneNumber);
        final EditText txtDni = (EditText)findViewById(R.id.txtDni);

        final Button btnRegister = (Button)findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mRegisterPresenter.validateForm(txtFirstName.getText().toString(), txtLastName.getText().toString(), txtEmail.getText().toString(), txtPhone.getText().toString(), txtDni.getText().toString())){
                    DialogFragment dialogPin = new EnterPinDialogFragment();
                    dialogPin.show(getFragmentManager(), "EnterPinDialogFragment");
                }
            }
        });
    }

    @Override
    public void setPresenter(RegisterContract.Presenter presenter) {
        mRegisterPresenter = presenter;
    }

    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {

        final EditText txtFirstName = (EditText)findViewById(R.id.txtFirstName);
        final EditText txtLastName = (EditText)findViewById(R.id.txtLastName);
        final EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
        final EditText txtPhone = (EditText)findViewById(R.id.txtPhoneNumber);
        final EditText txtDni = (EditText)findViewById(R.id.txtDni);

        mRegisterPresenter.registerNewUser(txtFirstName.getText().toString(), txtLastName.getText().toString(), txtEmail.getText().toString(), txtPhone.getText().toString(), txtDni.getText().toString());
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
    }
}
