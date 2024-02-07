package models
import utils.*

/**
 * Definició de la classe Pentagon que hereta de la classe abstracte ObjecteGeometric
 * @author itec-bcn
 */
class Pentagon: ObjecteGeometric {
    private var costat: Double

    /**
     * Definició del constructor de la classe Pentagon que crida al constructor de la classe pare
     * per a inicialitzar els atributs del pare
     *
     * @param x de tipus Int per especificar la posició de la figura sobre l'eix de horitzontal
     * @param y de tipus Int per a especificar la posició de la figura sobre l'eix vertical
     * @param color de tipus String per a especificar el color de la figura
     * @param costat de tipus Double per a especificar la mida del costat de la figura
     */
    constructor(x:Int, y:Int, color:String, costat: Double) : super(x, y, color) {
        this.costat = costat
    }

    /**
     * Redefinim el codi del mètode abstracte calcArea() heretat de la classe pare
     * Especifiquem la fòrmula matemàtica pel càlcul de l'àrea del pentàgon
     * @return L'àrea de la figura de tipus Double
     */
    override public fun calcArea(): Double {
        return 5 * Math.pow(this.costat, 2.0) / (4 * Math.tan(Math.PI / 5))
    }

    /**
     * Redefinim el codi del mètode abstracte calcPerimetre() heretat de la classe pare
     * Especifiquem la fòrmula matemàtica pel càlcul del perímetre del pentàgon
     * @return El perímetre de la figura de tipus Double
     */
    override fun calcPermietre(): Double {
        return 5 * this.costat
    }

    /**
     * Redefinim el codi del mètode toString() heretat de la classe pare
     * Afegim l'atribut del costat
     */
    override fun toString(): String {
        return GREEN_BOLD + "Pentagon -> Costat: ${this.costat} --> " + RESET + super.toString()
    }
}