package edu.formacaojava.estruturaRepeticao;

public class EstruturaRepeticaoForBreakContinue {

    public static void main(String[] args) {
        
        for (int numero = 1; numero <= 5; numero++) {
            
            if (numero == 3)
                // break;
                continue;  // Pula o restante do bloco e continua a próxima iteração

            System.out.println(numero);
        }
    }
}
