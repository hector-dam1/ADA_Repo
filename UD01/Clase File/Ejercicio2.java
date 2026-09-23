import java.io.File;

public class Ejercicio2 {

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
        File escritorio = new File(System.getProperty("user.home"), "Documentos");
        File raiz = new File(escritorio, "d");

        if (!raiz.exists()) {
            System.out.println("No se encuentra el directorio: " + raiz.getAbsolutePath());
            return;
        }

        listarDirectorio(raiz, "");
    }
}
