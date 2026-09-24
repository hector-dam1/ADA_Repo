import java.io.IOException;
import java.io.FileReader;

public class EJ03 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("fichero.txt");
        int c;
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
        }
        fr.close();
    }
}