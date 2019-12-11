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

        lista.add(new Equipos("FC.Barcelona","CampNou", R.drawable.barsa,null));
        lista.add(new Equipos("Real Madrid","Bernabeu", R.drawable.madrid,null));
        lista.add(new Equipos("Atletico de Madrid","CampNou", R.drawable.atletico,null));
        lista.add(new Equipos("Valencia","Mestalla", R.drawable.valencia,null));
        lista.add(new Equipos("Sevilla","Sanchez Pijuan", R.drawable.sevilla,null));
        lista.add(new Equipos("Getafe","Alfonso Perez", R.drawable.getafe,null));
        lista.add(new Equipos("Leganes","Butarque", R.drawable.leganes,null));
        return lista;
    }

    public ArrayList listaEquiposPremier(){
        ArrayList<Equipos> lista = new ArrayList<>();
        lista.add(new Equipos("M. City","Etihad Stadium", R.drawable.city,null));
        lista.add(new Equipos("Liverpool","Anfiled", R.drawable.liverpool,null));
        lista.add(new Equipos("Manchester United","Old Traford", R.drawable.manchester,null));
        lista.add(new Equipos("Everton","Goodison", R.drawable.everton,null));
        lista.add(new Equipos("Leicester","King Power Stadium", R.drawable.leices,null));
        lista.add(new Equipos("Chelsea","Stanford Bridge", R.drawable.chelsea,null));
        return lista;
    }

    public ArrayList listaEquiposItalia(){
        ArrayList<Equipos> lista = new ArrayList<>();
        lista.add(new Equipos("Juventus","Etihad Stadium", R.drawable.juventus,null));
        lista.add(new Equipos("Milan","Old Traford", R.drawable.milan,null));
        lista.add(new Equipos("Inter","Goodison", R.drawable.inter,null));
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
        lista.add(new Jugadores("Alphonse  Areola",true,R.drawable.areola));
        lista.add(new Jugadores("Thibaut Courtois",true,R.drawable.areola));
        lista.add(new Jugadores("Daniel Carvajal",true,R.drawable.areola));
        lista.add(new Jugadores("Eder Militao",false,R.drawable.areola));
        lista.add(new Jugadores("Sergio Ramos",false,R.drawable.areola));
        lista.add(new Jugadores("Rafael Varane",false,R.drawable.areola));
        lista.add(new Jugadores("Marelo Vieira",false,R.drawable.areola));
        lista.add(new Jugadores("Álvaro Odriozola",false,R.drawable.areola));
        lista.add(new Jugadores("Ferd Mendy",false,R.drawable.areola));
        lista.add(new Jugadores("Tony Kroos",false,R.drawable.areola));
        lista.add(new Jugadores("Luka Modric",false,R.drawable.areola));
        lista.add(new Jugadores("Carlos Casemiro",false,R.drawable.areola));
        lista.add(new Jugadores("Fede Valverde",false,R.drawable.areola));
        lista.add(new Jugadores("James Rodriguez",false,R.drawable.areola));
        lista.add(new Jugadores("Francisco Alarcón",false,R.drawable.areola));
        lista.add(new Jugadores("Eden Hazard",false,R.drawable.areola));
        lista.add(new Jugadores("Karim Bencema",false,R.drawable.areola));
        lista.add(new Jugadores("Gareth Bale",false,R.drawable.areola));
        lista.add(new Jugadores("Lucas Vázquez",false,R.drawable.areola));
        lista.add(new Jugadores("Luka Jóvic",false,R.drawable.areola));
        lista.add(new Jugadores("Marco Asensio",false,R.drawable.areola));
        lista.add(new Jugadores("Brahim Diaz",false,R.drawable.areola));
        lista.add(new Jugadores("Vinicius Junior ",false,R.drawable.areola));
        lista.add(new Jugadores("Rodrygo Goes",false,R.drawable.areola));

        return lista;
    }



}
