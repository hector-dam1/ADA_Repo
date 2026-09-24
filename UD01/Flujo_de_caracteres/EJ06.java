import java.io.*;
import java.util.Scanner;

public class EJ06 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la palabra clave a buscar: ");
        String palabraClave = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("resultado.txt"));

        String linea;
        int numLinea = 0;
        int coincidencias = 0;

        while ((linea = br.readLine()) != null) {
            numLinea++;
            if (linea.contains(palabraClave)) {
                pw.println("Línea " + numLinea + ": " + linea);
                coincidencias++;
            }
        }

        br.close();
        pw.close();

        System.out.println("Total de líneas procesadas: " + numLinea);
        System.out.println("Coincidencias encontradas: " + coincidencias);
    }
}