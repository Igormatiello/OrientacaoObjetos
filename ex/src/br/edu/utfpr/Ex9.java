package br.edu.utfpr;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex9 {


    public static void executarEx(){

        String array[] =new String[10];


        String nome="igor";
        int aux=0;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a proxima palavra: ");
            nome = scanner.nextLine();
            if (nome != "0" && nome != "-1") {
                array[aux] = nome;
                aux++;

            } else {
                Arrays.sort(array);
                System.out.println(" entrou no else");
                if (nome == "0") {
                    System.out.println("entrou");
                    System.out.println("Array em ordem alfabetica");
                    for (int i=0; i<aux; i++){

                        System.out.println( i + ": " + array[i]);
                        break;
                    }
                }
                if(nome == "-1")
                    System.out.println("entrou");
                    System.out.println("Array em ordem alfabetica invertida");
                    for (int i=aux; i>=0; i--){
                        System.out.println( i + ": " + array[i]);

                    }
                    break;
                }
            }
            while (nome != "0" && nome != "-1" && aux<10) ;

        }
}
