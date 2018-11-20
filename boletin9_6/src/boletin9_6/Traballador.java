package boletin9_6;

import java.util.Scanner;

/**
 * Codifica un programa que Lea o soldo de cada un dos traballadores dunha
 * empresa e obteña o número deles que ganan entre 1000 e 1750 €, ámbolos dous
 * incluidos e, a porcentaje de traballadores que ganan menos de 1000 €.Tendo en
 * conta que non se coñece con antelación o numero de traballadores da empresa e
 * non se admiten os soldos negativos.( utiliza como condidión de fin un soldo 0
 * ). .
 */
/**
 *
 * @author Lara Vazquez Dorna
 */
public class Traballador {

    Scanner teclado = new Scanner(System.in);

    private double pedirSueldo() {

        double numero;
        do {
            System.out.println("Introduce sueldo :");
            numero = teclado.nextDouble();
        } while (numero < 0);
        return numero;

    }

    public void calcularTrabajadores() {
       double sueldo;
        int trabajadores = 0;
        int trabSueldoMas = 0;
        int trabSueldoMen=0;
        float porcentaje = 0;
        do {
            sueldo = pedirSueldo();
            trabajadores++;

            if (sueldo >= 1000 && sueldo <= 1750) {
                trabSueldoMas++;
                System.out.println("El numero de trabajadores con sueldo entre 1000€ y 1750€ es: " + trabSueldoMas);
            } else if (sueldo < 1000) {
                trabSueldoMen++;
                porcentaje = trabSueldoMen * 100 / trabajadores;

                System.out.println("El porcentaje de trabajadores con sueldo inferior a 1000€ es: " + porcentaje + "%");
            }
        } while (sueldo != 0);

    }

}
