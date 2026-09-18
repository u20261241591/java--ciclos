/*
 * 4.a.11. Escribe un programa que pida al usuario rellenar un array de enteros. Después le pide por teclado
dos números, el límite y el valor de sustitución. El programa debe sustituir, por el valor de sustitución,
todos los valores del array que estén por encima del límite. Finalmente debe mostrar el array resultado.
Ejemplo:
Array: 2 5 34 53 2 -2
Límite: 3
Sustitución: 0
Resultado: 2 0 0 0 2 -2
 *
 */
package arreglos;
    import java.util.Scanner;
/**
 *
 * @author Jesús David Tovar Rojas
 */
public class arreglosEj5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = sc.nextInt();
        int[] numeros = new int[tamano];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.print("Ingrese el límite: ");
        int limite = sc.nextInt();
        System.out.print("Ingrese el valor de sustitución: ");
        int sustitucion = sc.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > limite) {
                numeros[i] = sustitucion;
        }
    }
        System.out.println("\nArray resultado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
