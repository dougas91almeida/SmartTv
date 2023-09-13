public class SmartTv {
    
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }
    
    public void aumentar(){
        volume++;
    }
    
    public void diminuir(){
        volume--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void acrescentarCanal(){
        canal++;
    }

    public void decrescerCanal(){
        canal--;
    }

}