
package br.edu.utfpr;

import java.util.Scanner;

public class Ex3 {
    public Ex3() {
    }

    public static void executarEx() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o Peso?");
        float peso = scanner.nextFloat();
        System.out.println("Qual a altura?");
        float altura = scanner.nextFloat();
        System.out.println(" Peso: " + peso);
        System.out.println(" Altura: " + altura);
        float imc = (float)((double)peso / Math.pow((double)altura, 2.0D));
        System.out.println(" IMC: " + imc);
        if ((double)imc < 18.5D) {
            System.out.println("Está abaixo do peso");
        } else if ((double)imc >= 18.5D && (double)imc <= 24.9D) {
            System.out.println("IMC Normal");
        } else if ((double)imc < 24.9D) {
            System.out.println("Está acima do peso");
        }

    }
}
