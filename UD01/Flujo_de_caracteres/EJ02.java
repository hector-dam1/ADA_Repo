import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class EJ02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fichero.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Añadiendo una nueva línea al fichero.");
        pw.close();
    }
}
