package org.ukdw.managers;

import org.ukdw.data.Pemesanan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PemesananManager {
    private Connection connection;

    public PemesananManager(Connection connection) {
        this.connection = connection;
    }

    public boolean editPemesanan(int id, String userEmail, int idRuangan, String checkinDate, String checkOutDate, String checkinTime, String checkOutTime) {
        String query = "UPDATE pemesanan SET userEmail = ?, idRuangan = ?, checkInDate = ?, checkOutDate = ?, checkInTime = ?, checkOutTime = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, userEmail);
            stmt.setInt(2, idRuangan);
            stmt.setString(3, checkinDate);
            stmt.setString(4, checkOutDate);
            stmt.setString(5, checkinTime);
            stmt.setString(6, checkOutTime);
            stmt.setInt(7, id);
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletePemesanan(int id) {
        String query = "DELETE FROM pemesanan WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addPemesanan(String userEmail, int idRuangan, String checkInDate, String checkOutDate, String checkInTime, String checkOutTime ) {
        String query = "INSERT INTO pemesanan (userEmail, idRuangan, checkInDate, checkOutDate, checkInTime, checkOutTime) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, userEmail);
            stmt.setInt(2, idRuangan);
            stmt.setString(3, checkInDate);
            stmt.setString(4, checkOutDate);
            stmt.setString(5, checkInTime);
            stmt.setString(6, checkOutTime);
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Pemesanan> allPemesanan() {
        List<Pemesanan> pemesanans = new ArrayList<>();
        String query = "SELECT * FROM pemesanan";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String userEmail = rs.getString("userEmail");
                int idRuangan = rs.getInt("idRuangan");
                String checkInDate = rs.getString("checkInDate");
                String checkOutDate = rs.getString("checkOutDate");
                String checkInTime = rs.getString("checkInTime");
                String checkOutTime = rs.getString("checkOutTime");
                Pemesanan pemesanan = new Pemesanan(id, userEmail, idRuangan, checkInDate, checkOutDate, checkInTime, checkOutTime);
                pemesanans.add(pemesanan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pemesanans;
    }
}
