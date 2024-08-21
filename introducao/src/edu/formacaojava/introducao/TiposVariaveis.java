package edu.formacaojava.introducao;

public class TiposVariaveis {
    // Tipos primitivos que não são considerados como objetos
    
    // variáveis
    double salarioMinimo = 2500;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;

    // Casting é o processo de converter um valor de um tipo de dado para outro. 
    // Esse processo pode ser necessário quando você precisa tratar variáveis de diferentes tipos de dados,
    short numeroCurto2 = (short) numeroNormal;


    // Constantes por convenção devemos colocar em caixa alta
    final double VALOR_DE_PI = 3.14159;
}
