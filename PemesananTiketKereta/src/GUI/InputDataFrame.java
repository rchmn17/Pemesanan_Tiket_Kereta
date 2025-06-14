package GUI;

import ClassDAO.*;
import TemplateGUI.TemplateInputData;
import EntityClass.*;
import java.awt.Component;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.Box;
import javax.swing.JOptionPane;
import raven.scroll.win11.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Umar
 */
public class InputDataFrame extends javax.swing.JFrame {

    private javax.swing.JPanel TemplateInputData;
    private String IDTiket;
    private int jumlahDewasa;
    private int jumlahAnak;
    private Jadwal jadwalPemesanan;
    private Date tanggalPemesanan;
    private User loggedInUser;
    private String[] KursiTersedia;
    private TiketDAO daotiket = new TiketDAO();
    private PemesananDAO pDAO = new PemesananDAO();
    private static List<TemplateInputData> panelInput = new ArrayList<TemplateInputData>();

    /**
     * Creates new form InputDataFrame
     *
     * @param jumlahPenumpang
     */
    public InputDataFrame(int jumlahDewasa, int jumlahAnak, Jadwal jadwal, Date tanggal) {
        this.jumlahDewasa = jumlahDewasa;
        this.jumlahAnak = jumlahAnak;
        this.jadwalPemesanan = jadwal;
        this.tanggalPemesanan = tanggal;
        initComponents();
        this.setLocationRelativeTo(null);
        loadPenumpangPanel(jumlahDewasa + jumlahAnak);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new raven.scroll.win11.ScrollPaneWin11();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(578, 400));
        setPreferredSize(new java.awt.Dimension(578, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Selanjutnya");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel2);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Konfigurasi Data Penumpang");

        jLabel2.setText("Sesuaikan Kepemilikan Tiket dan Pilih Nomor Kursi");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/LOGOkAI(50).png"))); // NOI18N
        jLabel3.setText("logoKAI(50)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Component[] komponen = jPanel2.getComponents();
        String[] dataKursi = getKursi();
        String[] dataNama = getNama();
        
        if (dataNama == null) {
            JOptionPane.showMessageDialog(this, "Nama harus diisi semuanya", "Input salah", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (dataKursi == null) {
            JOptionPane.showMessageDialog(this, "Kursi tidak boleh sama", "Input salah", JOptionPane.ERROR_MESSAGE);
            return;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE", new Locale("id", "ID"));
        String hari = formatter.format(tanggalPemesanan);
        formatter = new SimpleDateFormat("yyyy-MM-dd", new Locale("id", "ID"));
        String tanggal = formatter.format(tanggalPemesanan);
        
        Pemesanan pesanan = new Pemesanan(pDAO.generateIdPesanan() ,jadwalPemesanan, hari, tanggal, loggedInUser, new ArrayList<>());
        int i=0;
        ArrayList<Tiket> itemOrder = new ArrayList<>();
        for (Component c : komponen) {
            if (c instanceof TemplateInputData panelInput){
                String nama = panelInput.getjTextField1().getText();
                itemOrder.add(new Tiket(dataNama[i], dataKursi[i], pesanan));
                i++;
            }
        }
        pesanan.setItemOrder(itemOrder);
        this.dispose();
        new PembayaranKeretaFrame(getNama(),pesanan, jumlahDewasa, jumlahAnak).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public String[] getNama() {
        String[] dataNama = new String[panelInput.size()];
        for(int i=0 ;i<panelInput.size();i++ ) {
            if (panelInput.get(i).getNama().isBlank()) return null;
            dataNama[i] = panelInput.get(i).getNama();
        }
        return dataNama;
    }
    
    public String[] getKursi() {
        String[] dataKursi = new String[panelInput.size()];
        for(int i=0 ;i<panelInput.size();i++ ) {
            if (cekKursiDouble(dataKursi, panelInput.get(i).getKursi())) return null;
            dataKursi[i] = panelInput.get(i).getKursi();
        }
        return dataKursi;
    }
    
    private boolean cekKursiDouble(String[] dataKursi, String kursi){
        for (String s : dataKursi){
            if (kursi.equals(s) && dataKursi != null){
                return true;
            }
        }
        return false;
    }

    private void loadPenumpangPanel(int jumlahPenumpang) {
        jPanel2.removeAll();
        ArrayList<String> kursiDipesan = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", new Locale("id", "ID"));
        for (Pemesanan p : pDAO.getPesanans()){
            for(Tiket t : p.getItemOrder()) {
                if((t.getPemesanan().getJadwal().getIdJadwal().equals(this.jadwalPemesanan.getIdJadwal())) && (t.getPemesanan().getTanggal().equals(formatter.format(tanggalPemesanan)))) {
                    kursiDipesan.add(t.getNomorKursi());
                }
            }
        }
        
        KursiTersedia = new String[jadwalPemesanan.getKursiTersedia()];
        for(int i = 0 ;i<KursiTersedia.length; i++) {
            KursiTersedia[i] = String.valueOf(i+1);
        }
        
        for (int i = 0; i < jumlahPenumpang; i++) {
            panelInput.add(new TemplateInputData());

            panelInput.get(i).getjLabel1().setText("Nama:");
            //panelInput.get(i).getjLabel2().setText("Gender:");
            panelInput.get(i).getjTextField1().setText("");
            //panelInput.get(i).setCombobox(KursiTersedia);
            panelInput.get(i).getComboBox().removeAllItems();
            panelInput.get(i).setCombobox(KursiTersedia);
            for(String elem : kursiDipesan) {
                panelInput.get(i).getComboBox().removeItem(elem);
            }

            jPanel2.add(panelInput.get(i));
            jPanel2.add(Box.createRigidArea(new Dimension(0, 10)));
            
            
        }
        jPanel2.revalidate();
        jPanel2.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
