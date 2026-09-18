/*
 * 4.a.10.Realiza un programa que pida por teclado 10 números enteros y los almacene en un array.
Posteriormente, nos dice si hay dos números iguales seguidos, esto es, si alguna posición del array que
tenga el mismo número que la posición siguiente del array.
 *
 */
package arreglos;
    import java.util.Scanner;

/**
 *
 * @author Jesús David Tovar Rojas
 */
public class arreglosEj4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer los 10 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        boolean encontrado = false;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == numeros[i + 1]) {
                System.out.println("Los números iguales seguidos están en las posiciones " 
                        + i + " y " + (i + 1) + " (valor: " + numeros[i] + ")");
                encontrado = true;         }
   }
        if (!encontrado) {
            System.out.println("No hay números iguales seguidos en el array.");
     }
    }
}
