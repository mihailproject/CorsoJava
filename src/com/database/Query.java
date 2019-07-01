package com.database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Query {

    private static final String COLUMN_ID="id";
    private static final String COLUMN_COGNOME="cognome";
    private static final String COLUMN_NOME="nome";
    private static final String COLUMN_EMAIL="email";
    private static final String COLUMN_TELEFONO="telefono";


    Database d = new Database();



    ///---------------------------------------------------------------------------------------------------------
    public void esInsert(String nome, String cognome, String email, String telefono) throws SQLException, IOException {
        String sql = "INSERT INTO client(nome, cognome, email,telefono)" +
                "VALUE('" + nome + "','" + cognome + "','" + email + "','" + telefono + "')";
        PreparedStatement ps = d.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        rs.next(); //per scorrere l'elemento , accedere al primo elemento
        System.out.println("ID è : " + rs.getInt(1));
    }

    ///-------------------------------------esSelect-----------------------------------------------------------
    public void esSelect() throws SQLException, IOException {

        String sql = "SELECT* FROM client";
        //passare in input la query in modo da poterle utilizzare

        PreparedStatement ps = d.getConnection().prepareStatement(sql); //configurare la query da eseguire
        //ps return un oggetto ResultSet;
        //Interfaccia metododel interf =
        ResultSet rs = ps.executeQuery(); //metodo di pepS per eseguire le querry

        int columnCount = rs.getMetaData().getColumnCount(); ///lunghezza colonne

//        List<Object> row = new ArrayList<>();
//        while (rs.next()) {
//
//            for (int i = 1; i <= columnCount; i++) {
//                row.add(rs.getObject(i));
//            }
//        }
////         row.forEach(  (s)->{
////                    System.out.printf(  s+ "\n " );
////                });
//
//        String string= row.toString();
//        System.out.printf(string);
//
//                Properties properties= new Properties();
//                FileOutputStream f= new FileOutputStream("src/com/database/resultdatabase.properties");
//
//            properties.store(f,null);
//        properties.setProperty("querry =", "2342342");
//
//




        while (rs.next()) {   //ResultSet
                ///prova---------------------------------------------------------
                Properties properties= new Properties();
                FileOutputStream f= new FileOutputStream("src/com/database/resultdatabase.properties");

            properties.store(f,null);
//---------------------------------------------------------------
//**************
            properties.setProperty("id = " ,       Integer.toString(rs.getInt(1)));
            properties.setProperty("Nome = " ,     rs.getString(2));
            properties.setProperty("Cognome = " ,  rs.getString(3));
            properties.setProperty("Email = " ,    rs.getString(4));
            properties.setProperty("Telefono = " , rs.getString(5));
//**************
//            System.out.println("*****************************************************************");
//            System.out.println("id = " + rs.getInt(1));
//            System.out.println("Nome = " + rs.getString(2));
//            System.out.println("Cognome = " + rs.getString(3));
//            System.out.println("Email = " + rs.getString(4));
//            System.out.println("Telefono = " + rs.getString(5));
//            System.out.println("*****************************************************************");
        }
    }
///----------------------------------esUpdate--------------------------------------------------------------------------
     public void esUpdate() throws SQLException,  IOException{
        String sql = "UPDATE client SET telefono ='234234234' WHERE id = 2";

         PreparedStatement ps = d.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         ps.executeUpdate();

     }
///-------------------------------------esDelete_id--------------------------------------------------------------------
    //prevent attacchi SQL injection with prepared Statment ?
     public void esDelete_id(int id) throws SQLException, IOException{
        String sql = "DELETE FROM  client WHERE id= ?";

         PreparedStatement ps = d.getConnection().prepareStatement(sql);
         ps.setInt(1,id);
         ps.executeUpdate();
         /*I parametri in a PreparedStatementsono numerati da 1, non da 0, quindi l'utilizzo di qualsiasi metodo "set" di a PreparedStatementcon
         un numero minore di 1 è un bug, poiché utilizza un indice più alto del numero di parametri.
                 Allo stesso modo, gli ResultSetindici iniziano anche da 1, anziché da 0*/
         //https://rules.sonarsource.com/java/RSPEC-2695
     }
     }



