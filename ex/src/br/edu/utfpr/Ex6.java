package br.edu.utfpr;

import java.util.Scanner;

public class Ex6 {


    public Ex6() {

    }

    public static void executarEx() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = scanner.nextLine();
        int tamanho = frase.length();
        String armazena[] = new String[tamanho];
        int aux = 0;
        int aux2 = 0;

        while (aux <= (tamanho - 1)) {

                armazena[aux2] = String.valueOf(frase.charAt(aux));

            if (frase.charAt(aux) == ' ' || (tamanho - 1) == aux) {

                for (int i = (aux2); i >= 0; i--) {
                    if (!armazena[i].equals(" ")) {

                        System.out.print(armazena[i]);
                    }
                    if (i == 0) {
                        System.out.print(" ");
                    }
                }

                aux2 = 0;
            } else {
                aux2++;
            }
            aux++;

        }


    }


}




