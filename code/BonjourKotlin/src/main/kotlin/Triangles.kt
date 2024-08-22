package org.Tuozzo

fun main(){
    println( triangle(4))
    println(triangle(8))
            println(triangle(10))
            println(triangle(50))
            println(triangle(100))


}

fun triangle(hauteur : Int) : String {
    var tri = ""
    for (i in 1..hauteur){
        for (j in 1..i){
           tri +="*"
        }
        tri += "\n"
    }
    return tri
}

