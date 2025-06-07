package ClassDAO;

import EntityClass.Stasiun;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StasiunDAO {
    private List<Stasiun> stasiuns = new ArrayList<>();

    public StasiunDAO() {
        loadStasiuns();
    }
    
    private void loadStasiuns() {
        String basePath = System.getProperty("user.dir");
        String StasiunPath = basePath + File.separator + "Assets" + File.separator + "Stasiun.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(StasiunPath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                stasiuns.add(new Stasiun(Atribut[0], Atribut[1]));
            }
        } catch (Exception e) {

        }
    }

    public List<Stasiun> getStasiuns() {
        return this.stasiuns;
    }
}
