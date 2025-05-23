package EntityClass;

public enum TipeKereta {
    EKONOMI(100_000),
    BISNIS(250_000),
    EXECUTIVE(500_000);

    private final int harga;

    private TipeKereta(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
}