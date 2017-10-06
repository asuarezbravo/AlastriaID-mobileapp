package io.alastria.alastriaid.modelo;

/**
 * Created by Alvaro Suarez on 06/10/2017.
 */

public class Persona {
    private String mEmail;
    private String mNombre;
    private String mApellidos;
    private String mTelefono;
    private String mDNI;

    public Persona() {
    }

    public Persona(String email, String nombre, String apellidos, String telefono, String dni) {
        mEmail = email;
        mNombre = nombre;
        mApellidos = apellidos;
        mTelefono = telefono;
        mDNI = dni;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getNombre() {
        return mNombre;
    }

    public void setNombre(String nombre) {
        mNombre = nombre;
    }

    public String getApellidos() {
        return mApellidos;
    }

    public void setApellidos(String apellidos) {
        mApellidos = apellidos;
    }

    public String getTelefono() {
        return mTelefono;
    }

    public void setTelefono(String telefono) {
        mTelefono = telefono;
    }

    public String getDNI() {
        return mDNI;
    }

    public void setDNI(String dni) {
        mDNI = dni;
    }
}
