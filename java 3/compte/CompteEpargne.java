public class CompteEpargne extends Compte 
{
    private float tauxInteret;

    /**
     * Initialisation de la classe 
     */
    public CompteEpargne(int numeroCompte, float taux)
    {
        super(numeroCompte, 0);
        this.tauxInteret = taux;
    }


    /**
     * Initialisation du solde
     * @return void
     */
    public void setSolde(float solde)
    {
        super.soldeInit(solde);
    } 

    /**
     * CAlcule du solde totale
     * @return float //Nombre flottant
     */
    public float calculerSolde()
    {
        return super.getSolde() + (super.getSolde() * tauxInteret);
    }
}