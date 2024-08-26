package edu.formacaojava.estruturaRepeticao;

import java.util.Scanner;
import java.util.Locale;

public class EstruturaRepeticaoTryCatch {

    public static void main(String[] args) {
        
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("Olá me chamo " + nome.toUpperCase() + " " + sobrenome.toLowerCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");

            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler dados: " + e.getMessage());
        }
    }
}
