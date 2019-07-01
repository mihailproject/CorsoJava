package com.database;


import java.io.*;
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
  //           }



            try {
                SelectAll selectall = new SelectAll ();

                List<Client> clients = selectall.queryClient ();
               //-----
                WriteQuery fileQ= new WriteQuery();
                fileQ.creadDiscovery();
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(fileQ.getPathFile())));
              //------


                for (Client c: clients) {
                    if (clients ==null){
                        System.out.println (" No Contact in List ");
                        break;
                    }
                    //With a BufferedWriter, these can all be buffered together and as the default buffer size is 8192 characters this become just 1 system call to write.
                    bufferedWriter.write(String.format("%d)%n %s  %s %n Email: %s %n Telefono: %s %n%n", c.getId() ,c.getCognome (),c.getNome (),c.getEmail (),c.getTelefono()));
                }
                bufferedWriter.close();


                if (clients ==null){
                System.out.println (" No Contact in List");
            }

                for (Client c: clients) {

                    properties.setProperty("ID_"+ c.getId() , Integer.toString (c.getId())); //comment perche viene eseguita in ritardo
                    properties.setProperty("Cognome_"+ c.getCognome() , c.getCognome ());
                    properties.setProperty("Nome_"+c.getNome (), c.getNome ());
                    properties.setProperty("Email_"+c.getEmail (), c.getEmail ());
                    properties.setProperty("Telefono_"+c.getTelefono (), c.getTelefono ());
                }

                FileOutputStream f= new FileOutputStream("src/com/database/resultdatabase.properties");

                properties.store(f,null);



                clients.forEach (c-> {
                    System.out.printf("\n %s) %S %S %nEmail: %s  %nTelefono: %s %n%n", c.getId(), c.getCognome(),c.getNome(),c.getEmail(),c.getTelefono());

                });
                System.out.printf("Result ( %d )%n" ,clients.size());
            }

                     catch ( IOException e){
                       e.printStackTrace();
                      }
        }

        }