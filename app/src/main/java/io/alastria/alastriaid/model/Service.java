package io.alastria.alastriaid.model;

/**
 * Created by Alvaro Suarez on 11/10/2017.
 */

public class Service {

    private String mName;
    private int mImageResourceId;

    public Service(){}

    public Service(String name, int imageResourceId) {
        mName = name;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }
}
