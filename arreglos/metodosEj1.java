/*
 *5.b.3. Crear un método que recibe una matriz de enteros, y devuelve un array con la media de los valores de
cada fila de la matriz. Crear una clase Prueba con un main que llame y compruebe el funcionamiento
del método anterior.
 */
package arreglos;

/**
 *
 * @author Jesús David Tovar Rojas
 */
public class metodosEj1 {
    public static double[] mediaPorFila(int[][] matriz) {
        double[] medias = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            medias[i] = (double) suma / matriz[i].length;
        }

        return medias;
    }
    public static void main(String[] args) {
        int[][] matriz = {
            {2, 4, 6, 8},
            {1, 2, 3},
            {10, 20, 30, 40, 50},
            {7, 7, 7}
        };
        double[] resultado = mediaPorFila(matriz);

        System.out.println("Medias por fila:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Fila " + i + ": " + resultado[i]);
     }
  }
}
