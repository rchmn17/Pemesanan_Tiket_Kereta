
import java.time.LocalDate;

public class Jadwal {
    private Kereta kereta;
    private LocalDate waktuKeberangkatan;
    private LocalDate waktuKedatangan;
    private Stasiun stasiunAwal;
    private Stasiun stasiunAkhir;
    private double harga;
    private int kursiTersedia;

    public Jadwal(Kereta kereta, LocalDate waktuKeberangkatan, LocalDate waktuKedatangan, Stasiun stasiunAwal, Stasiun stasiunAkhir, double harga, int kursiTersedia) {
        this.kereta = kereta;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.stasiunAwal = stasiunAwal;
        this.stasiunAkhir = stasiunAkhir;
        this.harga = harga;
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
}