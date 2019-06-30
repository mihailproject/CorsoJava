package com.corsoJava;

    public class InstanceOf {
        public static void main(String[] args) {
            String test = "";
            System.out.println(test instanceof String); // <------- ritorna TRUE

            String test2 = null;
            System.out.println(test2 instanceof String); //<------- ritorna FALSE
        }
    }

