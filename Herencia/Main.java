package Herencia;

public class Main{
    public static void main(String[] args){
        Celta coche = new Celta();
        coche.velocidadMaxima = 180;
        coche.matricula = "AB 123 CD";
        coche.puertas = 5;
        coche.setSonido("FIUUUUM");
        Moto moto = new Moto();
        moto.velocidadMaxima = 240;
        moto.matricula = "EF 456 GH";
        System.out.println("Celta tiene: "+ coche.puertas + " puertas");
        System.out.println(coche.getSonido());
        System.out.println(moto.velocidadMaxima);
    }
}

abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String sonido;
    abstract public String getSonido();
    abstract public void setSonido(String sonido);


}

class Coche extends Vehiculo{
    int puertas;
    public String getSonido(){
        return "El auto hace:" + this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}

final class Celta extends Coche{
}

class Moto extends Vehiculo{
        public String getSonido(){
        return "La moto hace:" + this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}