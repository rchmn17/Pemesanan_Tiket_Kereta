/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassDAO;

import EntityClass.Jadwal;
import EntityClass.Tiket;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class TiketDAO {
    private ArrayList<Tiket> tikets = new ArrayList<>();
    private JadwalDAO jDAO = new JadwalDAO();
    
    public TiketDAO() {
        loadTikets(jDAO.getJadwals());
    }
    
    public void loadTikets(List<Jadwal> jadwals) {
        String basePath = System.getProperty("user.dir");
        String JadwalPath = basePath + File.separator + "Assets" + File.separator + "Tiket.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(JadwalPath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                tikets.add(new Tiket(Atribut[0], Atribut[1], Atribut[2], jDAO.cariJadwaldariID(Atribut[3])));
            }
        } catch (Exception e) {
            System.out.println("Gagal pada saat buka file");
        }
    }
    
    public ArrayList<Tiket> cariTiketdariJadwal(String idJadwal){
        ArrayList<Tiket> tiketBaru = new ArrayList<>();
        for (Tiket t : tikets) {
            if (t.getJadwal().getIdJadwal().equals(idJadwal)){
                tiketBaru.add(t);
            }
        }
        return tiketBaru;
    }
    
    public static String getLastIdTiket() {
        String lastLine = null;
        String path = System.getProperty("user.dir") + File.separator + "Assets" + File.separator + "Tiket.txt";

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
    
    public static String generateIdTiket() {
        String idTerakhir = getLastIdTiket();
        int id = Integer.parseInt(idTerakhir.substring(1)) + 1;
        return String.format("T%03d", id);
    }
    
    public ArrayList<Tiket> getTikets() {
        return tikets;
    }
    
    public void writeFile(Tiket t){
        String userPath = System.getProperty("user.dir") + File.separator + "Assets" + File.separator + "Tiket.txt";
        try (FileWriter writer = new FileWriter(userPath, true)) {
            writer.write("\n" + generateIdTiket() + " " + t.getNama() + " " + t.getNomorKursi() + " " + t.getJadwal().getIdJadwal());
            System.out.println("Tiket berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Error menulis tiket: " + e.getMessage());
        }
        loadTikets(jDAO.getJadwals());
    }
}
