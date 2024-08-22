package edu.formacaojava.introducao.metodos;

public class Usuario {

    public static void main(String[] args) throws Exception {
        
        //  chamando a class SmartTv
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

        //  ligando a tv
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume: " + smartTv.volume);

        smartTv.subirCanal();
        System.out.println("Novo status -> Canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo status -> Canal: " + smartTv.canal);

        smartTv.novoCanal(5);
        System.out.println("Novo status -> Canal: " + smartTv.canal);
    }
}
