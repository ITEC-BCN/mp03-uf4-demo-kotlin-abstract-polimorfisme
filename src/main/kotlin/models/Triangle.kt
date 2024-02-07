package models
import utils.*

/**
 * Definició de la classe Triangle que hereta de la classe abstracte ObjecteGeometric
 * @author itec-bcn
 */
class Triangle : ObjecteGeometric {
    private var base: Double
    private var altura: Double

    /**
     * Definició del constructor de la classe Triangle que crida al constructor de la classe pare
     * per a inicialitzar els atributs del pare
     *
     * @param x de tipus Int per especificar la posició de la figura sobre l'eix de horitzontal
     * @param y de tipus Int per a especificar la posició de la figura sobre l'eix vertical
     * @param color de tipus String per a especificar el color de la figura
     * @param base de tipus Double per a especificar la mida de la base del triangle
     * @param altura de tipus Double per a especificar la mida de l'altura del triangle
     */
    constructor(x: Int, y: Int, color: String, base: Double, altura: Double) : super(x, y, color) {
        this.base = base
        this.altura = altura
    }

    /**
     * Redefinim el codi del mètode abstracte calcArea() heretat de la classe pare
     * Especifiquem la fòrmula matemàtica pel càlcul de l'àrea del triangle
     * @return L'àrea de la figura de tipus Double
     */
    override fun calcArea(): Double {
        return this.base * this.altura / 2
    }

    /**
     * Redefinim el codi del mètode abstracte calcPerimetre() heretat de la classe pare
     * Especifiquem la fòrmula matemàtica pel càlcul del perímetre del triangle
     * @return El perímetre de la figura de tipus Double
     */
    override fun calcPermietre(): Double {
        return this.base + this.altura + Math.sqrt(Math.pow(this.base, 2.0) + Math.pow(this.altura, 2.0))
    }

    /**
     * Redefinim el codi del mètode toString() heretat de la classe pare
     * Afegim l'atribut de la base i l'altura
     */
    override fun toString(): String {
        return PURPLE_BOLD + "Triangle -> Base: ${this.base}, Altura:${this.altura} --> " + RESET + super.toString()
    }
}