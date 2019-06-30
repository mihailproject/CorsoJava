package com.corsoJava;

import java.lang.reflect.Method;

public class GetObject {
    public static void main(String[] args) {
        GetObject m;
        m = new GetObject();
        m.stampaInfo();
    }

    public void stampaInfo() {
        System.out.println(getClass().getName());       //<--- ritorna il nome della classe completo di package
        System.out.println(getClass().getSimpleName());// <--- ritorna solo il nome della classe, senza package
        System.out.println("");
        System.out.println("metodi............");
        for(Method m : getClass().getMethods()) {
            System.out.println(m.getName());         //   <--- stampa tutti i metodi della classe e delle sue superclassi (main, converti, stampaInfo, equals, ...)
        }
    }
}