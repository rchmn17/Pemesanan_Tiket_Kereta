/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassDAO;

import EntityClass.Jadwal;
import EntityClass.Tiket;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class TiketDAO {
    private List<Tiket> tikets = new ArrayList<>();
    private JadwalDAO jDAO = new JadwalDAO();
    
    public TiketDAO() {
        loadTikets(jDAO.getJadwals());
    }
    
    public void loadTikets(List<Jadwal> jadwals) {
        String basePath = System.getProperty("user.dir");
        String JadwalPath = basePath + File.separator + "Assest" + File.separator + "Tiket.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(JadwalPath))) {
            String Line;
            while ((Line = reader.readLine()) != null) {
                String[] Atribut = Line.split(" ");
                tikets.add(new Tiket(Atribut[0], Atribut[1], Atribut[2], jDAO.cariJadwaldariID(Atribut[3])));
            }
        } catch (Exception e) {

        }
    }
    
    public List<Tiket> cariTiketdariJadwal(Jadwal jadwal){
        List<Tiket> tiketBaru = new ArrayList<>();
        for (Tiket t : tikets) {
            if (t.getJadwal().getIdJadwal().equals(jadwal)){
                tiketBaru.add(t);
            }
        }
        return tiketBaru;
    }
    
    public List<Tiket> getTikets() {
        return tikets;
    }
}
