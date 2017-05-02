package com.example.a55.clase05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan","Perez"));
        personas.add(new Persona("Pedro","Gonzales"));
        personas.add(new Persona("Carlos","Diaz"));
        personas.add(new Persona("Juan2","Perez2"));
        personas.add(new Persona("Pedro2","Gonzales2"));
        personas.add(new Persona("Carlos2","Diaz2"));
        personas.add(new Persona("Juan3","Perez3"));
        personas.add(new Persona("Pedro3","Gonzales3"));
        personas.add(new Persona("Carlos3","Diaz3"));
        personas.add(new Persona("Juan4","Perez4"));
        personas.add(new Persona("Pedro4","Gonzales4"));
        personas.add(new Persona("Carlos4","Diaz4"));

        RecyclerView list = (RecyclerView)findViewById(R.id.list);

        //Le decimos como presenta la informacion, puede ser grilla, columnas etc.
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //GridLayoutManager layoutManager2 = new GridLayoutManager(this,2);

        list.setLayoutManager(layoutManager);
        //list.setLayoutManager(layoutManager2);

        MyAdapter adapter = new MyAdapter(personas);
        list.setAdapter(adapter);
    }
}
