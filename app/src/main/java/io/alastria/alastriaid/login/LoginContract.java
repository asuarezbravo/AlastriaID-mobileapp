package io.alastria.alastriaid.login;

import io.alastria.alastriaid.BasePresenter;
import io.alastria.alastriaid.BaseView;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public interface LoginContract {

    interface View extends BaseView<Presenter> {
    }

    interface Presenter extends BasePresenter {
    }
}
