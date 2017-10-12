package io.alastria.alastriaid.register;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import io.alastria.alastriaid.home.HomeActivity;
import io.alastria.alastriaid.login.LoginActivity;
import io.alastria.alastriaid.model.Model;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class RegisterPresenter implements RegisterContract.Presenter {

    private RegisterContract.View mRegisterView;


    public RegisterPresenter(RegisterContract.View registerView) {
        mRegisterView = registerView;
    }

    @Override
    public void registerNewUser(String firstName, String lastName, String email) {
        //TODO: implement register
        //for testing
        Model.getInstance().getPerson().setEmail(email);
        Model.getInstance().getPerson().setFirstName(firstName);
        Model.getInstance().getPerson().setLastName(lastName);

        //show toast
        final Activity _activity = (Activity)mRegisterView;
        Toast toast = Toast.makeText(_activity.getApplicationContext(), "Usuario registrado", Toast.LENGTH_LONG);
        toast.show();

        //go to login page
        final Intent _intent = new Intent(_activity, LoginActivity.class);
        _activity.startActivity(_intent);
        _activity.finish();
    }

    @Override
    public void start() {
    }
}
