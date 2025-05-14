import java.util.ArrayList;
import java.util.List;

public class TiketManager {
    private List<Tiket> tikets = new ArrayList<>();
    private List<Jadwal> jadwals = new ArrayList<>();

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

    public void setJadwals(List<Jadwal> jadwals) {
        this.jadwals = jadwals;
    }

    public void setTikets(List<Tiket> tikets) {
        this.tikets = tikets;
    }


}
