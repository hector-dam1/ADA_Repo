import java.io.File;

public class Ejercicio2 {

    public static void listarEstructura(File elemento, String sangria) {
        System.out.println(sangria + elemento.getName());

        if (elemento.isDirectory()) { 
            File[] contenido = elemento.listFiles();
            if (contenido != null) {
                for (File hijo : contenido) {
                    listarEstructura(hijo, sangria + "\t");
                }
            }
        }
    }

    public static void main(String[] args) {
        File rutaBase = new File(System.getProperty("user.home"), "Documentos/ADA/UD01");
        File raiz = new File(rutaBase, "d");

        if (raiz.exists()) { 
            listarEstructura(raiz, "");
        } else {
            System.out.println("No existe el directorio 'd'. Ejecuta primero el Ejercicio 1.");
        }
    }
}