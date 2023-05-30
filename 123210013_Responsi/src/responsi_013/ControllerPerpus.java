package responsi_013;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


public class ControllerPerpus {

    public ControllerPerpus(ViewPerpus viewPerpus, ModelPerpus perpusModel) {

        viewPerpus.getBTambah().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String judul = viewPerpus.getTFJudul().getText();
                    String genre = viewPerpus.getTFGenre().getText();
                    String writer = viewPerpus.getTFWriter().getText();
                    String pen = viewPerpus.getTFPen().getText();
                    String lok = viewPerpus.getTFLok().getText();
                    int stok = Integer.parseInt(viewPerpus.getTFStok().getText());

                    if (judul.equals("") || genre.equals("") || writer.equals("") || pen.equals("") || lok.equals("")) {
                       JOptionPane.showMessageDialog(null, "Lengkapi Form");
                       return;
                    }

                    perpusModel.addData(judul, genre, writer, pen, lok, stok);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Input Salah", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        viewPerpus.getBTampil().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data[][];
                data = perpusModel.getData();

                viewPerpus.getTabel().setModel(new DefaultTableModel(data, new String[]{
                    "ID", "Judul Buku", "Genre Buku", "Penulis", "Penerbit", "Lokasi", "Stok"
                }));

            }
        });

        viewPerpus.getTabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = viewPerpus.getTabel().getSelectedRow();
                String id = viewPerpus.getTabel().getValueAt(row, 0).toString();
                String judul = viewPerpus.getTabel().getValueAt(row, 1).toString();
                String genre = viewPerpus.getTabel().getValueAt(row, 2).toString();
                String writer = viewPerpus.getTabel().getValueAt(row, 3).toString();
                String pen = viewPerpus.getTabel().getValueAt(row, 4).toString();
                String lok = viewPerpus.getTabel().getValueAt(row, 5).toString();
                String stok = viewPerpus.getTabel().getValueAt(row, 6).toString();

                viewPerpus.getTFID().setText(id);
                viewPerpus.getTFJudul().setText(judul);
                viewPerpus.getTFGenre().setText(genre);
                viewPerpus.getTFWriter().setText(writer);
                viewPerpus.getTFPen().setText(pen);
                viewPerpus.getTFLok().setText(lok);
                viewPerpus.getTFStok().setText(stok);
            }

        });

        viewPerpus.getBHapus().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = viewPerpus.getTFID().getText();

                    perpusModel.deleteData(id);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());

                }

            }
        });

        viewPerpus.getBUbah().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = viewPerpus.getTFJudul().getText();
                String genre = viewPerpus.getTFGenre().getText();
                String writer = viewPerpus.getTFWriter().getText();
                String pen = viewPerpus.getTFPen().getText();
                String lok = viewPerpus.getTFLok().getText();
                int stok = Integer.parseInt(viewPerpus.getTFStok().getText());
                String id = viewPerpus.getTFID().getText();
                
                if (judul.equals("") || genre.equals("") || writer.equals("") || pen.equals("") || lok.equals("")) {
                       JOptionPane.showMessageDialog(null, "Harap Isi form dengan lengkap");
                       return;
                    }

                perpusModel.updateData(judul, genre, writer, pen, lok, stok, id);

            }
        });
        
        viewPerpus.getBCari().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kategori = viewPerpus.getCPil().getSelectedItem().toString();
                String search = viewPerpus.getTFCari().getText();

                String data[][] = perpusModel.dataKategori(kategori, search);
                               
                viewPerpus.getTabel().setModel(new DefaultTableModel(data, new String[]{
                    "ID", "Judul Buku", "Genre Buku", "Penulis", "Penerbit", "Lokasi", "Stok"
                }));
                if (data.length==0){
                    JOptionPane.showMessageDialog(null, "Data Yang Dicari Tidak Ada");
                    return;
                }
                
            }
        });

    }

}
