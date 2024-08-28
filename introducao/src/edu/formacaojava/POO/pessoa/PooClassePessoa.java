package edu.formacaojava.POO.pessoa;

public class PooClassePessoa {

    String nome;
    int idade;
    String corCabelo;
    Double peso;
    Double altura;


    public PooClassePessoa(String nome, int idade, String corCabelo, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.corCabelo = corCabelo;
        this.peso = peso;
        this.altura = altura;
    }

    public void exibeInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cor do cabelo: " + corCabelo);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Altura: " + altura + "m");
    }
}
