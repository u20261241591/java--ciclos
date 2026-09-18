/*
 * 4.a.15.Crear un array con 20 elementos de modo que los elementos de índice par tengan como valor 0 y las
de índice impar 1. Se pinta luego el array, pero mostrando 5 números por línea
 */
package arreglos;

/**
 *
 * @author ang98
 */
public class arreglosEj6 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                numeros[i] = 0;
            } else {
                numeros[i] = 1;
           }
     }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }        }
   }
}