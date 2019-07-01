package com.database;
import java.io.File;
import java.io.IOException;

public class WriteQuery {

    private static final String PATH_DIR=  "C:\\Users\\ut1080\\IdeaProjects\\Query";
    private static final String PATH_FILE =  "C:\\Users\\ut1080\\IdeaProjects\\Query\\Query.txt";

    public  String getPathFile() {
        return PATH_FILE;
    }


    public  String getPathDir() {
        return PATH_DIR;
    }

    // Crea file
    public void createFile() {  //non viene usato da gestire meglio in esegui query new bufferwriter

        File f = new File(WriteQuery.PATH_FILE);

        if (!f.exists()) {
            try {

                f.createNewFile();
                System.out.printf("Nuovo file creato in: %s \n \n" , WriteQuery.PATH_FILE);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    // Crea Cartella
    public void creadDiscovery() {

        File d = new File(WriteQuery.PATH_DIR);
        if (!d.exists()) {
            d.mkdir();

            System.out.printf("Directory QUERY Creata in:  %s \n \n", WriteQuery.PATH_DIR);
        }


        File [] files = d.listFiles();
        for (int i =0; i<files.length; i++) {
            File n = files[i];
            System.out.printf("Files Found: %s %n  ----%S  %s", files.length, n.getName(),n.length());
        }
    }
}
