package io.alastria.alastriaid.register;

import io.alastria.alastriaid.BasePresenter;
import io.alastria.alastriaid.BaseView;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public interface RegisterContract {

    interface View extends BaseView<Presenter> {
    }

    interface Presenter extends BasePresenter {
        boolean validateForm(String firstName, String lastName, String email, String phoneNumber, String dni);
        void registerNewUser(String firstName, String lastName, String email, String phoneNumber, String dni);
    }
}
