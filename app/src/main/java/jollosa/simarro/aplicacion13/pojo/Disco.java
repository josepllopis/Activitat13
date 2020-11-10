package jollosa.simarro.aplicacion13.pojo;

import java.util.ArrayList;

public class Disco {
    private String nombre;
    private ArrayList<Cancion> canciones;

    public Disco(String nombre,ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "nombre='" + nombre + '\'' +
                ", canciones=" + canciones +
                '}';
    }
}
