import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class EJ04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
    }
}