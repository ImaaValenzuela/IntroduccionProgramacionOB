class Coche {
    constructor(){
        this.puerta = 0
    }

    aniadirPuerta(){
        return this.puerta++
    }

    quitarPuerta(){
        return this.puerta--
    }
}



let miCoche = new Coche()
miCoche.aniadirPuerta()
miCoche.aniadirPuerta()
miCoche.aniadirPuerta()
miCoche.aniadirPuerta()
miCoche.aniadirPuerta()

let mostrarConsola = function(){console.log("Mi coche tiene " + miCoche.puerta + " puertas")}
mostrarConsola()

console.log("------------------------------")

miCoche.quitarPuerta()
miCoche.quitarPuerta()
miCoche.quitarPuerta()
miCoche.quitarPuerta()
miCoche.quitarPuerta()
mostrarConsola()

console.log("------------------------------")

miCoche.aniadirPuerta()
miCoche.aniadirPuerta()
miCoche.aniadirPuerta()
mostrarConsola()

console.log("---------FIN---------")

// console.log("Mi coche tiene " + miCoche.puerta + " puertas")
