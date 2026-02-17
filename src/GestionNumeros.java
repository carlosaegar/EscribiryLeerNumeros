import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestionNumeros {
    public static void main(String[] args) {

        // escribimos el archivo
        try (FileWriter escritor = new FileWriter("numeros.txt")) {
            for (int i = 1; i <= 10; i++) {
                escritor.write(i + "\n");
            }
            System.out.println("Archivo 'numeros.txt' generado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        // 2. LEER EL ARCHIVO Y MOSTRAR EN CONSOLA
        System.out.println("\nContenido del archivo:");
        // Metemos el File directamente en el Scanner
        try (Scanner lector = new Scanner(new File("numeros.txt"))) {
            while (lector.hasNextInt()) {
                System.out.println("Número: " + lector.nextInt());
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
