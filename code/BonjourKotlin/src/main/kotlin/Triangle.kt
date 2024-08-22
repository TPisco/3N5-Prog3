package org.Tuozzo

fun main() {
    val lignes = 4 // Nombre de lignes dans le motif

    for (i in 1..lignes) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}