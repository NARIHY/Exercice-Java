 /**
 * La classe CompteDepot représente un compte de dépôt qui permet d'effectuer des opérations financières.
 */
public class CompteDepot extends Compte {
    private float[] operations;
    private static final int MAX_OPERATIONS = 100; // Taille maximale du tableau d'opérations
    private static int nbOperation = 0; // Nombre d'opérations actuellement enregistrées

    /**
     * Constructeur de la classe CompteDepot.
     *
     * @param numCompte Le numéro de compte associé au compte de dépôt.
     */
    public CompteDepot(int numCompte) {
        super(numCompte, 0); // Appel du constructeur de la classe parente
        operations = new float[MAX_OPERATIONS]; // Initialisation du tableau d'opérations
    }

    /**
     * Ajoute une opération au compte de dépôt.
     *
     * @param montant Le montant de l'opération à ajouter (positif pour un dépôt, négatif pour un retrait).
     */
    public void ajouterOperation(float montant) {
        if (nbOperation < MAX_OPERATIONS) { // Vérifie si le nombre d'opérations est inférieur au maximum
            operations[nbOperation] = montant; // Ajoute l'opération au tableau
            nbOperation++; // Incrémente le nombre d'opérations
        } else {
            System.out.println("Nombre maximal d'opérations atteint");
        }
    }

    /**
     * Calcule le solde du compte de dépôt en tenant compte de toutes les opérations effectuées.
     *
     * @return Le solde actuel du compte de dépôt.
     */
    public float calculerSolde() {
        float solde = super.getSolde(); // Récupère le solde initial du compte
        for (int i = 0; i < nbOperation; i++) {
            solde += operations[i]; // Ajoute le montant de chaque opération au solde
        }
        return solde;
    }
}
