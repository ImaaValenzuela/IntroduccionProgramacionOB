const separador = function(){console.log("-----------------")}
console.log("--------INICIO--------")


function Prueba (){
    let valores = ["1", "2", "3", "4", "5"]
    let posicion = 5
    console.log(valores[posicion])
}

Prueba()
separador()

function functionA(){
    functionB()
}

function functionB(){
    functionC()
}

function functionC(){
    functionD()
}

function functionD(){
    console.log("Buen Viaje!!")
}

functionA()
functionD()
console.log("---------FIN---------")