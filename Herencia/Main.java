package Herencia;

public class Main{
    public static void main(String[] args){
        Celta coche = new Celta();
        coche.velocidadMaxima = 180;
        coche.matricula = "AB 123 CD";
        coche.puertas = 5;
        Moto moto = new Moto();
        moto.velocidadMaxima = 240;
        moto.matricula = "EF 456 GH";
        System.out.println("Celta tiene: "+ coche.puertas + " puertas");
        System.out.println(moto.velocidadMaxima);
    }
}

class Vehiculo{
    int velocidadMaxima;
    String matricula;
}

class Coche extends Vehiculo{
    int puertas;
}

final class Celta extends Coche{
}

class Moto extends Vehiculo{

}