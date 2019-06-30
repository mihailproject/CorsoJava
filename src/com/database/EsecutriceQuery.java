package com.database;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class EsecutriceQuery {


        public static void main(String[] args) {
            Properties properties= new Properties();
         //   Query q = new Query();

         //   try {
       //         //q.esInsert("Mark","Rolley","mark@gmail.com","3445345345");
      //          //q.esUpdate();
     //           q.esSelect();
    //        }
   //         catch (SQLException | IOException e){
   //             e.printStackTrace();
  //          }
            try {

            SelectAll selectall=new SelectAll ();

            List<Client> clients = selectall.queryClient ();




            if (clients ==null){
                System.out.println (" No Contact in Database ");
            }

                for (Client c: clients) {

                   // properties.setProperty("ID: ", new Integer (c.getId()).toString ());
                    properties.setProperty("Cognome", c.getCognome ());
                    properties.setProperty("Nome", c.getNome ());
                    properties.setProperty("Email", c.getEmail ());
                    properties.setProperty("Telefono", c.getTelefono ());


                }
                FileOutputStream f= new FileOutputStream("src/com/database/resultdatabase.properties");

                properties.store(f,null);


            clients.forEach (s-> {
                System.out.println ("ID: "+ s.getId ());
                System.out.println ("Cognome:"+ s.getCognome ());
                System.out.println ("Nome:"+ s.getNome ());
                System.out.println ("Email:"+ s.getEmail ());
                System.out.println ("Telefono:"+ s.getTelefono ());
            });

            }
                     catch ( IOException e){
                       e.printStackTrace();
                      }



            }

        }







