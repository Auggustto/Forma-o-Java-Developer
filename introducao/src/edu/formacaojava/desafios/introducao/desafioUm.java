package edu.formacaojava.desafios.introducao;

import java.util.Scanner;

public class desafioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();

		 // Complete os espaços em branco com uma possível solução para o desafio 
		PROD = A * B;

		System.out.println("PROD = " +   PROD);
    }
}
