/*
 * 5.b.6. Realizar un método que reciba un array de números enteros y devuelva un array que tenga sólo uno
de cada 10 números del array original. Es decir, si el array original tiene 43 casillas el array devuelto
tendrá 5 con los valores de la casilla 0, la 10, la 20, la 30 y la 40;
 */
package arreglos;

/**
 *
 * @author Jesús David Tovar Rojas
 */
public class metodosEj2 {
        public static int[] unoDeCadaDiez(int[] original) {
        int cantidad = (original.length / 10) + 1;
        int[] resultado = new int[cantidad];
        int j = 0;
        for (int i = 0; i < original.length; i += 10) {
            resultado[j] = original[i];
            j++;
        }
      return resultado;
  }
    public static void main(String[] args) {
        int[] original = new int[43];
        for (int i = 0; i < original.length; i++) {
            original[i] = i;
     }
        int[] resultado = unoDeCadaDiez(original);
        System.out.println("Array resultado:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
     }
   }
}