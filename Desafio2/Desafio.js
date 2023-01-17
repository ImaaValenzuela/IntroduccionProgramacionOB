const separador = function(){console.log("-----------------")}
console.log("---INICIO---")

let numeroIf = -5
if(numeroIf > 0){
    console.log("Su numero es positivo")
} else if(numeroIf < 0){
    console.log("Su numero es negativo")
} else{
    console.log("Su numero es cero")
}
separador()

let numeroWhile = 0
while(numeroWhile < 3){
    console.log(numeroWhile++)
}
separador()

do {
    console.log(numeroWhile++)
} while (numeroWhile < 3)
separador()

let numeroFor = 0
for(numeroFor; numeroFor <= 3; numeroFor++){
    console.log(numeroFor)
}
separador()

let estacion = "Primavera"
switch (estacion) {
    case "Verano":
        console.log("Estas en Verano!")
        break
    case "Invierno":
        console.log("Estas en Invierno")
        break
    case "Primavera":
        console.log("Estas en Primavera")
        break
    default:
        console.log("Estas en Otoño")
        break
}