package org.tuozzo

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    // Connexion et récupération du document HTML
    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()

    // Affichage du titre du document
    println(doc.title())

    // Sélection des éléments des titres d'actualités
    val newsHeadlines: Elements = doc.select("#mp-itn b a")

    // Parcours des éléments et affichage des titres et des URL
    for (headline: Element in newsHeadlines) {
        println("${headline.attr("title")}\n\t${headline.absUrl("href")}")
    }
}