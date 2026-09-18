/*
 * EVALUACION 1 HECHA A ESTUDIANTES 2025-2
 */
package arreglos;
   import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jesús David Tovar Rojas
 */
public class evaluacionSemestre20252 {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                              "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static double[] generarTemperaturasAnuales(boolean aleatorio, double min, double max) {
        double[] temperaturas = new double[12];
        if (aleatorio) {
            for (int i = 0; i < temperaturas.length; i++) {
                temperaturas[i] = min + (rnd.nextDouble() * (max - min));
            }
        } else {
            for (int i = 0; i < temperaturas.length; i++) {
                System.out.print("Ingrese la temperatura de " + meses[i] + " (entre "
                        + min + " y " + max + "): ");
                double valor = sc.nextDouble();

                while (valor < min || valor > max) {
                    System.out.print("Valor fuera de rango. Ingrese de nuevo (" + min + " - " + max + "): ");
                    valor = sc.nextDouble();
                }
                temperaturas[i] = valor;
            }
        }
        return temperaturas;
    }

    public static double calcularPromedio(double[] temperaturas) {
        double suma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
        }
        return suma / temperaturas.length;
    }
    public static String compararSubestaciones(double[] t1, double[] t2, String nombre1, String nombre2) {
        double promedio1 = calcularPromedio(t1);
        double promedio2 = calcularPromedio(t2);

        if (promedio1 > promedio2) {
            return nombre1 + " fue más cálida que " + nombre2
                    + " (" + String.format("%.2f", promedio1) + "°C vs " + String.format("%.2f", promedio2) + "°C)";
        } else if (promedio2 > promedio1) {
            return nombre2 + " fue más cálida que " + nombre1
                    + " (" + String.format("%.2f", promedio2) + "°C vs " + String.format("%.2f", promedio1) + "°C)";
        } else {
            return nombre1 + " y " + nombre2 + " tuvieron el mismo promedio anual ("
                    + String.format("%.2f", promedio1) + "°C)";
        }
    }
    public static int[] detectarAnomalias(double[] temperaturas) {
        double promedio = calcularPromedio(temperaturas);
        double limiteSuperior = promedio + (promedio * 0.20);
        double limiteInferior = promedio - (promedio * 0.20);

        int cantidad = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > limiteSuperior || temperaturas[i] < limiteInferior) {
                cantidad++;
            }
        }

        int[] indicesAnomalias = new int[cantidad];
        int j = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > limiteSuperior || temperaturas[i] < limiteInferior) {
                indicesAnomalias[j] = i;
                j++;
            }
        }

        return indicesAnomalias;
    }

    public static void reporteMensual(String nombre, double[] temperaturas) {
        System.out.println("\n=== Reporte de " + nombre + " ===");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("%-12s: %.2f°C%n", meses[i], temperaturas[i]);
        }

        double promedio = calcularPromedio(temperaturas);

        int indiceMax = 0;
        int indiceMin = 0;
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturas[indiceMax]) {
                indiceMax = i;
            }
            if (temperaturas[i] < temperaturas[indiceMin]) {
                indiceMin = i;
            }
        }

        System.out.println("-------------------------------");
        System.out.println("Mes más cálido : " + meses[indiceMax] + " (" + String.format("%.2f", temperaturas[indiceMax]) + "°C)");
        System.out.println("Mes más frío   : " + meses[indiceMin] + " (" + String.format("%.2f", temperaturas[indiceMin]) + "°C)");
        System.out.println("Promedio anual : " + String.format("%.2f", promedio) + "°C");

        int[] anomalias = detectarAnomalias(temperaturas);
        System.out.print("Meses con anomalías térmicas: ");
        if (anomalias.length == 0) {
            System.out.println("Ninguno");
        } else {
            for (int i = 0; i < anomalias.length; i++) {
                System.out.print(meses[anomalias[i]]);
                if (i < anomalias.length - 1) System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("=== MONITOR CLIMÁTICO REGIONAL - HUILA ===\n");

        System.out.print("¿Desea generar los datos de forma aleatoria? (true/false): ");
        boolean aleatorio = sc.nextBoolean();

        System.out.print("Ingrese la temperatura mínima permitida: ");
        double min = sc.nextDouble();

        System.out.print("Ingrese la temperatura máxima permitida: ");
        double max = sc.nextDouble();

        System.out.println("\n--- Generando datos de Rivera ---");
        double[] rivera = generarTemperaturasAnuales(aleatorio, min, max);

        System.out.println("\n--- Generando datos de Neiva ---");
        double[] neiva = generarTemperaturasAnuales(aleatorio, min, max);

        System.out.println("\n--- Generando datos de Campoalegre ---");
        double[] campoalegre = generarTemperaturasAnuales(aleatorio, min, max);

        reporteMensual("Rivera", rivera);
        reporteMensual("Neiva", neiva);
        reporteMensual("Campoalegre", campoalegre);

        System.out.println("\n=== COMPARACIÓN ENTRE SUBESTACIONES ===");
        System.out.println(compararSubestaciones(rivera, neiva, "Rivera", "Neiva"));
        System.out.println(compararSubestaciones(rivera, campoalegre, "Rivera", "Campoalegre"));
        System.out.println(compararSubestaciones(neiva, campoalegre, "Neiva", "Campoalegre"));
   }
}
