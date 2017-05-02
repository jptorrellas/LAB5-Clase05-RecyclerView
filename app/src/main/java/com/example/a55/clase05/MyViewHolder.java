package com.example.a55.clase05;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by A55 on 30/04/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements IItem {

    TextView txtNombre;
    TextView txtApellido;

    int posicion;

    MyListener listener;


    public MyViewHolder(View itemView) {
        super(itemView);
        //De esta manera solamente voy a hacer tantos findViewById como objetos cree y no cada vez que lo llame. Asi se llaman una sola vez y no siempre.
        this.txtNombre = (TextView) itemView.findViewById(R.id.txtNombre);
        this.txtApellido = (TextView) itemView.findViewById(R.id.txtApellido);

        this.posicion = 0;

        MyListener listener = new MyListener(this);
        itemView.setOnClickListener(listener);
    }

    //Mi método de mi interface
    @Override
    public void mostrarPosicion(View v) {
        Log.d("POSICION DE ELEMENTO: ", "" + this.posicion);
    }
}
