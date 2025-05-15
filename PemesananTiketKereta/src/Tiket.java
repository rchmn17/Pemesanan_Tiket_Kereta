import java.time.LocalDate;

class Tiket {
    String nomorKursi;
    String kode;
    LocalDate jadwal;

    Tiket(String nomorKursi, String kode, int year, int month, int day) {
        this.nomorKursi = nomorKursi;
        this.kode = kode;
        this.jadwal = LocalDate.of(year, month, day);
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

    public void setJadwal(int year, int month, int day) {
        this.jadwal = LocalDate.of(year, month, day);
    }

    public LocalDate getJadwal() {
        return jadwal;
    }
}
