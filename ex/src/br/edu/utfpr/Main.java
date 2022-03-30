
package br.edu.utfpr;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero da ATV: ");
        int numeroAtv = scanner.nextInt();
        switch(numeroAtv) {
            case 1:
                Ex1.executarEx();
                break;
            case 2:
                Ex2.executarEx();
                break;
            case 3:
                Ex3.executarEx();
                break;
            case 4:
                Ex4.executarEx();
                break;
            case 5:
                Ex5.executarEx();
                break;
            case 6:
                Ex6.executarEx();
                break;

            case 7:
                Ex7.executarEx();
                break;
            case 8:
                Ex8.executarEx();
                break;
            case 9:
                Ex9.executarEx();
                break;
            default:
        }
    }
}


