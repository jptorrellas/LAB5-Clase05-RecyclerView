package com.example.a55.clase05;

import android.view.View;

/**
 * Created by A55 on 30/04/2017.
 */

public class MyListener implements View.OnClickListener {

    private IItem iItem;
    public  int position;

    public MyListener(IItem iItem, int position) {
        this.iItem = iItem;
        this.position = position;
    }

    public void onClick(View v) {
        this.iItem.mostrarPosicion(v, this.position);
    }
}
