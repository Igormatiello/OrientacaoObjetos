package br.edu.utfpr;

public class Carro {
        String cor;
        int anoFabricacao;
        int anoModelo;
        String marca;
        String modelo;



        public Carro(){

        }

        public void setarCarro(String cor, int anoFabricacao,int anoModelo, String marca,String modelo){
            this.cor=cor;
            this.anoFabricacao=anoFabricacao;
           this.anoModelo=anoModelo;
           this.marca=marca;
           this.modelo=modelo;


        };

        public void imprimirCarro(){
        System.out.println("Carro");
        System.out.println("Cor: "+cor);
        System.out.println("Ano Fabricação: " + anoFabricacao);
        System.out.println("Ano Modelo: "+ anoModelo);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);


        }









    }





