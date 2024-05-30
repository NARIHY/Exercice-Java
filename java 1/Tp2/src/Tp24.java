import java.util.Scanner;
public class Tp24 {
/*
 * 
 * Conception d'un triangle en *
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Demander le nombre initial d'étoiles
        System.out.print("Entrez le nombre initial d'étoiles : ");
        int nombreEtoiles = sc.nextInt();

        // Afficher le triangle d'étoiles
        for (int i = nombreEtoiles; i > 0; i--) {
            // Afficher la ligne actuelle avec le nombre d'étoiles correspondant
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Aller à la ligne pour la prochaine rangée
            System.out.println();
        }

	}

}
