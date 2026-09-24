import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class EJ05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));
        String linea;
        int numPalabras = 0;

        while ((linea = br.readLine()) != null) {
            if (!linea.trim().isEmpty()) {
                String[] palabras = linea.trim().split("\\s+");
                numPalabras += palabras.length;
            }
        }
        br.close();

        System.out.println("Número total de palabras: " + numPalabras);
    }
}