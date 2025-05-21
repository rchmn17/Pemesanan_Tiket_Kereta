public class Kereta {
    private String Nama;
    private String TipeKereta;
    private int harga;

    public Kereta(String Nama, String tipe, int harga) {
        this.Nama = Nama;
        this.TipeKereta = tipe;
        this.harga = harga;
    }

    public String getTipeKereta(){
        return TipeKereta;
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