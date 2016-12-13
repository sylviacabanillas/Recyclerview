package com.example.luliz.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by LuLiz on 12/12/2016.
 */
public class CubeAdapter extends RecyclerView.Adapter<CubeAdapter.CubeViewHolder> {

    private List<cube> items;



    public static class CubeViewHolder extends RecyclerView.ViewHolder {
        public static ImageView imagen;
        public TextView nombre;
        public ImageView imagen2;
        public TextView lugar;
        public ImageView imagen3;

        public CubeViewHolder(View itemView, ImageView imagen, TextView nombre, ImageView imagen2, TextView lugar, ImageView imagen3) {
            super(itemView);
            this.imagen = imagen;
            this.nombre = nombre;
            this.imagen2 = imagen2;
            this.lugar = lugar;
            this.imagen3 = imagen3;
        }


        public void setImagen3(ImageView imagen3) {
            this.imagen3 = imagen3;
        }

        public CubeViewHolder(View v){
            super(v);
            imagen=(ImageView)v.findViewById(R.id.imagen);
            imagen2=(ImageView) v.findViewById(R.id.imagen2);
            nombre=(TextView) v.findViewById(R.id.nombre);
            lugar=(TextView) v.findViewById(R.id.lugar);
            imagen3=(ImageView) v.findViewById(R.id.imagen3);

        }

    }

    public CubeAdapter(List<cube> items){

        this.items=items;
    }
    @Override
    public int getItemCount(){
        return items.size();
    }
    @Override
    public CubeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cube_card,viewGroup,false);
        return new CubeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CubeViewHolder viewHolder, final int i){
        viewHolder.imagen.setImageResource(items.get(i).getimagen(i));
        viewHolder.nombre.setText(items.get(i).getNombre());

        viewHolder.imagen2.setImageResource(items.get(i).getimagen2(i));

        viewHolder.lugar.setText(items.get(i).getLugar());
        viewHolder.imagen3.setImageResource(items.get(i).getImagen3());

        CubeViewHolder.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* Toast toast = Toast.makeText(this,"Mensaje 1", Toast.LENGTH_SHORT);
                toast.show();*/
            }
        });



    }

}
