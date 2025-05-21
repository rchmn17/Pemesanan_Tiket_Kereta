import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TiketManager {
    private List<Tiket> tikets = new ArrayList<>();
    public static List<Jadwal> jadwals = new ArrayList<>();

    public TiketManager() {
    }

    public void pesanTiket(){
    }

    public void batalkanTiket(){
    }

    public List<Jadwal> getJadwals() {
        return jadwals;
    }

    public List<Tiket> getTikets() {
        return tikets;
    }

    public static void setJadwals() {
        try(BufferedReader reader = new BufferedReader(new FileReader("./Assest/Jadwal.txt"))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                jadwals.add(new Jadwal(Atribut[0], Atribut[1], Atribut[2], Atribut[3], Atribut[4], Integer.parseInt(Atribut[5])));
            }
        } catch (Exception e) {

        }
        
    }

    public void setTikets(List<Tiket> tikets) {
        
    }


}
