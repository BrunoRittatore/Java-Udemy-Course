package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Thread.*;

public class testMySqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql); // api de java para traer la query que pedimos y la almacena en una variable local
            while(resultado.next()){
                delay(100);
                System.out.println("Id persona: "+resultado.getInt("id_persona"));
                delay(500);
                System.out.println("Nombre: "+resultado.getString("nombre"));
                delay(500);
                System.out.println("Apellido: "+resultado.getString("apellido"));
                delay(500);
                System.out.println("Email: "+resultado.getString("email"));
                delay(500);
                System.out.println("Telefono: "+resultado.getString("telefono"));
            }
        }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }


    private static void delay(int time){
        try {
            sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
