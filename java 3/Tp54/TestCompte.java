import pcompte.Compte;

public class TestCompte {
    public static void main(String[] args) {
        // Création des deux comptes
        Compte compte1 = new Compte();
        Compte compte2 = new Compte();

        // Dépôts et retrait
        compte1.depot(1000);
        compte2.depot(1700);
        compte2.retrait(150);

        // Virement
        compte2.virement(compte1, 200);

        // Affichage des soldes des deux comptes
        System.out.println("Solde du compte 1 : ");
        compte1.afficher();
        System.out.println("Solde du compte 2 : ");
        compte2.afficher();

        // Création du tableau de dix comptes
        Compte[] comptes = new Compte[10];
        for (int i = 0; i < comptes.length; i++) {
            comptes[i] = new Compte();
            comptes[i].depot(200 + (100 * i));
        }

        // Virements entre les comptes
        for (int i = 0; i < comptes.length - 1; i++) {
            for (int j = i + 1; j < comptes.length; j++) {
                comptes[i].virement(comptes[j], 20);
            }
        }

        // Affichage des soldes de tous les comptes
        for (int i = 0; i < comptes.length; i++) {
            System.out.println("Solde du compte " + i + " : ");
            comptes[i].afficher();
        }
    }
}