package edu.formacaojava.POO;

public class PooAdicionarCarro {

    public static void main(String[] args) {
        
        try{
            // Teste da classe PooClasseCarro
            PooClasseCarro carro1 = new PooClasseCarro("Fiat", "Uno", 1.5, "Preto", 2015, 25000.0);
            carro1.exibirInfo();

            PooClasseCarro carro2 = new PooClasseCarro("Fiat", "Uno", 1.5, "Branco", 2020, 30000.0);
            carro2.exibirInfo();

        } catch (Exception e) { 
            System.out.println("Erro: " + e);
        }
    }
}
