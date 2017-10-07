package io.alastria.alastriaid.home;


import io.alastria.alastriaid.model.Model;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class HomePresenter implements HomeContract.Presenter {

    private HomeContract.View mHomeView;
    private Model mModel;

    public HomePresenter(HomeContract.View homeView) {
        mHomeView = homeView;
    }

    @Override
    public void start() {
        mModel = Model.getInstance();
        mHomeView.displayProfile(mModel.getPerson().getFirstName(), mModel.getPerson().getLastName(), mModel.getPerson().getEmail());
    }
}
