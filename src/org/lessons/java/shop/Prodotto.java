package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    Random random = new Random();
    public int code = random.nextInt(10);
    public String name;
    public String nametot;
    public String description;
    public float prezzo;
    public float prezzotot;
    public int iva;

    public Prodotto (String name, String description, float prezzo, int iva){
        this.name = name;
        nametot = code + "-" + name; 
        this.description = description;
        this.prezzo = prezzo;
        this.iva = iva;
        prezzotot = iva * prezzo / 100 + prezzo;
    }
}
