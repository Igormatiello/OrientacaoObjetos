
package br.edu.utfpr;

import java.util.Scanner;

public class Ex1 {
    public Ex1() {
    }

    public static void executarEx() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a temperatura em Celsius?");
        float celsius = (float)scanner.nextInt();
        System.out.println(" Temparatura em Celsius: " + celsius);
        float faren = (float)((double)celsius * 1.8D + 32.0D);
        float kelvin = (float)((double)celsius + 273.15D);
        System.out.println(" Temparatura em Faren: " + faren);
        System.out.println(" Temparatura em Kelvin: " + kelvin);
    }
}
