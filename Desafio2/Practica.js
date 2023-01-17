const separador = function(){console.log("-----------------")}
console.log("---INICIO---")

let contador = 10
while(contador > 0){
    console.log(contador--)
}
separador()

let contador2 = 100
do {
    console.log(contador2 -= 10)
} while (contador2 > 0)
separador()

let contador3 = 5
for(i = 0; contador3 >= i; contador3-- ){
    if(contador3 == 0){
        console.log("DESPEGUE!")
    } else{
        console.log(contador3)
    }
}
separador()

let miArray = ["I","m","a","n","o", "l"]
for(i = 0; i < miArray.length; i++){
    console.log(miArray[i])
}

console.log("---FIN---")