import java.util.ArrayList;

class User {
    String name;
    String password;
    ArrayList <String> history;

    User(String name, String password) {
        this.name = name;
        this.password = password;
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

    public void setHistory() {
        
    }

    public String getHistory() {

    }
}
