package EntityClass;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Jadwal {
    private String idJadwal;
    private Kereta kereta;
    private LocalTime waktuKeberangkatan;
    private LocalTime waktuKedatangan;
    private Stasiun stasiunAwal;
    private Stasiun stasiunAkhir;
    private double harga;
    private int kursiTersedia;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Jadwal(String idJadwal, String kereta, String waktuKeberangkatan, String waktuKedatangan, String stasiunAwal, String stasiunAkhir, int kursiTersedia, List<Kereta> keretas, List<Stasiun> stasiuns) {
        this.idJadwal = idJadwal;
        setKereta(keretas, kereta);
        this.waktuKeberangkatan = LocalTime.parse(waktuKeberangkatan, formatter);
        this.waktuKedatangan = LocalTime.parse(waktuKedatangan, formatter);
        setStasiunAwal(stasiuns, stasiunAwal);
        setStasiunAkhir(stasiuns, stasiunAkhir);
        this.kursiTersedia = kursiTersedia;
    }

    public double getHarga() {
        return harga;
    }

    public String getIdJadwal() {
        return idJadwal;
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
    
    public void setKereta (List<Kereta> keretas, String nama) {
        for (Kereta elem : keretas) {
            if (nama.equals(elem.getNama())) {
                this.kereta = elem;
                setHarga(elem.getHarga());
            }
        }
    }

    public void setStasiunAkhir(List<Stasiun> stasiuns ,String nama) {
        for (Stasiun elem : stasiuns) {
            if (nama.equals(elem.getNama())) {
                this.stasiunAkhir = elem;
            }
        }
    }

    public void setStasiunAwal(List<Stasiun> stasiuns, String nama) {
        for (Stasiun elem : stasiuns) {
            if (nama.equals(elem.getNama())) {
                this.stasiunAwal = elem;
            }
        }
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }

    public Stasiun getStasiunAkhir() {
        return stasiunAkhir;
    }

    public Stasiun getStasiunAwal() {
        return stasiunAwal;
    }

    public Kereta getKereta() {
        return kereta;
    }

    public LocalTime getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public LocalTime getWaktuKedatangan() {
        return waktuKedatangan;
    }
    
    public String toString() {
        return kereta.getNama()+" "+waktuKeberangkatan+" "+waktuKedatangan+" "+kursiTersedia;
    }
}