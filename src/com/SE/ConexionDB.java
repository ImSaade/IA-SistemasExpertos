/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private Connection connection;
    
    public ConexionDB() {
        // Configura la conexión en el constructor
        String url = "jdbc:mysql://localhost:3306/sistema";
        String usuario = "root";
        String contraseña = "root";
        
        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            System.err.println("Error de conexión a MySQL: " + e.getMessage());
        }
    }
    
    public Connection obtenerConexion() {
        return connection;
    }
    
    public void cerrarConexion() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}

