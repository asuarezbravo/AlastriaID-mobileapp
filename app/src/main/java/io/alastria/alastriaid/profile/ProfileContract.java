package io.alastria.alastriaid.profile;

import io.alastria.alastriaid.BasePresenter;
import io.alastria.alastriaid.BaseView;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public interface ProfileContract {

    interface View extends BaseView<Presenter> {
        void populateProfile(String firstName, String lastName, String email, String phoneNumber, String dni);
    }

    interface Presenter extends BasePresenter {
        void saveUser(String firstName, String lastName, String email, String phoneNumber, String dni);
    }
}
