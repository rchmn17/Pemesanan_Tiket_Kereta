public class Main {
    public static void main(String[] args) {
        // User.buatAkun("anjay", "123");
        TiketManager.setJadwals();

        for (Jadwal elem : TiketManager.jadwals) {
            System.out.println(elem.toString());
        }

    }
}
