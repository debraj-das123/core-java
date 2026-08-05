package FileHandling;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FolderFileRead {
    public static void main(String[] args) {

        try {
            // 1️⃣ Folder path
            File folder = new File("2ndFolder");

            // 2️⃣ File path inside folder
            File file = new File(folder, "data.txt");

            // 3️⃣ Read file
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("----- File Content -----");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
