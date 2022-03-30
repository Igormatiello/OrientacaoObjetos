
package br.edu.utfpr;

import java.util.Scanner;

public class Ex2 {
    public Ex2() {
    }

    public static void executarEx() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o Ano");
        int ano = scanner.nextInt();
        if (ano % 4 != 0 && (ano % 400 != 0 || ano % 100 == 0)) {
            System.out.println("O Ano " + ano + " não é bissexto");
        } else {
            System.out.println("O Ano " + ano + " é bissexto");
        }

    }
}
