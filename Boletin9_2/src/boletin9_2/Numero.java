/*
 *2- Realiza un programa que calcule a suma e o producto dos números comprendidos entre 10 e 90 .
 */
package boletin9_2;

import java.util.Scanner;

/**
 *
 * @author lara vazquez dorna
 */
public class Numero {

    public void sumaProductoNumeros() {
        int i;
        int suma = 0;
        int producto = 0;

        for (i = 0; i < 2; i++) {
            int num = pedirNumeros();
            suma += num;
            producto = num;
            producto = producto * num;
        }
        System.out.println("\n la suma es :" + suma
                + " y el producto es: " + producto);
    }

    private int pedirNumeros() {
        int numero;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce un numero:");
            numero = teclado.nextInt();

        } while (numero < 10 || numero > 90);
        return numero;
    }

}
