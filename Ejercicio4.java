import java.io.File;

public class Ejercicio4 {

    public static void mostrarArchivosPorExtension(File directorio, String extension) {
        if (directorio == null || !directorio.exists() || !directorio.isDirectory()) {
            System.out.println("Directorio no válido.");
            return;
        }

        if (!extension.startsWith(".")) {
            extension = "." + extension;
        }

        File[] lista = directorio.listFiles();
        if (lista != null) {
            System.out.println("Archivos con extensión '" + extension + "' en " + directorio.getName() + ":");
            for (File f : lista) {
                if (f.isFile() && f.getName().endsWith(extension)) {
                    System.out.println("- " + f.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        File rutaBase = new File(System.getProperty("user.home"), "Documentos/ADA/UD01");
        File carpeta = new File(rutaBase, "d/d1");

        mostrarArchivosPorExtension(carpeta, "txt");
    }
}