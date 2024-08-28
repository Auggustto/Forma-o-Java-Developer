package edu.formacaojava.POO;

public class PooClasseCarro {

    // Atributos (variáveis de instância)
    String fabricante;
    String modelo;
    Double peso;
    String cor;
    int ano;
    Double valor;

    // Construtor
    public PooClasseCarro(String fabricante, String modelo, Double peso, String cor, int ano, Double valor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }

    // Métodos (métodos de instância)
    public void exibirInfo(){
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + valor + " reais");
    }
}
