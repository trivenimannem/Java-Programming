import java.io.FileReader;
import java.io.IOException;

public class Throws{
    public static void readFile() throws IOException{
        FileReader file = new FileReader("non_existent_file.txt");
    }

    public static void main(String[] args) {
        try {
           readFile();
        } catch (IOException e) {
            System.out.println("Error handled in main: File could not be found or read.");
        }
    }
}
