import java.io.File;

public class Ejercicio3 {
    public static void listarEstructura(File directorio) {
        System.out.println(directorio.getName());

        String[] contenido = directorio.list();
        if (contenido != null) {
            for (String nombre : contenido) {
                File elemento = new File(directorio, nombre);
                if (elemento.isDirectory()) {
                    listarEstructura(elemento); 
                    System.out.println(elemento.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        File escritorio = new File(System.getProperty("user.home"), "Desktop");

        System.out.println("--- Estructura del ejercicio 1 ---");
        listarEstructura(new File(escritorio, "d"));

        System.out.println("\n--- Otra estructura de prueba ---");
        listarEstructura(new File(escritorio, "otraCarpeta"));
    }
}