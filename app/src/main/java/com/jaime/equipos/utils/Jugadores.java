package com.jaime.equipos.utils;

import android.widget.ImageView;

public class Jugadores {

    String nombre;
    boolean estrellaJugador;
    int fotoJugador;
    String posicion;

    public Jugadores( String nombre, boolean estrellaJugador,int fotoJugador,String posicion) {
        this.nombre = nombre;
        this.estrellaJugador = estrellaJugador;
        this.fotoJugador = fotoJugador;
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getFotoJugador() {
        return fotoJugador;
    }

    public void setFotoJugador(int fotoJugador) {
        this.fotoJugador = fotoJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstrellaJugador() {
        return estrellaJugador;
    }

    public void setEstrellaJugador(boolean estrellaJugador) {
        this.estrellaJugador = estrellaJugador;
    }
}


