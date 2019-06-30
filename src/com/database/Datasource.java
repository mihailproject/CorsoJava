package com.database;

import java.io.IOException;
import java.sql.SQLException;

public class Datasource {

    Database d = new Database ();

    public boolean open() {
        try {
            d.getConnection ();
            return true;
        } catch (SQLException | IOException e) {
            e.printStackTrace ();
            System.out.println ( "Couldn't connect to database" + e.getMessage () );
            return false;
        }
    }

        public void close() {
            try {
                d.getConnection ().close ();

            } catch (SQLException | IOException e) {
                e.printStackTrace ();
                System.out.println ( "Couldn't connect to database" + e.getMessage () );

            }
        }
    }


