package models
import utils.*

/**
 * Classe abstracte ObjecteGeometric per a ser heredada
 * Les classes definides com a abstractes, són open per defecte i no cal posar la paraula
 * @author itec-bcn
 */
abstract class ObjecteGeometric {
    // Definim els atributs com a protected per tal de que puguin ser gestionats per les classes filles com si fóssin atributs propis
    protected val x:Int
    protected val y:Int
    protected val color:String

    /**
     * Constructor específic (secundari) de la classe ObjecteGeometric
     * Tot i que la classe ObjecteGeometric és abstracte i no se'n poden instanciar objectes,
     * sí que podem definir un constructor per tal de gestionar la inicialització dels valors dels
     * atributs de la classe per tal de que el facin servir les classes filles
     *
     * @param x de tipus Int per especificar la posició de la figura sobre l'eix de horitzontal
     * @param y de tipus Int per a especificar la posició de la figura sobre l'eix vertical
     * @param color de tipus String per a especificar el color de la figura
     */
    constructor(x:Int, y:Int, color:String) {
        this.x = x
        this.y = y
        this.color = color
    }

    /**
     * Mètode abstracte calcArea per a calcular l'àrea de la figura geomètrica
     * És abtracte perquè cada figura té una fórmula matemàtica diferent per a calcular la seva àrea
     * Aquest mètode s'haurà d'implementar a les classes filles
     * @return Un valor double amb el càlcul de l'àrea
     */
    abstract fun calcArea():Double

    /**
     * Mètode abstracte calcPerimetre per a calcular el perímetre de la figura geomètrica
     * És abtracte perquè cada figura té una fórmula matemàtica diferent per a calcular el seu perímetre
     * Aquest mètode s'haurà d'implementar a les classes filles
     * @return Un valor double amb el càlcul del perímetre
     */
    abstract fun calcPermietre():Double

    /**
     * Mètode toString que fa override del comportament de Any.toString (Any és la classe pare des d'on
     * @return Un String amb els detalls de l'objecte
     */
    override fun toString():String {
        return YELLOW_BOLD + "ObjecteGeometric: x=$x, y=$y, color=$color " + RESET //+ super.toString()
    }
}
