package io.alastria.alastriaid.home;

import io.alastria.alastriaid.BasePresenter;
import io.alastria.alastriaid.BaseView;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public interface HomeContract {

    interface View extends BaseView<Presenter> {
        void displayProfile(String nombre, String apellidos, String email);
    }

    interface Presenter extends BasePresenter {
    }
}
