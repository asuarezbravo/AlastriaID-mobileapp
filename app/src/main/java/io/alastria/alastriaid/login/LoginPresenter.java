package io.alastria.alastriaid.login;


import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import io.alastria.alastriaid.home.HomeActivity;

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

        //TODO: implement login
        final Activity _activity = (Activity)mLoginView;
        final Intent intent = new Intent(_activity, HomeActivity.class);
        _activity.startActivity(intent);
        _activity.finish();
    }

    @Override
    public void register() {

    }

    @Override
    public void start() {
    }
}
