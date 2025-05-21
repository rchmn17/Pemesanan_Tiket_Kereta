

public class Main {
    public static void main(String[] args) {
        // User.buatAkun("anjay", "123");
        TiketManager tm = new TiketManager();


        for (Jadwal elem : tm.getJadwals()) {
            System.out.println(elem.toString());
        }

    }
}
