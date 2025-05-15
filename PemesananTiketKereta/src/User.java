import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
        return "";
    }

    public static void buatAkun(String UserName, String password) {
        String path = "./PemesananTiketKereta/Users/"+UserName;
        String path2 = path +"/";
        File pathDir = new File(path);
        File[] pathFile = new File[3];
        pathFile[0] = new File(path2+"Password.txt");
        pathFile[1] = new File(path2+"Id.txt");
        pathFile[2] = new File(path2+"History.txt");
        

        // bikin folder
        if (!pathDir.exists()) {
            boolean tes = false;
            try {
                pathDir.mkdir();
                tes = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (tes) {
                System.out.println("folderBerhasilDibuat");
            }
        } else {
            System.out.println("folderSudahAda");
        }


        // bikin setUp file
        for (File p : pathFile) {
            if (!p.exists()) {
                boolean tes = false;
                try {
                    p.createNewFile();
                    tes = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (tes) {
                    System.out.println("UserBerhasilDisetup");
                }
            } else {
                System.out.println("Eror");
            }
        }

        //menulis isi file
        
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile[0]))) {
                writer.write(password);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
}
