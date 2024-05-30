public class Compte 
{
    private String nomTitulaire;
    private int solde = 0;

    // Constructeur prenant le nom du titulaire en paramètre
    public Compte(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    // Méthode pour déposer de l'argent sur le compte
    public void depot(int montant) {
        solde += montant;
    }

    // Méthode pour retirer de l'argent du compte
    public void retrait(int montant) {
        solde -= montant;
    }

    // Méthode pour effectuer un virement vers un autre compte
    public void virement(Compte destinataire, int montant) {
        this.retrait(montant);
        destinataire.depot(montant);
    }

    // Méthode pour afficher le solde et le nom du titulaire
    public void afficher() {
        System.out.println("Titulaire : " + nomTitulaire);
        System.out.println("Solde actuel : " + solde + " Ariary");
    }

    // Méthode pour changer le nom du titulaire du compte
    public void changerTitulaire(String nouveauTitulaire) {
        this.nomTitulaire = nouveauTitulaire;
    }
}
