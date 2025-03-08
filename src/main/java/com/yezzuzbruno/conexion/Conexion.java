package com.yezzuzbruno.conexion;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    static {
        try{
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            props.load(fis);

            URL = props.getProperty("db.url");
            USER = props.getProperty("db.user");
            PASSWORD = props.getProperty("db.password");
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Connection getConexion(){
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (SQLException e){
            System.out.println("Error: "+ e.getMessage());
        }
        return conexion;
    }

    public static void closeConexion(Connection connection){
        try{
            connection.close();
            System.out.println("The database has been closed successfully!");
        }catch (SQLException e){
            System.out.println("Error closing the database" + e.getMessage());
        }
    }
}
