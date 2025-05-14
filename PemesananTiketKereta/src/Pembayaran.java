public class Pembayaran {
    private String Jenis;
    private double Amount;
    Private Tiket tiket;

    public Pembayaran(String Jenis, double Amount) {
        this.Jenis=Jenis;
        this.Amount=Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }    
}
