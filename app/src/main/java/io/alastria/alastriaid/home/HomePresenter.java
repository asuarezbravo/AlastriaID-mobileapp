package io.alastria.alastriaid.home;


import io.alastria.alastriaid.model.Model;
import io.alastria.alastriaid.model.Person;

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
        final Person _person = mModel.getPerson();
        mHomeView.displayProfile(_person.getFirstName(), _person.getLastName(), _person.getEmail(), _person.getPhoneNumber(), _person.getDNI());
        mHomeView.displayServices(mModel.getServices());
    }
}
