/*
 * 4.a.9. Crear un array de números de un tamaño pasado por teclado. Rellenar el array con números
aleatorios entre 1 y 100. Mostrar aquellos números del array que sean múltiplos de otro número, que
nosotros le debemos indicar por teclado
 */
package arreglos;
    import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Jesús David Tovar Rojas
 */
public class arreglosEj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = sc.nextInt();
        int[] numeros = new int[tamano];
        // Rellenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(100) + 1; // genera entre 1 y 100
        }
        System.out.println("\nArray generado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
     }
        System.out.print("\n\nIngrese el número del cual desea ver los múltiplos: ");
        int divisor = sc.nextInt();
        System.out.println("\nNúmeros múltiplos de " + divisor + ":");
        boolean hayMultiplos = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % divisor == 0) {
                System.out.print(numeros[i] + " ");
                hayMultiplos = true;
            }
        }
        if (!hayMultiplos) {
            System.out.println("No se encontraron múltiplos de " + divisor + " en el array.");
     }
  }
}
