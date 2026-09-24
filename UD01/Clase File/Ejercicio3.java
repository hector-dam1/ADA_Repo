import java.io.File;
import java.util.Scanner;

public class Ejercicio3 {

    public static void listarDirectorio(File directorio, String sangria) {
        System.out.println(sangria + directorio.getName());

        String[] contenido = directorio.list();
        if (contenido == null) {
            return; // no es un directorio o está vacío
        }

        for (String nombre : contenido) {
            File elemento = new File(directorio, nombre);
            if (elemento.isDirectory()) {
                listarDirectorio(elemento, sangria + "\t");
            } else {
                System.out.println(sangria + "\t" + nombre);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la ruta del directorio que quieres listar: ");
        String directorio = sc.nextLine();
        File escritorio = new File(System.getProperty("user.home"));
        File raiz = new File(escritorio, directorio);

        if (!raiz.exists()) {
            System.out.println("No se encuentra el directorio: " + raiz.getAbsolutePath());
            return;
        }

        listarDirectorio(raiz, "");
    }
}
