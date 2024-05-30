public class Test 
{
    public static void main(String[] args)
    {
        //test de compte
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Pour la test du classe: Compte");
        Compte compte = new Compte(12345,1000);
        System.out.println("Numero de compte: " + compte.getNumeroCompte());
        System.out.println("Solde: "+ compte.getSolde());

        compte.soldeInit(2000);
        System.out.println("Nouveaux solde: "+ compte.getSolde());

        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Pour la test du classe: Compte Epargne");
        //Test compte epargne
        CompteEpargne ce = new CompteEpargne(54321, 0.05f);
        System.out.println("Numéro de compte: "+ ce.getNumeroCompte());
        System.out.println("Solde: "+ ce.getSolde());

        ce.setSolde(1500);
        System.out.println("Nouveau solde: "+ ce.getSolde());
        System.out.println("Solde avec interet: "+ ce.calculerSolde());

        //Test compte depots
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Pour la test du classe: CompteDepots");
        CompteDepot cd = new CompteDepot(67890);
        cd.ajouterOperation(100);
        cd.ajouterOperation(-50);

        System.out.println("Numéro de compte: "+ cd.getNumeroCompte());
        System.out.println("Solde final: "+ cd.calculerSolde());
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");
    }
}