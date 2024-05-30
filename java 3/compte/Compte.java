public class Compte 
{
     private int numeroCompte;
     private float soldeInit;

     /**
      * Initialisation de la classe Mere
      */
     public Compte(int numeroCompte, float soldeInit) 
     {
          this.numeroCompte = numeroCompte;
          this.soldeInit = soldeInit;
     }

     /**
      * Initialisation du solde, 
      * @return void
      */
     public void soldeInit(float solde)
     {
          this.soldeInit = solde;
     }

     /**
      * Récuperation du numéro de compte
      * @return float
      */
     public float getNumeroCompte()
     {
          return numeroCompte;
     }

     /**
      * Recuperation du solde 
      * @return float
      */
     public float getSolde()
     {
          return soldeInit;
     }
}