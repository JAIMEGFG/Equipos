package com.jaime.equipos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.jaime.equipos.adaptadores.AdaptadorEquipos;
import com.jaime.equipos.adaptadores.AdaptadorJugadores;
import com.jaime.equipos.adaptadores.AdaptadorLigas;
import com.jaime.equipos.utils.DataSet;
import com.jaime.equipos.utils.Equipos;
import com.jaime.equipos.utils.Jugadores;
import com.jaime.equipos.utils.Ligas;

import java.util.ArrayList;

public class LigasActivity extends AppCompatActivity implements AdaptadorLigas.OnMiRecyclerListener,
        AdaptadorEquipos.OnMiRecyclerListener,AdapterView.OnItemClickListener {

    RecyclerView recyclerEquipos;
    RecyclerView recyclerLigas;
    AdaptadorLigas adaptadorligas;
    AdaptadorEquipos adaptadorEquipos;
    AdaptadorJugadores adaptadorJugadores;
    ArrayList<Equipos> listaEquipos;
    ArrayList<Equipos> listaInglatera;
    ArrayList<Equipos> listaItalia;
    ArrayList<Ligas> listaLigas;
    Context context;
    final static String TAG_1="Objeto";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligas);
        instancias();
        rellenarRecyclerLigas();
        rellenarRecyclerEquipos();

        acciones();

    }

    private void acciones() {
    }

    private void rellenarRecyclerEquipos() {
        recyclerEquipos.setAdapter(adaptadorEquipos);
        adaptadorEquipos.notifyDataSetChanged();
        recyclerEquipos.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    private void rellenarRecyclerLigas() {
        recyclerLigas.setAdapter(adaptadorligas);
        adaptadorligas.notifyDataSetChanged();
        recyclerLigas.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
    }


    private void instancias() {
        recyclerEquipos = findViewById(R.id.layout_Equipos);
        recyclerLigas = findViewById(R.id.layout_Ligas);
        listaLigas = DataSet.newInstance().listaLigasEuropa();

        listaEquipos = DataSet.newInstance().listaEquiposLiga();

        adaptadorEquipos = new AdaptadorEquipos(LigasActivity.this,listaEquipos);
        adaptadorligas = new AdaptadorLigas(LigasActivity.this,listaLigas);



    }



    @Override
    public void onMiRecycler(Ligas ligas) {
        adaptadorEquipos = new AdaptadorEquipos(LigasActivity.this, ligas.getLigasEquipos());
        recyclerEquipos.setAdapter(adaptadorEquipos);
        adaptadorEquipos.notifyDataSetChanged(); 

    }

    @Override
    public void onMiRecycler(Equipos equipos) {
        adaptadorJugadores = new AdaptadorJugadores(JugadoresActivity.this, Equipos.getLigasJugadores());
        recycler.setAdapter(adaptadorEquipos);
        adaptadorEquipos.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
