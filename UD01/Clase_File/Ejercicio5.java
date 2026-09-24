import java.io.File;
import java.util.Scanner;

public class Ejercicio5 {

    public static void borrarTxt(File directorio) {
        String[] contenido = directorio.list();
        if (contenido != null) {
            for (String nombre : contenido) {
                File elemento = new File(directorio, nombre);
                if (elemento.isFile() && nombre.endsWith(".txt")) {
                    if (elemento.delete()) {
                        System.out.println("Eliminado: " + nombre);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la ruta de donde estan los txt que quieres borrar: ");
        String directorio = sc.nextLine();

        File escritorio = new File(System.getProperty("user.home"));
        File carpeta = new File(escritorio, directorio);

        borrarTxt(carpeta);
    }
}

