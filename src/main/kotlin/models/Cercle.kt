package models

import utils.*

/**
 * Definició de la classe Cercle que hereta de la classe abstracte ObjecteGeometric
 * @author itec-bcn
 */
public class Cercle : ObjecteGeometric {
    private var radi: Double

    /**
     * Definició del constructor de la classe Cercle que crida al constructor de la classe pare
     * per a inicialitzar els atributs del pare
     *
     * @param x de tipus Double per especificar la posició de la figura sobre l'eix de horitzontal
     * @param y de tipus Double per a especificar la posició de la figura sobre l'eix vertical
     * @param color de tipus String per a especificar el color de la figura
     * @param radi de tipus Double per a especificar el radi de la figura
     */
    constructor(x: Double, y: Double, color: String, radi: Double) : super(x, y, color) {
        this.radi = radi
    }

    /**
     * Redefinim el codi del mètode abstracte calcArea() heretat de la classe pare
     * Especifiquem la fòrmula matemàtica pel càlcul de l'àrea del cercle
     * @return L'àrea de la figura de tipus Double
     */
    override public fun calcArea(): Double {
        return Math.PI * Math.pow(this.radi, 2.0)
    }

    /**
     * Redefinim el codi del mètode abstracte calcPerimetre() heretat de la classe pare
     * Especifiquem la fòrmula matemàtica pel càlcul del perímetre del cercle
     * @return El perímetre de la figura de tipus Double
     */
    override public fun calcPermietre(): Double {
        return 2 * Math.PI * this.radi
    }

    /**
     * Mètode getter que retorna el radi del Cercle
     * @return this.radi Double
     */
    public fun getRadi(): Double {
        return this.radi
    }

    /**
     * Mètode setter per a canviar el radi de la figura
     * Només actualitza el radi si el nou valor és més gran que 0
     */
    public fun setRadi(radi: Double) {
        if (radi > 0) {
            this.radi = radi
        }
    }

    /**
     * Redefinim el codi del mètode toString() heretat de la classe pare
     * Afegim l'atribut del radi
     */
    override public fun toString(): String {
        return BLUE_BOLD + "Cercle -> Radi: ${this.radi} --> " + RESET + super.toString()
    }
}