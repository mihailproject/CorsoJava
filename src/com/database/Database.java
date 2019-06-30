
//JDBC Architecture
//JDBC Cliet
//JDBC Api
//JDBC Driver
//come interfacciarsi mysql con codice sorgente java
// prima di interfacciarsi dobbiamo scaricare jdbs connctor per mysql = delle librerie che consentono la connessione con il db

package com.database;
        import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.sql.Connection;    //interface
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.sql.Statement;
        import java.util.Properties;

public class Database {
    private static final String DB_USERNAME="db.username";
    private static final String DB_PASSWORD="db.password";
    private static final String DB_URL ="db.url";

    private Connection con;//Variable
    private MysqlDataSource dataSource;
    private static Properties properties;


    public Connection getConnection() throws SQLException , FileNotFoundException, IOException {  // interface
            if(con == null){
                properties= new Properties();
                properties.load(new FileInputStream("src/com/database/database.properties"));

                dataSource = new MysqlDataSource();//classe per definire la connessione
                dataSource.setUrl(properties.getProperty(DB_URL));
                dataSource.setUser(properties.getProperty(DB_USERNAME));
                dataSource.setPassword(properties.getProperty(DB_PASSWORD));
                dataSource.setDatabaseName("corso_java");



//---------------commentato provo da file esterno database.properties
//            dataSource.setDatabaseName("corso_java");
//            dataSource.setPortNumber(3306);
//            dataSource.setServerName("localhost");
//            dataSource.setURL("jdbc:mysql://localhost:3306/corso_java?useSSL=false");    ///rimuovo  WARN: Establishing SSL connection without server's identity
//            dataSource.setUser("root");
//            dataSource.setPassword("1q2w3e");
//            //altrimenti
//            //DriverManager.getConnection ( "jdbc:mysql://localhost:3306/?useSSL=false","root","1q2w3e");

            con = dataSource.getConnection(); //mi ritornera un instanza della connessione
            System.out.print ( con + "   =====> DATABASE | "+ dataSource.getDatabaseName()+" | <===== \n");
            }
        return con;
    }


}

