package io.alastria.alastriaid.model;

/**
 * Created by Alvaro Suarez on 06/10/2017.
 */

public class Model {

    public static final String FILENAME = "model.dat";

    private static Person mPerson;

    private static Model mInstance; //patron singleton

    private Model(){
        mPerson = new Person();
    }

    public static Model getInstance(){
        if(mInstance == null) {
            //retrieve from persistent data if exists. For now just testing with dummy data
            // String _modelPath = Environment.getDataDirectory() + "/" + FILENAME;
            mInstance = new Model();
            mPerson = new Person("test@gmail.com", "Pedro", "Sanchez Rodriguez", "655098765", "12345678Q");
        }

        return mInstance;
    }

    public Person getPerson() {
        return mPerson;
    }

    public void setPerson(Person person) {
        mPerson = person;
    }

    public void save(){
        //TODO: save to persistent data
    }
}
