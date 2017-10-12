package io.alastria.alastriaid.home;

import java.util.ArrayList;

import io.alastria.alastriaid.BasePresenter;
import io.alastria.alastriaid.BaseView;
import io.alastria.alastriaid.model.Service;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public interface HomeContract {

    interface View extends BaseView<Presenter> {
        void displayProfile(String firstName, String lastNume, String email, String phoneNumber, String dni);
        void displayServices(ArrayList<Service> services);
    }

    interface Presenter extends BasePresenter {
    }
}
