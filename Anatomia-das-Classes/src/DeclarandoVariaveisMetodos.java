public class DeclarandoVariaveisMetodos {
    
    public static void main (String [] args) {

        //  string 
        String primeiroNome = "Leonardo";

        String segundoNome = "Augusto";

        //  Utilizando metodos
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print (nomeCompleto);
    }

    //  Declarando metodos: 
    // Estrutura: TipoRetorno NomeObjetivoNoInfinitivo Paremetro(S)
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
