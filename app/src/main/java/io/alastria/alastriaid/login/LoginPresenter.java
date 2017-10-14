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

        final Activity activity = (Activity)mLoginView;

        String error = "";
        if(email==null || email.isEmpty())
            error = activity.getString(R.string.loginErrorEmail);
        else if(pin==null || pin.isEmpty())
            error = activity.getString(R.string.loginErrorPin);

        if(!error.isEmpty()) {
            Utils.ShowErrorToast(error, activity);
            return;
        }

        //TODO: implement login
        Model.getInstance().getPerson().setEmail(email);//for testing

        final Intent intent = new Intent(activity, HomeActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    @Override
    public void register() {
        final Activity activity = (Activity)mLoginView;
        final Intent intent = new Intent(activity, RegisterActivity.class);
        activity.startActivity(intent);
        activity.finish();
    }

    @Override
    public void start() {
    }
}
