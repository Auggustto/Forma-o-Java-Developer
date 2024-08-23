package edu.formacaojava.estruturasCondicionais;

public class SwitchCase {

    public static void main(String[] args) {
        /*
         * A estrutura `switch` é usada para tomar decisões com base no valor de uma única variável ou expressão. 
         * Cada caso no `switch` corresponde a um valor possível da variável. Se nenhum dos casos corresponder, o bloco `default` é executado.
         */

        String sigla1 = "M";

        //  Forma padrão de validação 
        if (sigla1 == "P")
            System.out.println("Pequeno");
        else if (sigla1 == "M")
            System.out.println("Médio");
        else if (sigla1 == "G")
            System.out.println("Grande");
        else
            System.out.println("Indefinido");

        //  Usando Switch Case
        String sigla2 = "P";

        switch (sigla2) {
            case "P": {
            System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }

}
