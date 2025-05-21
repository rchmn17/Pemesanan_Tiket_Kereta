import java.util.List;

public class Main {
    public static void main(String[] args) {
        // User.buatAkun("anjay", "123");
        TiketManager tm = new TiketManager();

        List<Jadwal> jd = tm.cariJadwal("jatiLuhur", "suhungMambro");
        for (Jadwal elem : jd) {
            System.out.println(elem.toString());
        }
    }
}
