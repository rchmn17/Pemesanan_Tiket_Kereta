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

    public void loadJadwals(List<Kereta> keretas, List<Stasiun> stasiuns) {
        String basePath = System.getProperty("user.dir");
        String JadwalPath = basePath + File.separator + "PemesananTiketKereta" + File.separator + "Assest" + File.separator + "Jadwal.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(JadwalPath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                jadwals.add(new Jadwal(Atribut[0], Atribut[1], Atribut[2], Atribut[3], Atribut[4], Integer.parseInt(Atribut[5]), keretas, stasiuns));
            }
        } catch (Exception e) {

        }
        
    }

    public List<Jadwal> getJadwals() {
        return this.jadwals;
    }
}
