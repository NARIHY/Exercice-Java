
import java.time.LocalDate;

public class Voiture extends Vehicule {
    private double cylindree;
    private int nbPortes;
    private double puissance;
    private double kilometrage;

    // Constructeur de Voiture
    public Voiture(String marque, LocalDate dateAchat, double prixAchat, double cylindree, int nbPortes,
            double puissance, double kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    // Redéfinition de la méthode affiche
    public void affiche() {
        super.affiche(); // Appel de la méthode affiche de la classe parente
        System.out.println("Cylindrée : " + cylindree);
        System.out.println("Nombre de portes : " + nbPortes);
        System.out.println("Puissance : " + puissance);
        System.out.println("Kilométrage : " + kilometrage);
    }

    // Redéfinition de la méthode calculePrix
    public void calculePrix() {
        super.calculePrix(); // Appel de la méthode calculePrix de la classe parente
        // Autres calculs spécifiques à la classe Voiture
    }

}