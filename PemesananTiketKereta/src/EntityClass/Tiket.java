package EntityClass;

public class Tiket {
    String idTiket;
    String nama;
    String nomorKursi;
    Jadwal jadwal;

    public Tiket(String idTiket, String nama, String nomorKursi, Jadwal jadwal) {
        this.idTiket = idTiket;
        this.nama = nama;
        this.nomorKursi = nomorKursi;
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
