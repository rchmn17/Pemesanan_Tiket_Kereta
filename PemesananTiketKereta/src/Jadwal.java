
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Jadwal {
    private Kereta kereta;
    private LocalTime waktuKeberangkatan;
    private LocalTime waktuKedatangan;
    private Stasiun stasiunAwal;
    private Stasiun stasiunAkhir;
    private double harga;
    private int kursiTersedia;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Jadwal(String kereta, String waktuKeberangkatan, String waktuKedatangan, String stasiunAwal, String stasiunAkhir, int kursiTersedia) {
        setKereta(kereta);
        this.waktuKeberangkatan = LocalTime.parse(waktuKeberangkatan, formatter);
        this.waktuKedatangan = LocalTime.parse(waktuKedatangan, formatter);
        setStasiunAwal(stasiunAwal);
        setStasiunAkhir(stasiunAkhir);
        this.kursiTersedia = kursiTersedia;
    }

    public double getHarga() {
        return harga;
    }

    public int getKursiTersedia() {
        return kursiTersedia;
    }

    public void setKursiTersedia(int kursiTersedia) {
        this.kursiTersedia = kursiTersedia;
    }

    public void kurangiKursi(){
        setKursiTersedia(getKursiTersedia()-1);        
    }

    public void setKereta (String nama) {
        for (Kereta elem : Kereta.listKereta) {
            if (nama.equals(elem.getNama())) {
                this.kereta = elem;
            }
        }
    }

    public void setStasiunAkhir (String nama) {
        for (Stasiun elem : Stasiun.listStasiun) {
            if (nama.equals(elem.getNama())) {
                this.stasiunAkhir = elem;
            }
        }
    }

    public void setStasiunAwal (String nama) {
        for (Stasiun elem : Stasiun.listStasiun) {
            if (nama.equals(elem.getNama())) {
                this.stasiunAwal = elem;
            }
        }
    
    }
    
    public String toString() {
        return kereta.getNama()+" "+waktuKeberangkatan+" "+waktuKedatangan+" "+kursiTersedia;
    }


}