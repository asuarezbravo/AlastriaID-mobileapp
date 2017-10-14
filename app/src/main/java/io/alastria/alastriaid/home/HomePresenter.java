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
        final Person person = mModel.getPerson();
        mHomeView.displayProfile(person.getFirstName(), person.getLastName(), person.getEmail(), person.getPhoneNumber(), person.getDNI());
        mHomeView.displayServices(mModel.getServices());
    }
}
