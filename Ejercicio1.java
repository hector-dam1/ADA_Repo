import java.io.File;
import java.io.IOException;

public class Ejercicio1 {

    public static void crearEstructura() throws IOException {
        File escritorio = new File(System.getProperty("user.home"), "Documentos");

        File d = new File(escritorio, "d");
        d.mkdir();

        File d1 = new File(d, "d1");
        d1.mkdir();
        new File(d1, "f11").createNewFile();
        new File(d1, "f12").createNewFile();

        File d2 = new File(d, "d2");
        d2.mkdir();
        new File(d2, "d21").mkdir();
        new File(d2, "f21").createNewFile();

        File d22 = new File(d2, "d22");
        d22.mkdir();
        new File(d22, "f222").createNewFile();

        File d3 = new File(d, "d3");
        d3.mkdir();
        new File(d3, "d31").mkdir();
    }

    public static void main(String[] args) throws IOException {
        crearEstructura();
        System.out.println("Estructura creada en Documentos.");
    }
}