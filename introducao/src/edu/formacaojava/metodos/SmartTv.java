package edu.formacaojava.metodos;

// Aplicando metodos de forma pratica (SmartTV)
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
