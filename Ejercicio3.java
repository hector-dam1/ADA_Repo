import java.io.File;

public class Ejercicio3 {

    public static void listarCualquierEstructura(File directorio, String sangria) {
        if (directorio == null || !directorio.exists()) { //[cite: 1]
            System.out.println("El directorio especificado no existe.");
            return;
        }

        System.out.println(sangria + directorio.getName() + (directorio.isDirectory() ? "/" : ""));

        if (directorio.isDirectory()) {
            File[] elementos = directorio.listFiles();
            if (elementos != null) {
                for (File elem : elementos) {
                    listarCualquierEstructura(elem, sangria + "  ");
                }
            }
        }
    }

    public static void main(String[] args) {
        File rutaBase = new File(System.getProperty("user.home"), "Documentos/ADA/UD01");

        System.out.println("--- Prueba 1: Estructura 'd' ---");
        listarCualquierEstructura(new File(rutaBase, "d"), "");

        System.out.println("\n--- Prueba 2: Directorio UD01 completo ---");
        listarCualquierEstructura(rutaBase, "");
    }
}