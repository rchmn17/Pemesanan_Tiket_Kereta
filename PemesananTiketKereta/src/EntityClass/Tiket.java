package EntityClass;

public class Tiket {
    String idTiket;
    String nama;
    String nomorKursi;
    Pemesanan pemesanan;

    public Tiket(String nama, String nomorKursi, Pemesanan pemesanan) {
        this.nama = nama;
        this.nomorKursi = nomorKursi;
        this.pemesanan = pemesanan;
    }
    
    public Tiket(String idTiket, String nama, String nomorKursi, Pemesanan pemesanan) {
        this.idTiket = idTiket;
        this.nama = nama;
        this.nomorKursi = nomorKursi;
        this.pemesanan = pemesanan;
    }

    public Pemesanan getPemesanan() {
        return pemesanan;
    }

    public void setPemesanan(Pemesanan pemesanan) {
        this.pemesanan = pemesanan;
    }


    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public String getNomorKursi() {
        return nomorKursi;
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
