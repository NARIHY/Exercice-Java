
import java.time.LocalDate;

public class Avion extends Vehicule {
    private String moteur;
    private int heuresVol;

    // Constructeur de Avion
    public Avion(String marque, LocalDate dateAchat, double prixAchat, String moteur, int heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.moteur = moteur;
        this.heuresVol = heuresVol;
    }

    // Redéfinition de la méthode affiche
    public void affiche() {
        super.affiche(); // Appel de la méthode affiche de la classe parente
        System.out.println("Type de moteur : " + moteur);
        System.out.println("Heures de vol : " + heuresVol);
    }

    // Redéfinition de la méthode calculePrix
    public void calculePrix() {
        super.calculePrix(); // Appel de la méthode calculePrix de la classe parente
        // Autres calculs spécifiques à la classe Avion
    }
}