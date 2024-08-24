package edu.formacaojava.estruturaRepeticao;

// Gerar valores aleatorios
import java.util.concurrent.ThreadLocalRandom;

public class EstruturaRepeticaoWhile {

    public static void main(String[] args) {
        
        /* 
        O loop while repete um bloco de código enquanto uma condição é verdadeira. 
        */
        double mesada = 50.0;
        
        while(mesada > 0) {

            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Valor do doce: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("João gastou toda a sua mesada em doces");
        
    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}
