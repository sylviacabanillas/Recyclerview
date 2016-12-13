package com.example.luliz.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.appcompat.R.id.info;
import static com.example.luliz.recyclerview.R.styleable.MenuItem;

public class MainActivity extends AppCompatActivity {
TextView info;
    //1 creo las variables
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager Imanager;


    public boolean onCreateOptionsMenu(Menu menu){
        //inflar el menu y agregar los elementos
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        Context context=getApplicationContext();
        CharSequence text =null;
        int duracion=Toast.LENGTH_SHORT;

        if (id==R.id.action_1){
            /*text="opcion1";
            Toast toast=Toast.makeText(context,text,duracion);
            toast.show();*/
            Intent pantalla2 =new Intent( MainActivity.this, pantalla2.class);
            startActivity(pantalla2);
        }

        return true;

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info =(TextView)findViewById(R.id.info);

//anexar la toolbar dentro de java
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       toolbar.setTitle("Petagram");
        toolbar.setLogo(R.drawable.huellita);
        toolbar.setLogoDescription(getResources().getString(R.string.app_name));





        //2 crear la lista
        List<cube> items=new ArrayList<>();
        //3 Meter los elementos al array
        items.add(new cube(R.drawable.perro1,R.drawable.huesitoblanco,"Lazy","1",R.drawable.huesitoamarillo));
        items.add(new cube(R.drawable.perro2,R.drawable.huesitoblanco,"Coral","2",R.drawable.huesitoamarillo));
        items.add(new cube(R.drawable.perro3,R.drawable.huesitoblanco,"Peluchin","3",R.drawable.huesitoamarillo));
        items.add(new cube(R.drawable.perro4,R.drawable.huesitoblanco,"Pandora","4",R.drawable.huesitoamarillo));
        items.add(new cube(R.drawable.perro5,R.drawable.huesitoblanco,"Muñeco","5",R.drawable.huesitoamarillo));
        items.add(new cube(R.drawable.perro6,R.drawable.huesitoblanco,"Paquito","6",R.drawable.huesitoamarillo));
        items.add(new cube(R.drawable.perro7,R.drawable.huesitoblanco,"Corajito","7",R.drawable.huesitoamarillo));

        //3 obtener el recycler
        recycler=(RecyclerView)findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        Imanager=new LinearLayoutManager(this);
        recycler.setLayoutManager(Imanager);


        adapter = new CubeAdapter(items);
        recycler.setAdapter(adapter);




    }


}
