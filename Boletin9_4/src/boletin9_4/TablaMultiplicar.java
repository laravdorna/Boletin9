/*
 * T4- Codifica un programa que solicite un número e, visualice a táboa de multiplicar dese número.
 * O programa rematara cando prememos o cero.
 */
package boletin9_4;

import java.util.Scanner;

/**
 *
 * @author lvazquezdorna
 */
public class TablaMultiplicar {

    Scanner teclado = new Scanner(System.in);

    //metodo que  pida por pantalla un numero que tiene que ser 0 o positivo
    private int pedirNumero() {

        int numero;
        do {
            System.out.println("Introduce base de la tabla de multiplicar para mostrarla:");
            numero = teclado.nextInt();
        } while (numero < 0);
        return numero;
    }

    //metodo que llama al metodo numero y calcula la tabla de multiplicar de dicho numero
    public void calcularTabla() {
        int numero= pedirNumero();
        int result;
        System.out.println("\n---Tabla del numero " + numero + " ---");
        
        //bucle que calcula el producto del numero por el numero de vuelta y muestra por pantalla el resultado
        for (int i = 0; i <= 12; i++) {
            result = i * numero;
            System.out.println("\n\t "+ i + " x " + numero + " = " + result);
        }
    }
    
}
