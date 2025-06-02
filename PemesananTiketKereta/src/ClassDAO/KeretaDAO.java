package ClassDAO;

import EntityClass.Kereta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class KeretaDAO {
    private List<Kereta> keretas = new ArrayList<>();

    public KeretaDAO() {
        loadKeretas();
    }

    public void loadKeretas() {
        String basePath = System.getProperty("user.dir");
        String KeretaPath = basePath + File.separator + "Assest" + File.separator + "Kereta.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(KeretaPath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                keretas.add(new Kereta(Atribut[0], Atribut[1], Integer.parseInt(Atribut[2])));
            }
        } catch (Exception e) {

        }
        
    }

    public List<Kereta> getKeretas() {
        return this.keretas;
    }

    

}
