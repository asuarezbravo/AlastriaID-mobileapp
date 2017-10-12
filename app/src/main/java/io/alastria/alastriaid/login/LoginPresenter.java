package io.alastria.alastriaid.login;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

import io.alastria.alastriaid.R;
import io.alastria.alastriaid.home.HomeActivity;
import io.alastria.alastriaid.model.Model;
import io.alastria.alastriaid.register.RegisterActivity;
import io.alastria.alastriaid.util.Utils;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private LoginContract.View mLoginView;


    public LoginPresenter(LoginContract.View loginView) {
        mLoginView = loginView;
    }

    @Override
    public void login(String email, String pin) {

        final Activity _activity = (Activity)mLoginView;

        String _error = "";
        if(email==null || email.isEmpty())
            _error = _activity.getString(R.string.loginErrorEmail);
        else if(pin==null || pin.isEmpty())
            _error = _activity.getString(R.string.loginErrorPin);

        if(!_error.isEmpty()) {
            Utils.ShowErrorToast(_error, _activity);
            return;
        }

        //TODO: implement login
        Model.getInstance().getPerson().setEmail(email);//for testing

        final Intent _intent = new Intent(_activity, HomeActivity.class);
        _activity.startActivity(_intent);
        _activity.finish();
    }

    @Override
    public void register() {
        final Activity _activity = (Activity)mLoginView;
        final Intent _intent = new Intent(_activity, RegisterActivity.class);
        _activity.startActivity(_intent);
        _activity.finish();
    }

    @Override
    public void start() {
    }
}
