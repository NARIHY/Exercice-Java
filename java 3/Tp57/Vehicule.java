
import java.time.LocalDate;

public class Vehicule {
    private String marque;
    private LocalDate dateAchat;
    private double prixAchat;
    private double prixCourant;

    // Constructeur de Vehicule
    public Vehicule(String marque, LocalDate dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = prixAchat; // Prix courant initialisé au prix d'achat
    }

    // Méthode pour afficher les informations du véhicule
    public void affiche() {
        System.out.println("Marque : " + marque);
        System.out.println("Date d'achat : " + dateAchat + " Ar");
        System.out.println("Prix d'achat : " + prixAchat + " Ar");
        System.out.println("Prix courant : " + prixCourant + " Ar");
    }

    // Méthode pour calculer le prix courant
    public void calculePrix() {
        if (prixCourant < 0) {
            prixCourant = 0;
        }
    }

    // Getters et setters
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public double getPrixCourant() {
        return prixCourant;
    }

    public void setPrixCourant(double prixCourant) {
        this.prixCourant = prixCourant;
    }
}