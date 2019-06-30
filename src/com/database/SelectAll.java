package com.database;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectAll {
    private static final String COLUMN_ID="id";
    private static final String COLUMN_COGNOME="cognome";
    private static final String COLUMN_NOME="nome";
    private static final String COLUMN_EMAIL="email";
    private static final String COLUMN_TELEFONO="telefono";

     public  List<Client> queryClient(){
         try {
             String sql = "SELECT* FROM client";
             //passare in input la query in modo da poterle utilizzare

             PreparedStatement ps = new Database().getConnection().prepareStatement(sql); //configurare la query da eseguire
             //ps return un oggetto ResultSet;
             //Interfaccia metododel interf =
             ResultSet rs = ps.executeQuery(); //metodo di pepS per eseguire le querry

             List<Client> queryclients = new ArrayList<> (  );
             while (rs.next ())
             {
                 //-------    client
                 Client client = new Client ();
                 client.setId ( rs.getInt ( COLUMN_ID ) );
                 client.setCognome(rs.getString ( COLUMN_COGNOME ));
                 client.setNome(rs.getString ( COLUMN_NOME ));
                 client.setEmail (rs.getString ( COLUMN_EMAIL ));
                 client.setTelefono (rs.getString ( COLUMN_TELEFONO ));
                 queryclients.add ( client );
                 //-------
             }
             return queryclients;




         }catch (SecurityException | SQLException | IOException e){
             System.out.println ( "Queryfailed:  "+ e.getMessage () );
             return null;
         }

     }

}
