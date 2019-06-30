package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lettura {

    public static void main(String[] args) {

    }

    public void esempioFileReader (String filePath){
        File f = new File(filePath);

        if (f.exists()){
            try {
                FileReader fr = new FileReader(f);
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            finally {

            }
        }
    }

}
