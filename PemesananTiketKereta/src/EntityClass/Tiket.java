package EntityClass;

public class Tiket {
    String nama;
    String nomorKursi;
    String idTiket;
    Jadwal jadwal;

    public Tiket(String nama, String nomorKursi, String idTiket, Jadwal jadwal) {
        this.nama = nama;
        this.nomorKursi = nomorKursi;
        this.idTiket = idTiket;
        this.jadwal = jadwal;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }
    
    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }
}
