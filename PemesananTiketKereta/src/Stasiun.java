class Stasiun {
    String nama;
    String kota;
    public static Stasiun[] listStasiun = {new Stasiun("jatiLuhur", "Surabaya"), new Stasiun("suhungMambro", "Medan")};

    Stasiun(String nama, String kota) {
        this.nama = nama;
        this.kota = kota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKota() {
        return kota;
    }


}
