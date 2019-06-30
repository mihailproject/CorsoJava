package org.liste.iterator.list.forE.Lampda;

import java.util.ArrayList;
import java.util.List;
import java.lang.Iterable;
import java.util.Iterator;

public class Settimana {
    public static void main(String[] args) {

        List<String> lista= new ArrayList<>();
        lista.add("Lunedi");
        lista.add("Martedi");
        lista.add("Mercoledi");
        lista.add("Giovedi");
        lista.add("Venerdi");
        lista.add("Sabato");
        lista.add("Domenica");



        //--iterator
        Iterator<String> ite = lista.iterator();   //sto dichiarando iterator come generico

        // while(ite.hasNext())
            //{
           // if (ite.next().equals("Domenica"))
          //{ite.remove();}
         //}
        //------
        while (ite.hasNext()) {
            String string = ite.next();
            System.out.println("***ITERATOR***" + string);
        }
 //System.out.print(lista);

//---   INTERFACCIA ITERABLE JAVA forEach

        lista.forEach(  (s)->{
                            System.out.printf(  s+ "---LAMPDA----\n" );
                             }
                     );

        lista.forEach( System.out::println);  // Reference method











    }
}
