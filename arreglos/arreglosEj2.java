/*
 *4.a.6. Pedir por teclado las notas de 8 estudiantes y guardarlas en un array de notas. Las notas serán números
decimales. Tras leer las notas en un bucle inicial, procesar en otro bucle la información y mostrar por
pantalla:
1. la nota más alta
2. la nota más baja
3. la nota media de todas las notas
4. el número de aprobados
5. el número de suspensos
 *
 */

package arreglos;
    import java.util.Scanner;
/**
 *
 * @author Jesús David Tovar Rojas
 */
public class arreglosEj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];
 for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double notaMasAlta = notas[0];
        double notaMasBaja = notas[0];
        double suma = 0;
        int aprobados = 0;
        int suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
            if (notas[i] < notaMasBaja) {
                notaMasBaja = notas[i];
            }
            suma += notas[i];
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        double media = suma / notas.length;
        System.out.println("\n--- Resultados ---");
        System.out.println("Nota más alta: " + notaMasAlta);
        System.out.println("Nota más baja: " + notaMasBaja);
        System.out.println("Nota media: " + media);
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
    }
}
