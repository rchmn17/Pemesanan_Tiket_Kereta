/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassDAO;

import EntityClass.Jadwal;
import EntityClass.Pemesanan;
import EntityClass.Tiket;
import EntityClass.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class PemesananDAO {
    private List<Pemesanan> pesanans = new ArrayList<>();
    private JadwalDAO jDAO = new JadwalDAO();
    private TiketDAO tDAO = new TiketDAO();
    private String lastIdJadwal;
    
    public PemesananDAO() {
        loadPemesanan(jDAO.getJadwals(), tDAO.getTikets());
    }
    
    public void loadPemesanan(List<Jadwal> jadwals, List<Tiket> tikets){
        String path = System.getProperty("user.dir") + File.separator + "Assets" + File.separator + "Pemesanan.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                pesanans.add(new Pemesanan(Atribut[0], jDAO.cariJadwaldariID(Atribut[1]), Atribut[2], Atribut[3], new User(Atribut[4]), tDAO.cariTiketdariJadwal(jDAO.cariJadwaldariID(Atribut[1]))));
            }
        } catch (Exception e) {

        }
    }
    
    public static String getLastIdPesanan() {
        String lastLine = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("Pemesanan.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty() || line.startsWith("ID_PESANAN")) {
                    continue;
                }
                lastLine = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (lastLine != null) {
            String[] columns = lastLine.split("\\s+");
            if (columns.length > 0) {
                return columns[0].trim();
            }
        }

        System.out.println("File kosong atau data tidak valid.");
        return null;
    }
}
