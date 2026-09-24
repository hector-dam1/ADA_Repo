import java.io.File;

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
        File escritorio = new File(System.getProperty("user.home"), "Desktop");
        File carpeta = new File(escritorio, "d/d1");

        borrarTxt(carpeta);
    }
}