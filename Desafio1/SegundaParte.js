class Coche {
    constructor(){
        this.puerta = 0
    }

    aniadirPuerta(){
        return this.puerta++
    }
}



let miCoche = new Coche()
miCoche.aniadirPuerta()
miCoche.aniadirPuerta()
miCoche.aniadirPuerta()
miCoche.aniadirPuerta()
miCoche.aniadirPuerta()
console.log("Mi coche tiene " + miCoche.puerta + " puertas")
