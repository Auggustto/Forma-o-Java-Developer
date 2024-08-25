package edu.formacaojava.estruturaRepeticao;

import java.util.Random;

public class EstruturaRepeticaoDoWhile {

    public static void main(String[] args) {
        
        /*
         * 
         * O loop do-while é semelhante ao while, mas garante que o bloco de código seja executado 
         * pelo menos uma vez, pois a condição é verificada após a execução do bloco.
         */

        System.out.println("Discando....");

        do {
            System.out.println("Telefone tocando");
        }while (tocando());

        System.out.println("Alo !!!");
    }

    private static boolean tocando() {

        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu: " + atendeu);

        // Negando o ato de continuar tocando
        return ! atendeu;
    }

}
