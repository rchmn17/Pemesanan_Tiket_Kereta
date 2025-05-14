import java.util.ArrayList;
import java.util.List;
public class Kereta {
    // Atribut ============================
    private String Nama;
    private List<TipeKereta> TipeKereta = new ArrayList<>();

    // Method =============================
    public Kereta(String Nama) {
        this.Nama = Nama;
    }

    public void addTipe(TipeKereta TipeKereta) {
        this.TipeKereta.add(TipeKereta);
    }

    public TipeKereta getTipeKereta(){
        return TipeKereta.getFirst();
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
}