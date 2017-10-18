package io.alastria.alastriaid.profile;


import android.app.Activity;
import android.content.Intent;

import io.alastria.alastriaid.R;
import io.alastria.alastriaid.home.HomeActivity;
import io.alastria.alastriaid.model.Model;
import io.alastria.alastriaid.model.Person;
import io.alastria.alastriaid.util.Utils;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class ProfilePresenter implements ProfileContract.Presenter {

    private ProfileContract.View mProfileView;
    private Model mModel;

    public ProfilePresenter(ProfileContract.View profileView) {
        mProfileView = profileView;
    }

    @Override
    public void saveUser(String firstName, String lastName, String email, String phoneNumber, String dni) {

        if(validateForm( firstName, lastName, email, phoneNumber, dni)) {

            //TODO: implement register
            Person person = mModel.getPerson();
            person.setEmail(email);
            person.setFirstName(firstName);
            person.setLastName(lastName);
            person.setPhoneNumber(phoneNumber);
            person.setDNI(dni);

            //show toast
            final Activity activity = (Activity) mProfileView;
            Utils.ShowToast("Usuario guardado", activity);

            //go to home page
            final Intent intent = new Intent(activity, HomeActivity.class);
            activity.startActivity(intent);
            activity.finish();
        }
    }

    public boolean validateForm(String firstName, String lastName, String email, String phoneNumber, String dni){
        final Activity activity = (Activity) mProfileView;

        String error = "";
        if(email==null || email.isEmpty())
            error = activity.getString(R.string.registerErrorEmail);
        else if(lastName==null || lastName.isEmpty())
            error = activity.getString(R.string.registerErrorFirstName);
        else if(email==null || email.isEmpty())
            error = activity.getString(R.string.registerErrorLastName);
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
        mModel = Model.getInstance();
        final Person person = mModel.getPerson();
        mProfileView.populateProfile(person.getFirstName(), person.getLastName(), person.getEmail(), person.getPhoneNumber(), person.getDNI());
    }
}
