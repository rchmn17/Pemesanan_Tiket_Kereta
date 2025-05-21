public class Kereta {
    // Atribut ============================
    private String Nama;
    private String TipeKereta;
    private int harga;

    // Method =============================
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

    public String getNama() {
        return this.Nama;
    }

    public int getHarga() {
        return this.harga;
    }

    

    
    


}