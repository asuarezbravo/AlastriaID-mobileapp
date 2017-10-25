package io.alastria.alastriaid.register;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import io.alastria.alastriaid.R;
import io.alastria.alastriaid.home.HomeActivity;
import io.alastria.alastriaid.login.LoginActivity;
import io.alastria.alastriaid.model.Model;
import io.alastria.alastriaid.model.Person;
import io.alastria.alastriaid.util.Utils;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class RegisterPresenter implements RegisterContract.Presenter {

    private RegisterContract.View mRegisterView;

    public RegisterPresenter(RegisterContract.View registerView) {
        mRegisterView = registerView;
    }

    @Override
    public void registerNewUser(String firstName, String lastName, String email, String phoneNumber, String dni) {
        //TODO: implement register
        if(validateForm( firstName, lastName, email, phoneNumber, dni)) {

            //for testing
            Model model = Model.getInstance();

            Person person = model.getPerson();
            person.setEmail(email);
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setPhoneNumber(phoneNumber);
            person.setDNI(dni);

            //show toast
            final Activity activity = (Activity) mRegisterView;
            Utils.ShowToast("Nuevo usuario creado", activity);

            //go to home page
            final Intent intent = new Intent(activity, HomeActivity.class);
            activity.startActivity(intent);
            activity.finish();
        }
    }

    public boolean validateForm(String firstName, String lastName, String email, String phoneNumber, String dni){
        final Activity activity = (Activity)mRegisterView;

        String error = "";
        if(firstName==null || firstName.isEmpty())
            error = activity.getString(R.string.registerErrorFirstName);
        else if(lastName==null || lastName.isEmpty())
            error = activity.getString(R.string.registerErrorLastName);
        else if(email==null || email.isEmpty())
            error = activity.getString(R.string.registerErrorEmail);
        else if(phoneNumber==null || phoneNumber.isEmpty())
            error = activity.getString(R.string.registerErrorPhone);
        else if(dni==null || dni.isEmpty())
            error = activity.getString(R.string.registerErrorDni);

        if(!error.isEmpty()) {
            Utils.ShowErrorToast(error, activity);
            return false;
        }
        else
            return true;
    }

    @Override
    public void start() {
    }
}
