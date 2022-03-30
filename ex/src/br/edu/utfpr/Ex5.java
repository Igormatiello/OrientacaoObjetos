//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.edu.utfpr;

import java.util.Scanner;

public class Ex5 {
    public Ex5() {
    }

    public static void executarEx() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = scanner.nextLine();
        int tamanho = frase.length();

        for(int i = tamanho - 1; i >= 0; --i) {
            System.out.print(frase.charAt(i));
        }

    }
}
