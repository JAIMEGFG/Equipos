package com.jaime.equipos.adaptadores;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jaime.equipos.R;
import com.jaime.equipos.utils.Jugadores;

import java.util.List;

public class AdaptadorJugadores extends RecyclerView.Adapter<AdaptadorJugadores.HolderAdapterPropio> {
    Context contexto;
    List<Jugadores> listaJugadores;

    public AdaptadorJugadores(Context contexto, List listaJugadores) {
        this.contexto = contexto;
        this.listaJugadores = listaJugadores;
    }

    //Crea el contenedor que sirve para rellenar las filas.
    @NonNull
    @Override
    public AdaptadorJugadores.HolderAdapterPropio onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.recycler_jugadores,parent,false);
        return new HolderAdapterPropio(view);
    }

    //Retorna el numero de elementos
    @Override
    public void onBindViewHolder(@NonNull AdaptadorJugadores.HolderAdapterPropio holder, int position) {
        final Jugadores actual = (listaJugadores.get(position));
        holder.getNombre().setText(actual.getNombre());
        //como sacar un color si aqui no hay getResources

        if (!actual.isEstrellaJugador())
            holder.getEstrella().setVisibility(View.INVISIBLE);

    }
    @Override
    public int getItemCount() {
        return listaJugadores.size();
    }

    class HolderAdapterPropio extends RecyclerView.ViewHolder{
        private ImageView estrella;
        private TextView nombre;


        public HolderAdapterPropio(@NonNull View itemView) {
            super(itemView);
            estrella = itemView.findViewById(R.id.estrella_jugador);
            nombre = itemView.findViewById(R.id.nombre_jugador);

        }
        public Layout getLayout(){
            return getLayout();
        }


        public void setEstrella_(ImageView estrella) {
            this.estrella = estrella;
        }

        public void setNombre(TextView nombre) {
            this.nombre = nombre;
        }


        public ImageView getEstrella() {
            return estrella;
        }

        public TextView getNombre() {
            return nombre;
        }

    }

}


