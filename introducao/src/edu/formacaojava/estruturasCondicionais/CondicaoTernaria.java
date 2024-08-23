package edu.formacaojava.estruturasCondicionais;

public class CondicaoTernaria {

    public static void main(String[] args) {
        
        /*
         * 
         * A estrutura condicional ternária é uma forma compacta de escrever uma condição simples com if-else. 
         * Ela avalia uma expressão e retorna um valor com base no resultado da condição.
         * 
         * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
         */

        double nota = 2.0;

        if (nota >= 7.0) {
            System.out.println("Aprovado: " + nota);
        }
        else {
            System.out.println("Reprovado: " + nota);
        }

        //  Condição ternária simples
        String resultado1 = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Resultado: " + resultado1);

        //  Condição ternária aninhada
        String resultado2 = nota >= 7 ? "Aprovado" : nota >= 5 && nota <= 7 ? "Recuperação" : "Reprovado";
        System.out.println("Resultado: " + resultado2);
    }
}
