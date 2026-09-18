/*
 * 5.c.4. Crear un método que muestre en binario un número entre 0 y 255
 */
package arreglos;

/**
 *
 * @author Jesús David Tovar Rojas
 */
public class metodosEj3 {
        public static void mostrarBinario(int numero) {
        String binario = "";
        for (int i = 7; i >= 0; i--) {
            int bit = (numero >> i) & 1;
            binario += bit;
        }
        System.out.println(numero + " en binario es: " + binario);
    }
    public static void main(String[] args) {
        mostrarBinario(0);
        mostrarBinario(1);
        mostrarBinario(10);
        mostrarBinario(255);
        mostrarBinario(128);
    }
}
