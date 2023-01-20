package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getCo() throws  Exception{
        return DriverManager.getConnection("jdbc:postgresql://surus.db.elephantsql.com:5432/apnaszzh", "apnaszzh", "5zNvuy3djQngMsG_-hiSMzarYuAXwow7");

    }
}