package com.example.a55.clase05;

import android.view.View;

/**
 * Created by A55 on 30/04/2017.
 */

public class MyListener implements View.OnClickListener {

    private IItem iItem;

    public MyListener(IItem iItem) {
        this.iItem = iItem;
    }

    public void onClick(View v) {
        this.iItem.mostrarPosicion(v);
    }
}
