package no.kristiania.pgr200.database;

import javax.swing.plaf.nimbus.State;
import java.io.IOException;
import java.sql.*;

public class DatabaseMain {
    public static void createNewTable() {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        String sql = "CREATE TABLE Conference (\n" + "conference_id integer PRIMARY KEY, \n" + "days integer NOT NULL, \n"
    }





    public static void main(String[] args) throws IOException , SQLException {


    }

}