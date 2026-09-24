import java.io.*;

public class EJ01 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("fichero.txt");
        pw.println("Hola, Mundo");
        pw.close();
    }
}