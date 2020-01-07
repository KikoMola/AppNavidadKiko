package com.example.appnavidadkiko;

public class gimnasios {
    private int mImagen;
    private String nombre;
    private String URL;

    public gimnasios(int mImagen, String nombre, String URL) {
        this.mImagen = mImagen;
        this.nombre = nombre;
        this.URL = URL;
    }

    public int getmImagen() {
        return mImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getURL() {
        return URL;
    }


}
