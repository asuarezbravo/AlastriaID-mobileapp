package io.alastria.alastriaid.home;


import android.content.Context;
import android.os.Environment;


import java.io.File;
import java.util.stream.Stream;

import io.alastria.alastriaid.modelo.Modelo;
import io.alastria.alastriaid.modelo.Persona;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class HomePresenter implements HomeContract.Presenter {

    private HomeContract.View mHomeView;
    private Modelo mModelo;

    public HomePresenter(HomeContract.View homeView) {
        mHomeView = homeView;
    }

    @Override
    public void start() {
        mModelo = Modelo.getInstance();
        mHomeView.mostrarDatosUsuario(mModelo.getPersona().getNombre(), mModelo.getPersona().getApellidos(), mModelo.getPersona().getEmail());
    }
}
