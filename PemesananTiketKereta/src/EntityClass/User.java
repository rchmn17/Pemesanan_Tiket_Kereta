package EntityClass;

import java.util.List;

public class User {

    String name;
    String password;
    List<Pemesanan> historyPemesanan;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHistoryPemesanan(List<Pemesanan> historyPemesanan) {
        this.historyPemesanan = historyPemesanan;
    }

    public String getPassword() {
        return password;
    }

    public List<Pemesanan> getHistoryPemesanan() {
        return historyPemesanan;
    }
}
