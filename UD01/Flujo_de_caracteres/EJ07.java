import java.io.*;

public class EJ07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("copia.txt"));

        String linea;
        while ((linea = br.readLine()) != null) {
            String modificada = linea.replace(" ", "").toUpperCase();
            pw.println(modificada);
        }

        br.close();
        pw.close();
    }
}