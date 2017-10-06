package io.alastria.alastriaid.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import io.alastria.alastriaid.R;

/**
 * Created by Alvaro Suarez on 05/10/2017.
 */

public class HomeActivity extends AppCompatActivity implements HomeContract.View {

    private HomeContract.Presenter mHomePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mHomePresenter = new HomePresenter(this);
        mHomePresenter.start();
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mHomePresenter = presenter;
    }

    @Override
    public void mostrarDatosUsuario(String nombre, String apellidos, String email){
        ((TextView) findViewById(R.id.nombreUsuario)).setText(nombre + " " + apellidos);
        ((TextView) findViewById(R.id.emailUsuario)).setText(email);
    }
}
