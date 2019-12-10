package com.jaime.equipos.utils;

public class Jugadores {

    String nombre;
    boolean estrellaJugador;

    public Jugadores( String nombre, boolean estrellaJugador) {
        this.nombre = nombre;
        this.estrellaJugador = estrellaJugador;
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


