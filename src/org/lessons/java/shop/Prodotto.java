package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int code;
    private String name;
    private String description;
    private float prezzo;
    private int iva;
    

    public Prodotto (String name, String description, float prezzo, int iva){
        Random random = new Random();
        this.code = random.nextInt(999);
        this.name = name;
        this.description = description;
        this.prezzo = prezzo;
        this.iva = iva;

    }

    public int getCode (){
        return this.code;
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name=name;
    }

    public String getDescription (){
        return description;
    }

    public void setDescription (String description){
        this.description=description;
    }

    public float getPrezzo (){
        return prezzo;
    }

    public void setPrezzo (float prezzo){
        this.prezzo=prezzo;
    }

    public int getIva (){
        return iva;
    }

    public void setIva (int iva){
        this.iva=iva;
    }
}
