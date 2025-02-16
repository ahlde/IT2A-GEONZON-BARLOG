    package config;

import java.sql.*;

public class dbConnect {
    private Connection connect;

    // Constructor to establish the connection
    public dbConnect() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/baranggay", "root", "");
            System.out.println("Database connected successfully!");
        } catch (SQLException ex) {
            System.err.println("Can't connect to the database: " + ex.getMessage());
        }
    }

    // Method to return the connection
    public Connection getConnection() {
        return connect;
    }

    // Function to insert data
    public int insertData(String sql) {
        int result = 0;
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            pst.executeUpdate();
            System.out.println("Inserted successfully!");
            result = 1;
        } catch (SQLException ex) {
            System.err.println("Insert error: " + ex.getMessage());
        }
        return result;
    }

    // Function to retrieve data
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        return stmt.executeQuery(sql);
    }

    // Method to close the connection
    public void closeConnection() {
        try {
            if (connect != null && !connect.isClosed()) {
                connect.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException ex) {
            System.err.println("Error closing connection: " + ex.getMessage());
        }
    }
}
