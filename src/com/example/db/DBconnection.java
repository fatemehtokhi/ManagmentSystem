package com.example.db;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBconnection {
    static Connection con;
    public static Connection creatConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String pass = "rootroot";
            String url = "jdbc:mysql://localhost/3306/DB?autoReconnect=true&useSSL=false";

            con = DriverManager.getConnection(url,user,pass);



        }catch(Exception ex){
            ex.printStackTrace();
        }
        return con;

    }

    
}
