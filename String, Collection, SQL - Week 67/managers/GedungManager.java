package org.ukdw.managers;

import org.ukdw.data.Gedung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GedungManager {
    private Connection connection;

    public GedungManager(Connection connection) {
        this.connection = connection;
    }

    public boolean addGedung(String nama, String alamat) {
        String query = "INSERT INTO gedung (nama, alamat) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nama);
            stmt.setString(2, alamat);
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteGedung(int id) {
        String query = "DELETE FROM gedung WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateGedung(int id, String nama, String alamat) {
        String query = "UPDATE gedung SET nama = ?, alamat = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nama);
            stmt.setString(2, alamat);
            stmt.setInt(3, id);
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Gedung> allGedung() {
        List<Gedung> gedungs = new ArrayList<>();
        String query = "SELECT * FROM gedung";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String alamat = rs.getString("alamat");
                Gedung gedung = new Gedung(id, nama, alamat);
                gedungs.add(gedung);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gedungs;
    }
}
