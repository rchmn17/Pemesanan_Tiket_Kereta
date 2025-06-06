/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassDAO;

import EntityClass.Pemesanan;
import EntityClass.Tiket;
import Session.Session;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 *
 * @author USER
 */
public class PemesananDAO {
    private List<Pemesanan> pesanans = new ArrayList<>();
    private final JadwalDAO jDAO = new JadwalDAO();
    private final TiketDAO tDAO = new TiketDAO();
    private final UserDAO uDAO = new UserDAO();
    private String lastIdJadwal;
    
    public PemesananDAO() {
        loadPemesanan();
    }
    
    public void loadPemesanan(){
        String path = System.getProperty("user.dir") + File.separator + "Assets" + File.separator + "Pemesanan.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                pesanans.add(new Pemesanan(Atribut[0], jDAO.cariJadwaldariID(Atribut[1]), Atribut[2], Atribut[3], uDAO.cariUserdariNama(Atribut[4]), new ArrayList<>()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for (Pemesanan p : pesanans) {
            List<Tiket> tiketList = tDAO.cariTiketdariPemesanan(p.getIdPesanan());
            p.setItemOrder((ArrayList<Tiket>) tiketList);

            for (Tiket t : tiketList) {
                t.setPemesanan(p);
            }
        }   
    }
    
    public static String getLastIdPesanan() {
        String lastLine = null;
        String path = System.getProperty("user.dir") + File.separator + "Assets" + File.separator + "Pemesanan.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
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
        return null;
    }
    
    public static String generateIdPesanan() {
        String idTerakhir = getLastIdPesanan();
        int id = Integer.parseInt(idTerakhir.substring(1)) + 1;
        return String.format("P%03d", id);
    }
    public Pemesanan cariPemesanandariID(String ID){
        for (Pemesanan p : pesanans) {
            if (p.getIdPesanan().equals(ID)){
               return p;
            }
        }
        return null;
    }
    
    public List<Pemesanan> getPesanans() {
        return pesanans;
    }
    
    public void writeFile(Pemesanan p){
        
        String userPath = System.getProperty("user.dir") + File.separator + "Assets" + File.separator + "Pemesanan.txt";
        StringJoiner sj = new StringJoiner(",");
        for (int i=0; i<p.getItemOrder().size(); i++){
            sj.add(p.getItemOrder().get(i).getIdTiket());
        }
        try (FileWriter writer = new FileWriter(userPath, true)) {
            writer.write("\n" + p.getIdPesanan() + " " + p.getJadwal().getIdJadwal() + " " + p.getHari() + " " + p.getTanggal()+ " " + Session.getUser().getName() + " " + sj.toString());
            System.out.println("Pesanan berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Error menulis pesanan: " + e.getMessage());
        }
        loadPemesanan();
    }
}
