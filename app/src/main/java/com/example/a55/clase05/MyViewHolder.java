package com.example.a55.clase05;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by A55 on 30/04/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView txtNombre;
    TextView txtApellido;
    int posicion;

    public MyViewHolder(View itemView) {
        super(itemView);
        //De esta manera solamente voy a hacer tantos findViewById como objetos cree y no cada vez que lo llame. Asi se llaman una sola vez y no siempre.
        this.txtNombre = (TextView) itemView.findViewById(R.id.txtNombre);
        this.txtApellido = (TextView) itemView.findViewById(R.id.txtApellido);
        this.posicion = 0;
    }
}
