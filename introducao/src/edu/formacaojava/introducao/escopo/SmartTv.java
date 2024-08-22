package edu.formacaojava.introducao.escopo;


// O escopo em Java refere-se ao contexto dentro do qual uma variável ou método é acessível e utilizável. 
// Em outras palavras, o escopo determina onde no código você pode acessar uma variável ou invocar um método. 
// Existem diferentes níveis de escopo em Java, dependendo de onde e como a variável ou o método é declarado.

public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void subirCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void novoCanal (int novoCanal){
        canal = novoCanal;
    }
    

}
