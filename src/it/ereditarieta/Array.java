package it.ereditarieta;

public class Array {

//----------------------------Crea Array
        public double[] generaArrayDiDouble ( int dimensione){

            double[] arrayDiDouble = new double[dimensione];

            for (int i = 0; i < arrayDiDouble.length; i++) {
                //scrivo un volore nel array
                arrayDiDouble[i] = Math.random (); }
        return arrayDiDouble;
        }
//-----------------------Array Multidimensionale
        public void arrayMultidimensionale(){
            int[][] matrice = new int [10][10];

            for (int i = 0; i<matrice.length; i++){
                for (int j =0; j<matrice[i].length; j++){
            matrice[i][j]=i+j;}}

            for (int i = 0; i<matrice.length; i++){
                for (int j =0; j<matrice[i].length; j++){
                    System.out.println ( matrice[i][j] );
                }}}


//------------------------------------------
    public static void main(String[] args) {
        Array a = new Array();
        double[] arrayDiDouble = a.generaArrayDiDouble ( 10 );
//-------------------------------leggi array
        for (int i=0; i<arrayDiDouble.length; i++) System.out.println ( "Elemento " +i+" dell' array è:"+arrayDiDouble[i]);
//--------------------------------New Array
        int [] numeri =new int[4]; //definizione e inizializzazione
        numeri[0]=1;
        numeri[1]=2;
        numeri[2]=3;
        numeri[3]=4;
        //New array con ITERAZIONE
        for (int i =0; i<numeri.length; i++) {
         numeri[i]=0+i;}}}
