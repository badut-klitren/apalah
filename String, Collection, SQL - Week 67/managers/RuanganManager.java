package org.ukdw.managers;

import org.ukdw.data.Ruangan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RuanganManager {
    private Connection connection;

    public RuanganManager(Connection connection) {
        this.connection = connection;
    }

    public boolean deleteRuangan(int id) {
        String query = "DELETE FROM ruangan WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean editRuangan(String nama, int id, int idRuangan) {
        String query = "UPDATE ruangan SET nama = ?, idRuangan = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nama);
            stmt.setInt(2, idRuangan);
            stmt.setInt(3, id);
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addRuangan(String nama, int idRuangan) {
        String query = "INSERT INTO ruangan (nama, alamat) VALUES(?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nama);
            stmt.setInt(2, idRuangan);
            int rowAffected = stmt.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Ruangan> allRuangan() {
        List<Ruangan> ruangans = new ArrayList<>();
        String query = "SELECT * FROM ruangan";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                int idRuangan = rs.getInt("idRuangan");
                Ruangan ruangan = new Ruangan(id, nama, idRuangan);
                ruangans.add(ruangan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ruangans;
    }
}
