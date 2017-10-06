package io.alastria.alastriaid.modelo;

/**
 * Created by Alvaro Suarez on 06/10/2017.
 */

public class Modelo {

    public static final String FILENAME = "modelo.dat";

    private static Persona mPersona;

    private static Modelo mInstance; //patron singleton

    private Modelo(){
        mPersona = new Persona();
    }

    public static Modelo getInstance(){
        if(mInstance == null) {
            //retrieve from persistent data if exists. For now just testing with dummy data
            // String _modelPath = Environment.getDataDirectory() + "/" + FILENAME;
            mInstance = new Modelo();
            mPersona = new Persona("test@gmail.com", "Pedro", "Sanchez Rodriguez", "655098765", "12345678Q");
        }

        return mInstance;
    }

    public Persona getPersona() {
        return mPersona;
    }

    public void setPersona(Persona persona) {
        mPersona = persona;
    }

    public void save(){
        //TODO: save to persistent data
    }
}
