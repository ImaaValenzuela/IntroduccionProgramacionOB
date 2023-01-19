class Coche{
    constructor(velocidad, modelo, matricula){
        this.velocidad = velocidad,
        this.modelo = modelo,
        this.matricula = matricula
    }
}

class Celta extends Coche{
}

let miCoche = new Celta(220, "Celta 2013 1.4 Lt Aa+dir", "ABC 123")
console.log(miCoche)