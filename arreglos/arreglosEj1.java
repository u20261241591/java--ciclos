/*
*4.a.2. Hacer un bucle que pida por teclado 10 números enteros y los almacene en un array, y que se calcule
posteriormente la suma de los números que sean pares y la suma de los números que sean impares, y
que nos diga por pantalla cual de las dos sumas es mayor
*
*/
package arreglos;
    import java.util.Scanner;

/**
 *
 * @author Jesús David Tovar Rojas
 */
public class arreglosEj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares +=numeros[i];
         }
    }
        System.out.println("\nSuma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        if (sumaPares>sumaImpares) {
            System.out.println("La suma de los pares es mayor.");
        } else if (sumaImpares>sumaPares) {
            System.out.println("La suma de los impares es mayor.");
        } else { System.out.println("Ambas sumas son iguales.");
     }
  }
}

