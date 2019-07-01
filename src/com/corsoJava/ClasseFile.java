package com.corsoJava;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


 class ClasseFile {
//    public static void main(String[] args) {
//
//        ClasseFile c = new ClasseFile();
//        String dir = "C:\\test-dir";
//        c.creadDiscovery(dir);
//
//        String file="C:\\test-dir\\txt.txt";
//        c.createFile(file);
//
////----- Istance of FILE Class
//        File d = new File(dir);
//        File f=new File(file);
//
//        System.out.println("--------Controlla se esiste il file------------"+f.isFile());
//        System.out.println("--------Controlla se esiste il la cartella-----"+d.isDirectory());
//
//        //  Lista dei file in array
//        File [] filees = d.listFiles();
//        for (int i =0; i<filees.length; i++) {
//            File n = filees[i];
//            System.out.println(n.getName());
//        }
//
//        // Lista dei file in array
//        ArrayList files = new ArrayList<>();
//        files.add(d.listFiles());
//
//        for (int i =0; i<filees.length; i++) {
//            File n = filees[i];
//            System.out.println("Nome File+"+n.getName());
//            /*Secondo definizione standard per 1 KB = 1000 byte*/
//            System.out.println("La Dimensione del File="+n.length()/1000000+"MB");
//        }
//
//
//    }
// Crea file
    public void createFile(String path) {
        File f = new File(path);

        if (!f.exists()) {
            try {

                f.createNewFile();
                System.out.println("File"+ path+"creato");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
// Crea Cartella
    public void creadDiscovery(String path) {
        File d = new File(path);
        if (!d.exists()) {

            d.mkdir();
            System.out.printf("Directory Creata");
        }

    }


//write file



}
