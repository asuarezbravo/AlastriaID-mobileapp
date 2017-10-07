package io.alastria.alastriaid.model;

/**
 * Created by Alvaro Suarez on 06/10/2017.
 */

public class Person {
    private String mEmail;
    private String mFirstName;
    private String mLastName;
    private String mPhoneNumber;
    private String mDNI;

    public Person() {
    }

    public Person(String email, String firstName, String lastName, String phoneNumber, String dni) {
        mEmail = email;
        mFirstName = firstName;
        mLastName = lastName;
        mPhoneNumber = phoneNumber;
        mDNI = dni;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public String getDNI() {
        return mDNI;
    }

    public void setDNI(String dni) {
        mDNI = dni;
    }
}
