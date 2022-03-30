package br.edu.utfpr;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Ex8 {

    public Ex8(){

    }
    public static void executarEx(){

        int[] vet =new int[10];

        int num=10,aux=0;
    do{

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o proximo valor: ");
        num = scanner.nextInt();
        if(num>=0) {
            vet[aux] = num;
            aux++;
        }
        else {
            if (num == -1){
                int soma=0;
                for (int i=0; i<=aux; i++)
                {
                    soma=soma+vet[i];
                }
              double media=soma/aux;
                System.out.println("Media: "+ media);
            }
            if(num==-2){
                int moda=0,l,aux2=0,aux3=0;
                for (int i=1; i<=aux; i++) {

                    for (l=0; l<aux; l++){
                        if(vet[i]== vet[l]){

                            aux2++;
                        }

                }
                    if (aux2>aux3){
                        aux3=aux2;
                        moda=vet[i];
                    }

                }
            System.out.println("Moda= " + moda);

            }

            int valor;
            if (num==-3){

                Arrays.sort(vet);

                for(int j=0; j<aux;j++){
                    System.out.println(vet[j]);
                }


               if( aux%2 == 0){
                    valor= vet[aux/2];

               }
               else{
                   double k=aux;
                   double m=aux;
                  k= k-0.5;
                  m=m+0.5;
                  int auxMenor=(int)k;
                  int auxMaior=(int)m;

                    valor=(vet[auxMenor] + vet[auxMaior]) /2 ;


               }
               System.out.println("Mediana: "+ valor);


            }
            if (num==-4){

                Arrays.fill(vet,0);
            }




            }

    }while(num > 0 && aux<= 9);

    }


}
