package responsi_013;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ViewPerpus extends javax.swing.JFrame {

    public ViewPerpus() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ltit1 = new javax.swing.JLabel();
        Lid = new javax.swing.JLabel();
        Ljudul = new javax.swing.JLabel();
        TFid = new javax.swing.JTextField();
        TFjudul = new javax.swing.JTextField();
        Lgenre = new javax.swing.JLabel();
        TFgenre = new javax.swing.JTextField();
        Lwriter = new javax.swing.JLabel();
        TFwriter = new javax.swing.JTextField();
        Lpen = new javax.swing.JLabel();
        TFpen = new javax.swing.JTextField();
        Llok = new javax.swing.JLabel();
        TFlok = new javax.swing.JTextField();
        Lstok = new javax.swing.JLabel();
        TFstok = new javax.swing.JTextField();
        Btambah = new javax.swing.JButton();
        Bubah = new javax.swing.JButton();
        Bhapus = new javax.swing.JButton();
        Btampil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tdata = new javax.swing.JTable();
        Lcari = new javax.swing.JLabel();
        TFcari = new javax.swing.JTextField();
        Cpil = new javax.swing.JComboBox<>();
        Bcari = new javax.swing.JButton();
        Ltit2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Ltit1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        Ltit1.setForeground(new java.awt.Color(255, 0, 0));
        Ltit1.setText("Perpustakaan Umum\n");

        Lid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lid.setText("ID");

        Ljudul.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ljudul.setText("Judul Buku");

        TFid.setBackground(new java.awt.Color(240, 240, 240));
        TFid.setFocusable(false);
        TFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidActionPerformed(evt);
            }
        });

        Lgenre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lgenre.setText("Genre Buku");

        Lwriter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lwriter.setText("Penulis Buku");

        Lpen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lpen.setText("Penerbit Buku");

        Llok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Llok.setText("Lokasi Buku");

        Lstok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lstok.setText("Stok Buku");

        Btambah.setBackground(new java.awt.Color(0, 255, 0));
        Btambah.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Btambah.setText("Tambah");
        Btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtambahActionPerformed(evt);
            }
        });

        Bubah.setBackground(new java.awt.Color(255, 255, 0));
        Bubah.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Bubah.setText("Ubah");

        Bhapus.setBackground(java.awt.Color.red);
        Bhapus.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Bhapus.setText("Hapus");

        Btampil.setBackground(new java.awt.Color(0, 255, 255));
        Btampil.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Btampil.setText("Tampilkan Semua");

        Tdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Judul Buku", "Genre Buku", "Penulis", "Penerbit", "Lokasi", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tdata.setGridColor(new java.awt.Color(0, 0, 0));
        Tdata.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Tdata.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tdata);

        Lcari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lcari.setText("Cari Buku");

        Cpil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Judul", "Genre", "Penulis", "Penerbit","Lokasi","Stock" }));
        Cpil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpilActionPerformed(evt);
            }
        });

        Bcari.setBackground(new java.awt.Color(51, 255, 0));
        Bcari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bcari.setText("Cari");

        Ltit2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        Ltit2.setText("Yogyakarta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ltit1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ljudul, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Llok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Lstok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Lpen)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Lwriter, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Lgenre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(1, 1, 1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Lid, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TFjudul)
                                        .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TFstok, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFlok, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFpen, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFwriter, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFgenre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Btampil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Bubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(Ltit2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lcari, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFcari, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cpil, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lcari)
                            .addComponent(TFcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cpil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bcari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ltit1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ltit2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btampil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lid)
                                    .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ljudul)
                                    .addComponent(TFjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lgenre)
                                    .addComponent(TFgenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lwriter)
                                    .addComponent(TFwriter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lpen)
                                    .addComponent(TFpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Llok)
                                    .addComponent(TFlok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lstok)
                                    .addComponent(TFstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtambahActionPerformed

    private void TFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidActionPerformed

    private void CpilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpilActionPerformed

    public JTextField getTFID() {
        return TFid;
    }

    public JTextField getTFJudul() {
        return TFjudul;
    }

    public JTextField getTFGenre() {
        return TFgenre;
    }

    public JTextField getTFWriter() {
        return TFwriter;
    }

    public JTextField getTFPen() {
        return TFpen;
    }

    public JTextField getTFLok() {
        return TFlok;
    }

    public JTextField getTFStok() {
        return TFstok;
    }

    public JButton getBCari() {
        return Bcari;
    }

    public JButton getBTambah() {
        return Btambah;
    }

    public JButton getBUbah() {
        return Bubah;
    }

    public JButton getBHapus() {
        return Bhapus;
    }

    public JButton getBTampil() {
        return Btampil;
    }

    public JTable getTabel() {
        return Tdata;
    }

    public JComboBox<String> getCPil() {
        return Cpil;
    }

    public JTextField getTFCari() {
        return TFcari;
    }
    
    
   
    
   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcari;
    private javax.swing.JButton Bhapus;
    private javax.swing.JButton Btambah;
    private javax.swing.JButton Btampil;
    private javax.swing.JButton Bubah;
    private javax.swing.JComboBox<String> Cpil;
    private javax.swing.JLabel Lcari;
    private javax.swing.JLabel Lgenre;
    private javax.swing.JLabel Lid;
    private javax.swing.JLabel Ljudul;
    private javax.swing.JLabel Llok;
    private javax.swing.JLabel Lpen;
    private javax.swing.JLabel Lstok;
    private javax.swing.JLabel Ltit1;
    private javax.swing.JLabel Ltit2;
    private javax.swing.JLabel Lwriter;
    private javax.swing.JTextField TFcari;
    private javax.swing.JTextField TFgenre;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFjudul;
    private javax.swing.JTextField TFlok;
    private javax.swing.JTextField TFpen;
    private javax.swing.JTextField TFstok;
    private javax.swing.JTextField TFwriter;
    private javax.swing.JTable Tdata;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
