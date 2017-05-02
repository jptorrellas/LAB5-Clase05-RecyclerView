package com.example.a55.clase05;

import android.support.v7.widget.RecyclerView.Adapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;




/**
 * Created by A55 on 30/04/2017.
 */

public class MyAdapter extends Adapter<MyViewHolder> {

    private List<Persona> lista;

    //variables para testear
    public int create;
    public int bind;
    public int count;

    public MyAdapter(List<Persona> lista)
    {
        this.lista  = lista;

        this.create = 0;
        this.bind   = 0;
        this.count  = 0;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        Log.d("ATENCION: ", "ENTRO AL onCreateViewHolder() " + create++);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Persona p = lista.get(position);
        holder.txtNombre.setText(p.getNombre());
        holder.txtApellido.setText(p.getApellido());

        //Guarda la posicion en el holder
        holder.posicion = position;
        Log.d("ATENCION: ", "ENTRO AL onBindViewHolder( )"+ bind++);
    }

    @Override
    public int getItemCount() {
        Log.d("ATENCION: ", "ENTRO AL getItemCount() "+ count++);
        return this.lista.size();
    }


}


