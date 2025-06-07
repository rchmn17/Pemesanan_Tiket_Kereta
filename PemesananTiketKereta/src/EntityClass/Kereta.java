package EntityClass;

public class Kereta {
    private String Nama;
    private String tipeKereta;
    private int harga;

    public Kereta(String Nama, String tipe, int harga) {
        this.Nama = Nama;
        this.tipeKereta = tipe;
        this.harga = harga;
    }

    public String getTipeKereta(){
        return tipeKereta;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public String getNama() {
        return this.Nama;
    }

    public int getHarga() {
        return this.harga;
    }
}