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

    private int pedirSueldo() {

        int numero;
        do {
            System.out.println("Introduce sueldo :");
            numero = teclado.nextInt();
        } while (numero < 0);
        return numero;

    }

    public void calcularTrabajadores() {
        int sueldo = pedirSueldo();
        do {

            int trabajadores = 0;
            int porcentaje = 0;

            if (sueldo >= 1000 && sueldo <= 1750) {
                trabajadores++;
                System.out.println("El numero de trabajadores con sueldo entre 1000€ y 1750€ es: " + trabajadores);
            } else if (sueldo < 1000) {
                porcentaje++;
                porcentaje = porcentaje / 100;

                System.out.println("El porcentaje de trabajadores con sueldo inferior a 1000€ es: " + porcentaje + "%");
            }
        } while (sueldo == 0);

    }

}
