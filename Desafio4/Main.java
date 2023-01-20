package Desafio4;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setEdad(19);
        cliente.setNombre("Imanol");
        cliente.setTelefono(54123);
        cliente.setCredito(50000);
        System.out.println("Datos del cliente");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(45);
        trabajador.setNombre("Anna");
        trabajador.setTelefono(54456);
        trabajador.setSalario(100000);
        System.out.println("-----------------------------");
        System.out.println("Datos del trabajador");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());

    }
    
}

class Persona{
    int edad;
    String nombre;
    int telefono;
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    int credito;
    public int getCredito(){
        return credito;
    }
    public void setCredito(int credito){
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    int salario;
    public int getSalario(){
        return salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
}
