package edu.formacaojava.introducao;

public class Operadores {

    public static void main(String[] args) {
        
        // Operador ( = )
        String nome = "Leonardo";
        int idade = 26;
        double peso = 71;
        char sexo = 'M';
        boolean doadorOrgao = false;
        // Date dataNascimento = new Date();

        //-------------------------------------------------------------------------------

        // Operadores aritimeticos
        double soma = 10.5 + 11.8;
        double subtracao = 25 - 10;
        double multiplicacao = 5 * 10;
        double divisao = 100 / 5;
        int modulo = 10 % 3;
        double resultado = (10 * 7) + (20/4);
        
        //-------------------------------------------------------------------------------
        // Operadores unário. Operam em um único operando para produzir um novo valor.

        // + (positivo): Indica que o valor é positivo (geralmente implícito).
        // - (negativo): Inverte o sinal de um valor.
        // ++ (incremento): Aumenta o valor do operando em 1.
        // -- (decremento): Diminui o valor do operando em 1.
        // ! (negação lógica): Inverte o valor booleano.

        int num = 5;
        num++;  // Incrementa num para 6
        System.out.println(num);  // Saída: 6
        num--;  // Decrementa num para 5
        System.out.println(num);  // Saída: 5

        //-------------------------------------------------------------------------------

        // Incrementar valor
        int numero = 5;
        //  x repeticao
        numero += 1;
        // Incrementa o valor de numero para 6
        numero++;  
        
        System.out.println(++ numero);
        
        //-------------------------------------------------------------------------------

        //  Negação
        boolean variavel = false;
        System.out.println(!variavel);

        //-------------------------------------------------------------------------------
        
        // Operadores Ternários: 
        // É o único operador que utiliza três operandos e serve como uma forma concisa de expressar uma condicional.
        //  ? : (condicional): Avalia a expressão antes do ?. Se for true, retorna o valor entre ? e :; se for false, retorna o valor após :.
        int valor = 10;
        String resultadoT = (valor > 5) ? "Maior que 5" : "Menor ou igual a 5";
        System.out.println(resultadoT);  // Saída: Maior que 5
        
        //-------------------------------------------------------------------------------
        //  Operadores Relacionais
        //  Usados para comparar dois valores. Eles retornam `true` ou `false`.

        // == (igual a): Verifica se dois valores são iguais.
        // != (diferente de): Verifica se dois valores são diferentes.
        // > (maior que): Verifica se o valor da esquerda é maior que o da direita.
        // < (menor que): Verifica se o valor da esquerda é menor que o da direita.
        // >= (maior ou igual a): Verifica se o valor da esquerda é maior ou igual ao da direita.
        // <= (menor ou igual a): Verifica se o valor da esquerda é menor ou igual ao da direita.

        int x = 10;
        int y = 20;
        System.out.println(x == y);  // Saída: false
        System.out.println(x != y);  // Saída: true
        System.out.println(x > y);   // Saída: false
        System.out.println(x < y);   // Saída: true

        String aplicandoTernario = (x == y) ? "Sim" : "Não";
        System.out.println(aplicandoTernario);  // Saída: Não

        //-------------------------------------------------------------------------------
        // Operadores logicos
        // Usados para combinar expressões booleanas.

        // && (E lógico): Retorna `true` se ambas as expressões forem verdadeiras.
        // || (OU lógico): Retorna `true` se pelo menos uma das expressões for verdadeira.
        // ! (NÃO lógico): Inverte o valor de uma expressão booleana.

        boolean a = true;
        boolean b = false;
        System.out.println(a && b);  // Saída: false
        System.out.println(a || b);  // Saída: true
        System.out.println(!a);      // Saída: false
    }
}
