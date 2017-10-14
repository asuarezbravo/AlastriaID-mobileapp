package io.alastria.alastriaid.model;

import java.util.ArrayList;

import io.alastria.alastriaid.R;

/**
 * Created by Alvaro Suarez on 06/10/2017.
 */

public class Model {

    public static final String FILENAME = "model.dat";

    private Person mPerson;
    private ArrayList<Service> mServices;

    private static Model sInstance; //singleton pattern

    private Model(){

        //dummy data
        mPerson = new Person("test@gmail.com", "Pedro", "Sanchez Rodriguez", "655098765", "12345678Q");

        mServices = new ArrayList<Service>();
        mServices.add(new Service("Banco A", R.drawable.bank));
        mServices.add(new Service("Gas", R.drawable.energy));
        mServices.add(new Service("Banco B", R.drawable.bank));
        mServices.add(new Service("La Paz", R.drawable.healthcare));
        mServices.add(new Service("Gas", R.drawable.energy));
    }

    public static Model getInstance(){
        if(sInstance == null) {
            sInstance = new Model();
        }

        return sInstance;
    }

    public Person getPerson() {
        return mPerson;
    }

    public void setPerson(Person person) {
        mPerson = person;
    }

    public ArrayList<Service> getServices() {
        return mServices;
    }

    public void setServices(ArrayList<Service> services) {
        mServices = services;
    }


    public void save(){
        //TODO: save to persistent data
    }
}
