package ihmsimple.services;

import ihmsimple.ctrl.Controller;

/**
 * Classe représentant le service de l'application MVC "IhmSimple".
 * 
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 29.10.2023
 * @version 1.0.0
 */
public class ServiceDevine {
    /**
     * Nombre maximum que l'utilisateur peut proposer.
     */
    public final static int MAX_VALUE = 100;

    /**
     * Nombre minimum que l'utilisateur peut proposer.
     */
    public final static int MIN_VALUE = 1;

    /**
     * Valeur retournée par la méthode lireValeurProposee() si ce qui a été saisi
     * par l'utilisateur n'est pas convertible
     * en un entier.
     */
    public final static int NOMBRE_INVALIDE = -1;

    /**
     * Référence au contrôleur de l'application.
     */
    private Controller refCtrl;

    /**
     * Constructeur du service.
     * Comme toujours, le travail N°1 consiste à initialiser TOUS nos attributs :-).
     * Pour la référence au contrôleur, vous devez à présent savoir quelle valeur
     * initiale donner.
     */
    public ServiceDevine() {
        // VOTRE CODE ICI...
    }

    /**
     * Invente et retourne un nouveau nombre à deviner aléatoirement choisi entre
     * les limites tolérées pour ce jeu.
     * 
     * @return le nombre à deviner aléatoirement choisi
     */
    public int penserAUnNombre() {
        
    }

    /**
     * Retourne la référence au contrôleur de l'application.
     * 
     * @param refCtrl la référence au contrôleur de l'application
     */
    public void setRefCtrl(Controller refCtrl) {
        // VOTRE CODE ICI...
    }

    /**
     * Retourne la référence au contrôleur de l'application.
     * 
     * @return la référence au contrôleur de l'application
     */
    public Controller getRefCtrl() {
        return refCtrl;
    }

}
