package edu.formacaojava.estruturasCondicionais;

public class CondicionalEncadeada {

    public static void main(String[] args) {
        
        double nota = 5.0;

        if (nota >= 7.0) {
            System.out.println("Aprovado: " + nota);
        }
        else if (nota >=5 && nota <7) {
            System.out.println("Recuperação: " + nota);
        } 
        else {
            System.out.println("Reprovado: " + nota);
        }
    }

}
