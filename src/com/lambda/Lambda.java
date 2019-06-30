package com.lambda;



public class   Lambda {

    //Funzione lambda  funzione senza dichiarazione = senza nome
    //Puo essere passata come argomento di un metodo o in uscita di un metodo
    //ha senza quando vinene utilizzata solo una volta
    //gestische meglio le liste

    // un interfaccia funzionale  eun interfaccia che definisce un solo metodo
    //puo essere usata labda per implimentare il suo metodo

    public static void main(String[] args) {
// o creato utilizzando linterfaccia funzionale un oggetto rettangolo assegnandole funzione lambda

        FormaGeometrica Rettangolo =(a,b) -> a * b;
        Rettangolo.calcolaArea(3 , 4);
        System.out.println(Rettangolo.calcolaArea(3 , 4));
        //----oppure
        Rettangolo r = new Rettangolo();
        r.calcolaArea(3,4);
        System.out.println( r.calcolaArea(3,4));
    }


}
