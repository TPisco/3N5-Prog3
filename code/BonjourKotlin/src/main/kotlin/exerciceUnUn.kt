package org.Tuozzo
fun main(){

    println(unUn("allo"))
}

fun unUn(source: String): String{
    if (source.isEmpty()) return ""

    var st = ""
    var oldL = source[0]
    var cpt = 1

    source.forEach{ char->

        var newL = char;


        if(newL==oldL) {

            cpt++;


        }
        else {

            st+= cpt.toString() + oldL
            oldL = newL
            cpt = 1
        }



    }
    return st
    }
