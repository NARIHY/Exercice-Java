import java.util.Scanner;
public class Tp30 {
	/*
	 * �crire un programme qui s'appelle Factorielle qui permet � l'utilisateur 
	 * de saisir un entier naturel n puis qui affiche � l'�cran la factorielle de celui-ci.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un entier naturel:");
		int nombre = sc.nextInt();
		int r = 1;
		for (int i = nombre; i > 1; i--) {
			r *= i;
			
		}
		System.out.println("Le factoriel de " + nombre + "!"+ " est: "+ r);
	}

}
