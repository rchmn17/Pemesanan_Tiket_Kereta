package EntityClass;

public class Tiket {
    User user;
    String nomorKursi;
    String idTiket;
    Jadwal jadwal;

    public Tiket(User user, String nomorKursi, String idTiket, Jadwal jadwal) {
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }
}
