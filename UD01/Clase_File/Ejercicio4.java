import java.io.File;
import java.util.Scanner;

public class Ejercicio4 {

    public static void mostrarPorExtension(File directorio, String extension) {
        String[] contenido = directorio.list();
        if (contenido != null) {
            for (String nombre : contenido) {
                File elemento = new File(directorio, nombre);
                if (elemento.isFile() && nombre.endsWith(extension)) {
                    System.out.println(nombre);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la ruta del directorio que quieres listar: ");
        String directorio = sc.nextLine();
        System.out.print("Dime el tipo de archivo que quieres listar (incluye el .): ");
        String formato = sc.nextLine();

        File escritorio = new File(System.getProperty("user.home"));
        File carpeta = new File(escritorio, "Documentos/ADA/ADA_Repo/UD01/Clase_File");

        mostrarPorExtension(carpeta, formato);
    }
}
