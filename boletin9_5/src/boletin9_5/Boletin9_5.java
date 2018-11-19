/*
5- Implementa un programa no que se pida o número de elementos e, visualice a seguinte serie :
a) 2 + 4 + 6 + 8 + 10 …..
b) - 1 + 2 – 3 + 4 – 5 + 6 …..
c) 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ………
serie de fibonacci

 */
package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sucesiones sucesion = new Sucesiones();

        System.out.println("\nBienvenido al calculador de series:\n ");
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    sucesion.calcularPares();
                    break;
                case 2:
                    sucesion.calcularMasMenos();
                    break;
                case 3:
                    sucesion.calcularFibonacci();
                    break;
                case 0:
                    System.out.println("\n\t Gracias por usar la calculadora de series");
                    break;
                default:
                    System.out.println("La operación elegida no existe.");
                    break;
            }
        } while (opcion != 0);

    }

    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nQue operación desea realizar:"
                + "\n1=>Mostrar sucesión de numeros pares"
                + "\n2=>Mostrar sucesion de numeros positivos par y negativo impar"
                + "\n3=>Mostrar sucesión de Fibonacci"
                + "\n0=>Salir");

        return Integer.parseInt(teclado.nextLine());
    }
}
