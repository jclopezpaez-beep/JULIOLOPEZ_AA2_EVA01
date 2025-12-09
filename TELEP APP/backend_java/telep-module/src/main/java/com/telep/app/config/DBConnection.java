package com.telep.app.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase encargada de manejar la conexión a MySQL
 * utilizando el driver JDBC.
 */
public class DBConnection {

    // URL de conexión → usando tu puerto 3307
    private static final String URL = "jdbc:mysql://localhost:3307/telep_app_jdbc?useSSL=false&serverTimezone=UTC";

    // Usuario de MySQL
    private static final String USER = "root";

    // Sin contraseña, porque así está XAMPP por defecto
    private static final String PASSWORD = "";

    /**
     * Método que entrega una conexión lista para usar.
     * 
     * @return Connection
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Obtener la conexión
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: No se encontró el driver JDBC de MySQL.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Método para probar la conexión directamente desde Eclipse.
     */
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {

            if (conn != null) {
                System.out.println("✔ Conexión exitosa a MySQL en el puerto 3307.");
            } else {
                System.out.println("❌ No se pudo establecer la conexión.");
            }

        } catch (SQLException e) {
            System.out.println("❌ Error SQL al intentar conectarse.");
            e.printStackTrace();
        }
    }
}
