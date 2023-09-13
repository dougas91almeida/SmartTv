public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A sua TV está ligada? " + smartTv.ligada);
        System.out.println("Qual canal está a sua TV? " + smartTv.canal);
        System.out.println("Qual volume está a sua TV? " + smartTv.volume);
        
        smartTv.desligar();
        System.out.println("Novo status, sua TV está ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo status, sua TV está ligada? " + smartTv.ligada);
        System.out.println("Qual volume está a sua TV? " + smartTv.volume);
        smartTv.aumentar();
        System.out.println("Voce aumentou o volume da sua TV para " + smartTv.volume);
        smartTv.diminuir();
        System.out.println("Voce diminuiu o volume da sua TV para " + smartTv.volume);
        smartTv.mudarCanal(13);
        System.out.println("Voce mudou sua TV para o canal " + smartTv.canal);
        smartTv.acrescentarCanal();
        System.out.println("Voce mudou sua TV para o canal " + smartTv.canal);
        smartTv.decrescerCanal();
        System.out.println("Voce mudou sua TV para o canal " + smartTv.canal);
        
    }
}
