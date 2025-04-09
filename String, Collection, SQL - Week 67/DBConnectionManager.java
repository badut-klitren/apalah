package org.ukdw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionManager {
    private static final String DB_URL = "jdbc:sqlite:ukdwroombook.db";
    private static Connection connection;

    private DBConnectionManager() {}

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DB_URL);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void setConnection(Connection connection) {
        DBConnectionManager.connection = connection;
    }

    public static void createTables() {
        String queryGedung = "CREATE TABLE IF NOT EXISTS gedung (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nama TEXT," +
                "alamat TEXT);";
        String queryPemesanan = "CREATE TABLE IF NOT EXISTS pemesanan (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "userEmail TEXT," +
                "idRuangan INTEGER," +
                "checkInDate TEXT," +
                "checkOutDate TEXT," +
                "checkInTime TEXT," +
                "checkOutTime TEXT);";
        String queryRuangan = "CREATE TABLE IF NOT EXISTS ruangan (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "idGedung INTEGER);";
        String queryUser = "CREATE TABLE IF NOT EXISTS user (" +
                "email TEXT" +
                "username TEXT," +
                "password TEXT);";

        try {
            Connection conn = DBConnectionManager.getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(queryGedung);
            stmt.execute(queryRuangan);
            stmt.execute(queryUser);
            stmt.execute(queryPemesanan);
        } catch (SQLException e) {
            System.err.println("Gagal membuat tabel: " + e.getMessage());
        } finally {
            DBConnectionManager.closeConnection();
        }
    }
}