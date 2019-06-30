package com.polimorfismoperdati;

import java.util.ArrayList;
import java.util.List;

public class SorgenteDati {


    public void esempioArrayList() {
        Component comp = new Component();

        PrimaS p = new PrimaS();
        SecS s = new SecS();

        List<Component> lista = new ArrayList<>();    //definirlo e instanziarlo con arrayList

        lista.add(s);
        lista.add(p);

        lista.get(1).metodo1();

        for (int i=0; i<lista.size(); i++) {
             comp = lista.get(i);

             comp.unico();
        }






    }

}
