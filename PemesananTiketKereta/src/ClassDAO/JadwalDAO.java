package ClassDAO;
import EntityClass.Jadwal;
import EntityClass.Kereta;
import EntityClass.Stasiun;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JadwalDAO {
    private List<Jadwal> jadwals = new ArrayList<>();

    public JadwalDAO() {
        loadJadwals(new KeretaDAO().getKeretas(), new StasiunDAO().getStasiuns());
    }

    public void loadJadwals(List<Kereta> keretas, List<Stasiun> stasiuns) {
        String basePath = System.getProperty("user.dir");
        String JadwalPath = basePath + File.separator + "Assets" + File.separator + "Jadwal.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(JadwalPath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                jadwals.add(new Jadwal(Atribut[0], Atribut[1], Atribut[2], Atribut[3], Atribut[4], Atribut[5], Integer.parseInt(Atribut[6]), keretas, stasiuns));
            }
        } catch (Exception e) {

        }
    }

    public List<Jadwal> getJadwals() {
        return this.jadwals;
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
    
    public Jadwal cariJadwaldariID(String ID){
        for (Jadwal j : jadwals) {
            if (j.getIdJadwal().equals(ID)){
               return j;
            }
        }
        return null;
    }
}
