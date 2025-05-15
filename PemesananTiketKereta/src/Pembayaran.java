public class Pembayaran {
    private String jenis;
    private double amount;
    private Tiket tiket;

    public Pembayaran(String jenis, double amount) {
        this.jenis=jenis;
        this.amount=amount;
    }

    public void setAmount(double Amount) {
        this.amount = Amount;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }    
}
