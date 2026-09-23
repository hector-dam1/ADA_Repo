import java.io.File;

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
        File escritorio = new File(System.getProperty("user.home"), "Desktop");
        File carpeta = new File(escritorio, "d/d1");

        mostrarPorExtension(carpeta, ".txt");
    }
}