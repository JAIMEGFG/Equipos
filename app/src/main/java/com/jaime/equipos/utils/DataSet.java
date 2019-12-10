package com.jaime.equipos.utils;

import com.jaime.equipos.R;

import java.util.ArrayList;

public class DataSet {
    public static DataSet newInstance(){

        DataSet dataSet = new DataSet();

        return dataSet;

    }

    public ArrayList listaEquiposLiga(){

        ArrayList<Equipos> lista = new ArrayList<>();

        lista.add(new Equipos("FC.Barcelona","CampNou", R.drawable.barsa));
        lista.add(new Equipos("Real Madrid","Bernabeu", R.drawable.madrid));
        lista.add(new Equipos("Atletico de Madrid","CampNou", R.drawable.atletico));
        lista.add(new Equipos("Valencia","Mestalla", R.drawable.valencia));
        lista.add(new Equipos("Sevilla","Sanchez Pijuan", R.drawable.sevilla));
        lista.add(new Equipos("Getafe","Alfonso Perez", R.drawable.getafe));
        lista.add(new Equipos("Leganes","Butarque", R.drawable.leganes));
        return lista;
    }

    public ArrayList listaEquiposPremier(){
        ArrayList<Equipos> lista = new ArrayList<>();
        lista.add(new Equipos("M. City","Etihad Stadium", R.drawable.city));
        lista.add(new Equipos("Liverpool","Anfiled", R.drawable.liverpool));
        lista.add(new Equipos("Manchester United","Old Traford", R.drawable.manchester));
        lista.add(new Equipos("Everton","Goodison", R.drawable.everton));
        lista.add(new Equipos("Leicester","King Power Stadium", R.drawable.leices));
        lista.add(new Equipos("Chelsea","Stanford Bridge", R.drawable.chelsea));
        return lista;
    }

    public ArrayList listaEquiposItalia(){
        ArrayList<Equipos> lista = new ArrayList<>();
        lista.add(new Equipos("Juventus","Etihad Stadium", R.drawable.juventus));
        lista.add(new Equipos("Milan","Old Traford", R.drawable.milan));
        lista.add(new Equipos("Inter","Goodison", R.drawable.inter));
        return lista;
    }

    public ArrayList listaLigasEuropa(){
        ArrayList<Ligas> lista = new ArrayList<>();
        lista.add(new Ligas("LIGA SANTANDER",R.drawable.laliga,listaEquiposLiga()));
        lista.add(new Ligas("PREMIER LEAGUE",R.drawable.premiere,listaEquiposPremier()));
        lista.add(new Ligas("CALCIO SERIE A",R.drawable.calcio,listaEquiposItalia()));
        return lista;
    }
    public ArrayList jugadoresMadrid(){
        ArrayList<Jugadores> lista = new ArrayList<>();
        lista.add(new Jugadores("Alphonse  Areola",true));
        lista.add(new Jugadores("Thibaut Courtois",true));
        lista.add(new Jugadores("Daniel Carvajal",false));
        lista.add(new Jugadores("Eder Militao",false));
        lista.add(new Jugadores("Sergio Ramos",false));
        lista.add(new Jugadores("Rafael Varane",false));
        lista.add(new Jugadores("Marelo Vieira",false));
        lista.add(new Jugadores("Álvaro Odriozola",false));
        lista.add(new Jugadores("Ferd Mendy",false));
        lista.add(new Jugadores("Tony Kroos",false));
        lista.add(new Jugadores("Luka Modric",false));
        lista.add(new Jugadores("Carlos Casemiro",false));
        lista.add(new Jugadores("Fede Valverde",false));
        lista.add(new Jugadores("James Rodriguez",false));
        lista.add(new Jugadores("Francisco Alarcón",false));
        lista.add(new Jugadores("Eden Hazard",false));
        lista.add(new Jugadores("Karim Bencema",false));
        lista.add(new Jugadores("Gareth Bale",false));
        lista.add(new Jugadores("Lucas Vázquez",false));
        lista.add(new Jugadores("Luka Jóvic",false));
        lista.add(new Jugadores("Marco Asensio",false));
        lista.add(new Jugadores("Brahim Diaz",false));
        lista.add(new Jugadores("Vinicius Junior ",false));
        lista.add(new Jugadores("Rodrygo Goes",false));

        return lista;
    }

}
