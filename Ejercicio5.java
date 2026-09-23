import java.io.File;

public class Ejercicio5 {

    public static void borrarArchivosTxt(File directorio) {
        if (directorio == null || !directorio.exists() || !directorio.isDirectory()) {
            System.out.println("Directorio no válido.");
            return;
        }

        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File f : archivos) {
                if (f.isFile() && f.getName().toLowerCase().endsWith(".txt")) {
                    if (f.delete()) {
                        System.out.println("Eliminado: " + f.getName());
                    } else {
                        System.out.println("No se pudo eliminar: " + f.getName());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        File rutaBase = new File(System.getProperty("user.home"), "Documentos/ADA/UD01");
        File carpeta = new File(rutaBase, "d/d1");

        borrarArchivosTxt(carpeta);
    }
}