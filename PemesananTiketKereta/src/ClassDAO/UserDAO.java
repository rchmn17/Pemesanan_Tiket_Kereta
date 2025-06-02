package ClassDAO;

import EntityClass.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class UserDAO {
    private ArrayList<User> users = new ArrayList<>();

    public UserDAO() {
        loadUsers();
    }
    
    public void loadUsers() {
        String path = System.getProperty("user.dir") + File.separator + "Users";

        File folder = new File(path);
        if(folder.isDirectory()) {
            String[] listNamaUser = folder.list();
            for (int i=0 ;i<listNamaUser.length; i++) {
                String passpath = path+File.separator+listNamaUser[i]+File.separator+"Password.txt";
                try (BufferedReader reader = new BufferedReader(new FileReader(passpath))){
                    String Line = reader.readLine();
                    users.add(new User(listNamaUser[i], Line));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void buatAkun(String userName, String password) {
        String basePath = System.getProperty("user.dir");
        String userPath = basePath + File.separator + "Users" + File.separator + userName;

        File userDir = new File(userPath);
        File passwordFile = new File(userDir, "Password.txt");
        File historyFile = new File(userDir, "History.txt");

        if (!userDir.exists()) {
            if (userDir.mkdirs()) {
                System.out.println("Folder berhasil dibuat.");
            } else {
                System.out.println("Gagal membuat folder.");
                return;
            }
        } else {
            System.out.println("Folder sudah ada.");
        }

        try (FileWriter writer = new FileWriter(passwordFile)) {
            writer.write(password);
            System.out.println("Password berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Error menulis password: " + e.getMessage());
        }

        try {
            if (historyFile.createNewFile()) {
                System.out.println("File history dibuat.");
            } else {
                System.out.println("File history sudah ada.");
            }
        } catch (IOException e) {
            System.out.println("Error membuat file history: " + e.getMessage());
        }
    }
    
    public User login(String username, String password) {
        for (User elem : users) {
            if(username.equals(elem.getName())) {
                if (checkPassword(elem, password)) {
                    return elem;
                } else {
                    return null;
                }
            }
        }
        System.out.println("User not found");
        return null;
    }
    
    public boolean checkPassword(User user, String pass) {
        return user.getPassword().equals(pass);
    }
}