
class Tiket {
    String nomorKursi;
    String kode;
    Jadwal jadwal;

    Tiket(String nomorKursi, String kode, Jadwal jadwal) {
        this.nomorKursi = nomorKursi;
        this.kode = kode;
        this.jadwal = jadwal;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public String getKode() {
        return kode;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }
}
