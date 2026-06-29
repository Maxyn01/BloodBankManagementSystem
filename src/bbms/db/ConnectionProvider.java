package bbms.db; // Replace with your package name

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    private static Connection con;

    public static Connection getConnection() {
        if (con == null) {
            try {
                // Load the JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create the connection
                String url = "jdbc:mysql://localhost:3306/bbms"; // Database URL
                String username = "root"; // Default MySQL username
                String password = "Donhaiziya.69"; // Your MySQL password
                con = DriverManager.getConnection(url, username, password);

                System.out.println("Database connection established successfully!");
            } catch (ClassNotFoundException e) {
                System.out.println("MySQL JDBC Driver not found!");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Failed to connect to the database!");
                e.printStackTrace();
            }
        }
        return con;
    }

    // Temporary main method to test the connection
    public static void main(String[] args) {
        Connection con = ConnectionProvider.getConnection();
        if (con != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}
