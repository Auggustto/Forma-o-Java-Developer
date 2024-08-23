package edu.formacaojava.estruturaRepeticao;

public class EstruturaRepeticaoForArrays {

    public static void main(String[] args) {
        

        String alunos[] = {"Leonardo", "Laura", "Livia", "Davi"};

        for (int x=0; x<alunos.length; x++) {
            System.out.println("Nome do aluno: " + alunos[x]);
        }

        /*
         * for-each Loop (Loop Aprimorado)
         * O ` for-each` é usado para iterar diretamente sobre elementos de arrays ou coleções. 
         * Ele é mais legível e menos propenso a erros, pois não requer controle explícito do índice.
         */

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }
    }

}
