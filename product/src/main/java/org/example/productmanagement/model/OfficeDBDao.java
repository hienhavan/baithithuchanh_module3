package org.example.productmanagement.model;

import org.example.productmanagement.model.DTO.OfficedbDTO;
import org.example.productmanagement.service.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfficeDBDao {
    public static List<OfficedbDTO> listOfDTOs() throws ClassNotFoundException {
        List<OfficedbDTO> officeList = new ArrayList<>();
        String ShowFullOffice = "SELECT * FROM Offices";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(ShowFullOffice);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String maMB = resultSet.getString("MaMB");
                int dienTich = resultSet.getInt("DienTich");
                String trangThai = resultSet.getString("TrangThai");
                int tang = resultSet.getInt("Tang");
                String loaiVanPhong = resultSet.getString("LoaiVanPhong");
                long giaChoThue = resultSet.getLong("GiaChoThue");
                String ngayBatDau = resultSet.getString("NgayBatDau");
                String ngayKetThuc = resultSet.getString("NgayKetThuc");
                officeList.add(new OfficedbDTO(maMB, dienTich, trangThai, tang, loaiVanPhong, giaChoThue, ngayBatDau, ngayKetThuc));
            }
            System.out.println(officeList);
        } catch (SQLException e) {
            throw new RuntimeException("Error executing select query", e);
        }
        return officeList;
    }

    public static void deleteOffices(String maOffice) throws ClassNotFoundException {
        String deleteOffice = "DELETE FROM Offices WHERE MaMB = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(deleteOffice)) {
            stmt.setString(1, maOffice);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error executing delete query", e);
        }
    }

    public static void addOffice(String maOffice, int dienTich, String trangThai, int tang, String loaiVanPhong, long giaChoThue, String ngayBatDau, String ngayKetThuc) {
        String addOffice = "INSERT INTO Offices (MaMB, DienTich, TrangThai, Tang, LoaiVanPhong, GiaChoThue, NgayBatDau, NgayKetThuc) VALUES (?,?,?,?,?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(addOffice)) {
            stmt.setString(1, maOffice);
            stmt.setInt(2, dienTich);
            stmt.setString(3, trangThai);
            stmt.setInt(4, tang);
            stmt.setString(5, loaiVanPhong);
            stmt.setLong(6, giaChoThue);
            stmt.setString(7, ngayBatDau);
            stmt.setString(8, ngayKetThuc);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error", e);
        }
    }
    public static List<OfficedbDTO> searchOffice (int tang){
        String
    }
}

