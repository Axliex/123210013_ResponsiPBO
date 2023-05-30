package responsi_013;

import java.sql.*;
import javax.swing.JOptionPane;

public class ModelPerpus extends Connector {

    public int getAll() {
        int totalData = 0;
        try {
            String query = "SELECT * FROM dataperpus";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                totalData++;
            }
            
            return totalData;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return totalData;
        }

    }

    public String[][] getData() {
        String data[][] = new String[getAll()][7];
        
        try {
            int index = 0;
            String query = "SELECT * FROM dataperpus";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                data[index][0] = resultSet.getString("id");
                data[index][1] = resultSet.getString("judul");
                data[index][2] = resultSet.getString("genre");
                data[index][3] = resultSet.getString("penulis");
                data[index][4] = resultSet.getString("penerbit");
                data[index][5] = resultSet.getString("lokasi");
                data[index][6] = resultSet.getString("stock");
                index++;
            }
            
            return data;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return data;
        }
    }

    public void addData(String judul, String genre, String writer, String pen, String lok, int stok) {
        try {
            String query = "INSERT INTO `dataperpus` (`judul`,`genre`,`penulis`,`penerbit`,`lokasi`,`stock`) VALUES (?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, judul);
            pstmt.setString(2, genre);
            pstmt.setString(3, writer);
            pstmt.setString(4, pen);
            pstmt.setString(5, lok);
            pstmt.setInt(6, stok);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Input Data Berhasil");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteData(String id) {

        try {
            String query = "DELETE FROM `dataperpus` WHERE `id` = '" + id + "'";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateData(String judul, String genre, String writer, String pen, String lok, int stok, String id) {
        try {
            String query = "UPDATE `dataperpus` SET "
                    + "`judul` = '" + judul + "',"
                    + "`genre` = '" + genre + "',"
                    + "`penulis` = '" + writer + "' ,"
                    + "`penerbit` = '" + pen + "',"
                    + "`lokasi` = '" + lok + "',"
                    + "`stock` = '" + stok + "' "
                    + "WHERE `id` = '" + id + "'";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Update Data");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int totalDataKat(String kat, String cari) {
        int totalData = 0;
        try {
            String query = "SELECT * FROM dataperpus WHERE `" + kat + "` = '" + cari + "'";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                totalData++;
            }
            return totalData;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return totalData;
        }
    }

    public String[][] dataKategori(String kat, String cari) {
        String data[][] = new String[totalDataKat(kat, cari)][7];
        try {
            int index = 0;
            String query = "SELECT * FROM dataperpus WHERE `" + kat + "` = '" + cari + "'";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            
            while (resultSet.next()) {
                data[index][0] = resultSet.getString("id");
                data[index][1] = resultSet.getString("judul");
                data[index][2] = resultSet.getString("genre");
                data[index][3] = resultSet.getString("penulis");
                data[index][4] = resultSet.getString("penerbit");
                data[index][5] = resultSet.getString("lokasi");
                data[index][6] = resultSet.getString("stock");
                index++;
            }
            
            return data;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return data;
        }

    }

}
