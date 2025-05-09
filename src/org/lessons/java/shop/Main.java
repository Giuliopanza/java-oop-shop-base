/*
Nel progetto java-oop-shop, package org.lessons.java.shop,
creare la classe Prodotto che gestisce i prodotti dello shop. 

Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva

Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base 
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte
le funzionalità della classe Prodotto. 
*/
package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {
        Prodotto Latte = new Prodotto("latte", "da bere", 6.5f, 10);
        System.out.println(Latte.prezzotot);
        System.out.println(Latte.nametot);
        Prodotto Miele = new Prodotto("miele", "da mangiare", 6.5f, 10);
        System.out.println(Miele.prezzotot);
        System.out.println(Miele.nametot);

    }

}
