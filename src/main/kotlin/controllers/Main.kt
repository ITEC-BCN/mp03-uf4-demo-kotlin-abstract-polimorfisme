package controllers
// Importem tots els models de dades
import models.*

fun main() {
    // Creem una llista del tipus de dades abstracte ObjecteGeometric del qual no se'n poden instanciar objectes
    var llistaObjecteGeometric: MutableList<ObjecteGeometric> = mutableListOf()

    //Definim els objectes
    var c1:Cercle = Cercle(10, 10, "blanc", 5.0)
    var c2:Cercle = Cercle(20, 20, "lila", 10.0)
    var t1:Triangle = Triangle(30, 30, "groc", 10.0, 5.0)
    var t2:Triangle = Triangle(40, 40, "blau", 20.0, 10.0)
    var p1:Pentagon = Pentagon(20, 20, "verd", 13.2)

    // Polimorfisme: objecte o1 "camaleó" declarat com a ObjecteGeometric però inicialitzat com a Triangle
        // No el podem inicialitzar com a ObjecteGeometric perquè no se'n poden crear objectes d'aquest tipus, però sí que podem fer aquesta "trampa"
    var o1:ObjecteGeometric = Triangle(60, 60, "vermell", 25.0, 15.0)
    println(o1)
    println("Tipus de dades de l'objecte " + o1.javaClass)
    println()

    // Creem un nou objecte Triangle de debó convertint l'o1 a Triangle 100%
    var o2:Triangle = o1 as Triangle
    println(o2)
    println("Tipus de dades de l'objecte " + o2.javaClass)
    println()

    // Creem un nou objecte Pentagon de debó convertint l'o1 a Pentagon 100%
    // Aquesta assignació fallarà en temps d'execució, per aquest motiu posem les següents línies comentades
    /*
    var o3:Pentagon = o2 as Pentagon
    println(o2)
    println("Tipus de dades de l'objecte " + o2.javaClass)
    println()
     */

    // Redefinim l'objecte o1 ara usant el constructor de la classe Cercle i observem com canvia de tipus de dades
    o1 = Cercle(20, 20, "lila", 10.0)
    println(o1)
    println("Tipus de dades de l'objecte " + o1.javaClass)

    //Afegim els objectes a la llista
    llistaObjecteGeometric.add(c1)
    llistaObjecteGeometric.add(c2)
    llistaObjecteGeometric.add(t1)
    llistaObjecteGeometric.add(t2)
    llistaObjecteGeometric.add(p1)
    llistaObjecteGeometric.add(o1)

    println()
    println("---")
    println()
    //Recórrer la llista i imprimir els objectes
    for (o:ObjecteGeometric in llistaObjecteGeometric) {
        println("Tipus de dades de l'objecte " + o.javaClass)
        println(o)
        println()
    }
}