/*
 * 4.a.22.Rellenar aleatoriamente un array de 5 números enteros, y posteriormente indicar si los números están
ordenados de forma creciente, decreciente, o si están desordenados.
 */
package arreglos;
    import java.util.Random;

/**
 *
 * @author Jesús David Tovar Rojas
 */
public class arreglosEj7 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(100) + 1;
    }
        System.out.println("Array generado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
      }
        System.out.println();
        boolean creciente = true;
        boolean decreciente = true;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                creciente = false;
         }
            if (numeros[i] < numeros[i + 1]) {
                decreciente = false;
         }
      }
        if (creciente) {
            System.out.println("El array está ordenado de forma CRECIENTE.");
        } else if (decreciente) {
            System.out.println("El array está ordenado de forma DECRECIENTE.");
        } else {
            System.out.println("El array está DESORDENADO.");
     }
 }
}
