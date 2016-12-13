package com.example.luliz.recyclerview;

/**
 * Created by LuLiz on 12/12/2016.
 */

public class cube {
   

    private int imagen;
    private int imagen2;
    private String nombre;
    private String nombre2;
    private String lugar;
    private int imagen3;

    public cube(int imagen, int imagen2, String nombre, String lugar, int imagen3) {
        this.imagen = imagen;
        this.imagen2=imagen2;
        this.nombre = nombre;
        this.lugar=lugar;
        this.imagen3=imagen3;
    }

    public int getImagen3() {
        return imagen3;
    }

    public void setImagen3(int imagen3) {
        this.imagen3 = imagen3;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getImagen2() {
        return imagen2;
    }

    public void setImagen2(int imagen2) {
        this.imagen2 = imagen2;
    }

    public int getImagen() {
        return imagen;
    }


    public String getNombre() {
        return nombre;
    }
    
    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getimagen(int i) {
        return imagen;
    }

    public int getimagen2(int i) {
        return imagen2;
    }


}
