/*
1. Calcula a cantidade de números negativos, positivos e, ceros que hai nun grupo de 10 numeros .
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author lara vazquez dorna
 */
public class Numero {

    
    public void calcularSumaNumeros() {
        int i;
        int positivo = 0;
        int negativo = 0;
        int cero = 0;

        for (i = 0; i < 10; i++) {
            int num = pedirNumeros();
            if (num > 0) {
                positivo += num;
            } else if (num < 0) {
                negativo += num;
            } else {
                cero += num;
            }
        }
        System.out.println("\n De los 10 numeros dados: "
                + "\n\tnumeros positivos:\t" + positivo
                + "\n\tnumeros negativos:\t" + negativo
                + "\n\tnumeros cero:\t" + cero);
    }
    
    
    public void calcularNumeros() {
        int i;
        int positivo = 0;
        int negativo = 0;
        int cero = 0;

        for (i = 0; i < 10; i++) {
            int num = pedirNumeros();
            if (num > 0) {
                positivo ++;
            } else if (num < 0) {
                negativo ++;
            } else {
                cero ++;
            }
        }
        
        System.out.println("\n De los 10 numeros dados: "
                + "\n\tnumeros positivos:\t " + positivo
                + "\n\tnumeros negativos:\t" + negativo
                + "\n\tnumeros cero:     \t" + cero);
    }

    
    private int pedirNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = teclado.nextInt();
        return numero;

    }
}
