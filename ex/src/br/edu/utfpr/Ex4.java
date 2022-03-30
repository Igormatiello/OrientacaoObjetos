

package br.edu.utfpr;

import java.util.Scanner;

public class Ex4 {
    public Ex4() {
    }

    public static void executarEx() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o Salário? ");
        float salario = scanner.nextFloat();
        System.out.println("Salário: " + salario);
        float inss;
        if (salario < 1212.0F) {
            inss = 0.075F;
            System.out.println("Desconto INSS: " + salario * inss);
            System.out.println("Salário com desconto: " + (salario - salario * inss));
        } else if (salario >= 1212.0F && (double)salario <= 2427.35D) {
            inss = 0.09F;
            System.out.println("Desconto INSS: " + salario * inss);
            System.out.println("Salário com desconto: " + (salario - salario * inss));
        } else if ((double)salario >= 2427.36D && (double)salario <= 3641.03D) {
            inss = 0.12F;
            System.out.println("Desconto INSS: " + salario * inss);
            System.out.println("Salário com desconto: " + (salario - salario * inss));
        } else if ((double)salario >= 3641.04D && (double)salario <= 7087.22D) {
            inss = 0.14F;
            System.out.println("Desconto INSS: " + salario * inss);
            System.out.println("Salário com desconto: " + (salario - salario * inss));
        } else if ((double)salario > 7087.22D) {
            inss = 1236.0F;
            System.out.println("Desconto INSS: " + inss);
            System.out.println("Salário com desconto: " + (salario - inss));
        }

    }
}
