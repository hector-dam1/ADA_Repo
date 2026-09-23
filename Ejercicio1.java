import java.io.File;
import java.io.IOException;

public class Ejercicio1 {

    public static void crearEstructura() {
        File rutaBase = new File(System.getProperty("user.home"), "Documentos/ADA/UD01");
        File d = new File(rutaBase, "d");

        try {
            File d1 = new File(d, "d1");
            d1.mkdirs(); // Crea d, d1 y todas las carpetas intermedias necesarias
            new File(d1, "f11").createNewFile();
            new File(d1, "f12").createNewFile();

            File d2 = new File(d, "d2");
            d2.mkdirs();
            new File(d2, "d21").mkdirs();
            new File(d2, "f21").createNewFile();

            File d22 = new File(d2, "d22");
            d22.mkdirs();
            new File(d22, "f222").createNewFile();

            File d3 = new File(d, "d3");
            d3.mkdirs();
            new File(d3, "d31").mkdirs();

            System.out.println("Estructura creada correctamente en: " + d.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error al crear la estructura: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        crearEstructura();
    }
}