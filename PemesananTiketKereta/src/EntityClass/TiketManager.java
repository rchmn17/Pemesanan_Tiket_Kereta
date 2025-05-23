package EntityClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TiketManager {
    private List<Tiket> tikets = new ArrayList<>();
    private List<Jadwal> jadwals = new ArrayList<>();
    private List<Stasiun> stasiuns = new ArrayList<>();
    public List<Kereta> keretas = new ArrayList<>();

    public TiketManager() {
        setKeretas();
        setStasiuns();
        setJadwals();
    }

    public void pesanTiket(){
    }

    public List<Jadwal> getJadwals() {
        return jadwals;
    }

    public List<Tiket> getTikets() {
        return tikets;
    }

    private void setJadwals() {
        String basePath = System.getProperty("user.dir");
        String JadwalPath = basePath + File.separator + "Assest" + File.separator + "Jadwal.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(JadwalPath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                jadwals.add(new Jadwal(Atribut[0], Atribut[1], Atribut[2], Atribut[3], Atribut[4], Integer.parseInt(Atribut[5]), keretas, stasiuns));
            }
        } catch (Exception e) {

        }
        
    }

    private void setKeretas() {
        String basePath = System.getProperty("user.dir");
        String KeretaPath = basePath + File.separator + "Assest" + File.separator + "Kereta.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(KeretaPath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                keretas.add(new Kereta(Atribut[0], Atribut[1], Integer.parseInt(Atribut[2])));
            }
        } catch (Exception e) {

        }
        
    }

    private void setStasiuns() {
        String basePath = System.getProperty("user.dir");
        String StasiunPath = basePath + File.separator + "Assest" + File.separator + "Stasiun.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(StasiunPath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                stasiuns.add(new Stasiun(Atribut[0], Atribut[1]));
            }
        } catch (Exception e) {

        }
    }

    public List<Jadwal> cariJadwal(String lokasiAwal, String lokasiAkhir){
        List<Jadwal> jadwalBaru = new ArrayList<>();
        for (Jadwal j : jadwals) {
            if (j.getStasiunAkhir() != null && j.getStasiunAwal() != null){
                if (j.getStasiunAwal().getKota().equals(lokasiAwal) && j.getStasiunAkhir().getKota().equals(lokasiAkhir)){
                    jadwalBaru.add(j);
                }
            }
        }
        return  jadwalBaru;
    }
}