/*
 * Codifica un programa que Lea o soldo de cada un dos traballadores dunha empresa 
e obteña o número deles que ganan entre 1000 e 1750 €, ámbolos dous incluidos e, 
a porcentaje de traballadores que ganan menos de 1000 €.Tendo en conta que non se 
coñece con antelación o numero de traballadores da empresa e non se admiten os 
soldos negativos.( utiliza como condidión de fin un soldo 0 ).
.
 */
package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          Traballador traballador = new Traballador();
         traballador.calcularTrabajadores();
    }

}
