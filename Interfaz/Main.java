package Interfaz;

public class Main {
    public static void main(String[] args){
        Coche coche = new Coche();
        Moto moto = new Moto();
        EjecutarAcelerar(coche);
        System.out.println("------------------");
        EjecutarAcelerar(moto);
    }

    public  static void EjecutarAcelerar(Vehiculo vehiculo){
        vehiculo.Acelerar(120);
    }
}

interface Vehiculo{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("El auto esta acelerando");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("El auto esta frenando");
    }
}

class Moto implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("La moto esta acelerando");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("La moto esta frenando");
    }
}