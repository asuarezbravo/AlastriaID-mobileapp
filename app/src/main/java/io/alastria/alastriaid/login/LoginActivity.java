package io.alastria.alastriaid.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.alastria.alastriaid.R;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    private LoginContract.Presenter mLoginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginPresenter = new LoginPresenter(this);

        final EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
        final EditText txtPIN = (EditText)findViewById(R.id.txtPIN);

        final Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mLoginPresenter.login(txtEmail.getText().toString(), txtPIN.getText().toString());
            }
        });

        final Button btnRegister = (Button)findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mLoginPresenter.register();
            }
        });
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        mLoginPresenter = presenter;
    }
}
