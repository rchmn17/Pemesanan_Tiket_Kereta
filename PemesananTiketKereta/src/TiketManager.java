import java.io.BufferedReader;
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
        try(BufferedReader reader = new BufferedReader(new FileReader("./Assest/Jadwal.txt"))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                jadwals.add(new Jadwal(Atribut[0], Atribut[1], Atribut[2], Atribut[3], Atribut[4], Integer.parseInt(Atribut[5]), keretas, stasiuns));
            }
        } catch (Exception e) {

        }
        
    }

    private void setKeretas() {
        try(BufferedReader reader = new BufferedReader(new FileReader("./Assest/Kereta.txt"))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                keretas.add(new Kereta(Atribut[0], Atribut[1], Integer.parseInt(Atribut[2])));
            }
        } catch (Exception e) {

        }
        
    }

    private void setStasiuns() {
        try(BufferedReader reader = new BufferedReader(new FileReader("./Assest/Stasiun.txt"))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                stasiuns.add(new Stasiun(Atribut[0], Atribut[1]));
            }
        } catch (Exception e) {

        }
        
    }
}