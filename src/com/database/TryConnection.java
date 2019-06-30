package com.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TryConnection {
    Connection con;
    Statement statement;

    public static Database database;
    public static void main(String[] args) {

        database = new Database();

        MysqlDataSource ms = new MysqlDataSource();

        //------Prova se sei connesso al database
        try   {


            String s= Boolean.toString(database.getConnection().isClosed());
         //   System.out.printf(" \n " + s.toUpperCase());
            String connessione= s.equals("false")? "Connesso al DataBase": "Connessione Fallita";
            System.out.println("\n"+connessione+"\n");


        } catch (SQLException | IOException e){
            e.printStackTrace();  //stampa le posizioni in cui si è verificata l'eccezione nel codice sorgente

            System.err.println(e.toString());
            System.err.println(e.getMessage());
        }
        //----------------------------------------------
    }
}
