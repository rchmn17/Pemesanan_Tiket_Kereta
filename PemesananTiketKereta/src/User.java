import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

class User {
    String name;
    String password;
    ArrayList<String> history;

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

    public static void buatAkun(String userName, String password) {
        String basePath = System.getProperty("user.dir");
        String userPath = basePath + File.separator + "PemesananTiketKereta" + File.separator + "Users" + File.separator + userName;

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

    public static User login(String userName, String inputPassword) {
        String basePath = System.getProperty("user.dir");
        String userPath = basePath + File.separator + "PemesananTiketKereta" + File.separator + "Users" + File.separator + userName;
        File userFolder = new File(userPath);

        if (!userFolder.exists() || !userFolder.isDirectory()) {
            System.out.println("User not found.");
            return null;
        }

        File passwordFile = new File(userPath + File.separator + "password.txt");

        if (!passwordFile.exists()) {
            System.out.println("Password file not found.");
            return null;
        }

        try {
            String savedPassword = Files.readString(passwordFile.toPath()).trim();
            if (savedPassword.equals(inputPassword)) {
                System.out.println("Login successful!");
                return new User(userName, savedPassword);
            } else {
                System.out.println("Incorrect password.");
                return null;
            }
        } catch (IOException e) {
            System.out.println("Error reading password file: " + e.getMessage());
            return null;
        }
    }
}