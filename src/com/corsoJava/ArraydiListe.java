package com.corsoJava;
import java.util.ArrayList;
import  java.util.List;
import com.corsoJava.*;


public class ArraydiListe {
    public static void main(String[] args) {
        ArraydiListe a = new ArraydiListe();
        a.esempioArrayList();}

 public void esempioArrayList(){
   List<String> lista = new ArrayList<String>();   //definirlo e instanziarlo con arrayList
        //   ArrayList<String> lista2 = new ArrayList<String>();//equvalente al primo

        lista.add("Ciao1");
        lista.add("Ciao2");
        lista.add("Ciao3");
        lista.add("Ciao4");
        lista.add("Ciao5");

        lista.add(2,"L'ultimo agg");

         for(String string: lista){
            System.out.println(string);
        }

         lista.remove(2);

        for(String string: lista){
            System.out.println(string);
        }

  lista.set(1,"sostituito");      //sostituisce
  System.out.println(lista.size());// la grandezza
  System.out.println(lista.isEmpty());//true se la lista e vuota
  System.out.println("E stata sostituita n "+lista.indexOf("sostituito"));
  System.out.println(lista.toString());//array sotto forma di stringa

           //String[] listaArray = (String) lista.toArray();
             String[] listaArray = lista.toArray(new String[lista.size()]);

          for (String aliste: listaArray );

//        List<SecondaClasse> lista3 = new ArrayListe<SecondaClasse>();
//
//        SecondaClasse sm = new SecondaClasse();
//        sm.setNome("Apple");
//        sm.setModello("iPhone");
//
//        lista3.add(sm);

    }
}
