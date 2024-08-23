package edu.formacaojava.estruturasCondicionais;

public class CondicionalSimples {

    public static void main(String[] args) {
        

        double saldo = 25.0;
        double ValorSolicitado = 30.0;

        if (saldo >= ValorSolicitado) {
            saldo -= ValorSolicitado;

            System.out.println(saldo);
        }
    }
}
