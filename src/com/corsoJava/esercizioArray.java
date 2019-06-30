package com.corsoJava;

public class esercizioArray {
    public static void main(String[] args) {

        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14,21 };

        int[] frequency = new int[ 6 ]; // array of frequency counters

          int [] provs = new int [10];


          System.out.println("-----------------------"+provs[5]);


        for ( int i = 0; i < responses.length; i++ ){

            try{

                ++frequency[ responses[ i ]];

            }

            catch ( ArrayIndexOutOfBoundsException e)

            {

                System.out.println(e);

                System.out.printf( "responses[%d] = %d\n\n",

                        i, responses[i]);

            }
        }

        System.out.printf( "%s%10s\n", "Rating", "Frequency" );

// output each array element's value
        for ( int j = 1; j < frequency.length; j++ )
            System.out.printf( "%6d%10d\n", j, frequency[ j ] );
    }
}
