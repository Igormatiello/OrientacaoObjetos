package br.edu.utfpr;

import java.util.Scanner;

public class Ex7 {
        public Ex7() {

        }
        public static void executarEx() {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite a cor do carro: ");
                String cor = scanner.nextLine();
                System.out.println("Digite o ano de fabricação carro: ");
                int ano_fab = scanner.nextInt();
                System.out.println("Digite o ano do modelo do carro: ");
                int ano_mod = scanner.nextInt();
                System.out.println("Digite a marca do carro: ");
                String marca = scanner.nextLine();
                System.out.println("Digite o modelo do carro: ");
                String modelo = scanner.nextLine();


        Carro carro=new Carro();
       carro.setarCarro(cor,ano_fab,ano_mod,marca,modelo);
       carro.imprimirCarro();

        }
}
