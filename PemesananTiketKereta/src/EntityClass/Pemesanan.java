package EntityClass;

import java.util.List;

public class Pemesanan {
    private String idPesanan;
    private Jadwal jadwal;
    private String hari;
    private String tanggal;
    private User userPembeli;
    private List<Tiket> itemOrder;

    public Pemesanan(String idPesanan, Jadwal jadwal, String hari, String tanggal, User userPembeli, List<Tiket> itemOrder) {
        this.idPesanan = idPesanan;
        this.jadwal = jadwal;
        this.hari = hari;
        this.tanggal = tanggal;
        this.userPembeli = userPembeli;
        this.itemOrder = itemOrder;
    }
    
    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public User getUserPembeli() {
        return userPembeli;
    }

    public void setUserPembeli(User userPembeli) {
        this.userPembeli = userPembeli;
    }

    public List<Tiket> getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(List<Tiket> itemOrder) {
        this.itemOrder = itemOrder;
    }
}