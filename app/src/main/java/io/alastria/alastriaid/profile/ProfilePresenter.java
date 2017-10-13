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
    public void saveUser(String firstName, String lastName, String email, String phoneNumber, String dni) {        //TODO: implement register


        if(validateForm( firstName, lastName, email, phoneNumber, dni)) {

            Person _person = mModel.getPerson();
            _person.setEmail(email);
            _person.setFirstName(firstName);
            _person.setLastName(lastName);
            _person.setPhoneNumber(phoneNumber);
            _person.setDNI(dni);

            //show toast
            final Activity _activity = (Activity) mProfileView;
            Utils.ShowToast("Usuario guardado", _activity);

            //go to home page
            final Intent _intent = new Intent(_activity, HomeActivity.class);
            _activity.startActivity(_intent);
            _activity.finish();
        }
    }

    public boolean validateForm(String firstName, String lastName, String email, String phoneNumber, String dni){
        final Activity _activity = (Activity) mProfileView;

        String _error = "";
        if(email==null || email.isEmpty())
            _error = _activity.getString(R.string.registerErrorEmail);
        else if(lastName==null || lastName.isEmpty())
            _error = _activity.getString(R.string.registerErrorFirstName);
        else if(email==null || email.isEmpty())
            _error = _activity.getString(R.string.registerErrorLastName);
        else if(phoneNumber==null || phoneNumber.isEmpty())
            _error = _activity.getString(R.string.registerErrorPhone);
        else if(dni==null || dni.isEmpty())
            _error = _activity.getString(R.string.registerErrorDni);

        if(!_error.isEmpty()) {
            Utils.ShowErrorToast(_error, _activity);
            return false;
        }
        else
            return true;
    }
    @Override
    public void start() {
        mModel = Model.getInstance();
        final Person _person = mModel.getPerson();
        mProfileView.populateProfile(_person.getFirstName(), _person.getLastName(), _person.getEmail(), _person.getPhoneNumber(), _person.getDNI());
    }
}
