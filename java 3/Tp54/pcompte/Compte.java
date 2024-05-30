package pcompte;

public class Compte {
    private int solde = 0;

    public void depot(int montant) {
        solde += montant;
    }

    public void retrait(int montant) {
        solde -= montant;
    }

    public void virement(Compte destinataire, int montant) {
        this.retrait(montant);
        destinataire.depot(montant);
    }

    public void afficher() {
        System.out.println("Solde actuel : " + solde + " Ariary");
    }
}
