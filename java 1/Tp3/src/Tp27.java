

public class Tp27 {
	/*
	 * �crire un programme Java affichant les 15 premiers couplets de la chanson :
	1 kilom�tre � pied, �a use, �a use,
	1 kilom�tre � pied �a use les souliers.
	2 kilom�tres � pied, �a use, �a use,
	2 kilom�tres � pied �a use les souliers.
	. . .
	NB : Attention � l�accord du mot � kilom�tre �.

	 */
	public static void main(String[] args) {
		int chiffre = 15;
		for (int i =1; i <= chiffre; i++) {
			if(i == 1) {
				System.out.println(i + " Kilom�tre � pied, �a use, �a use");
				System.out.println(i + " Kilom�tre � pied, �a use les souliers");
			} else {
				System.out.println(i + " Kilom�tres � pied, �a use, �a use");
				System.out.println(i + " Kilom�tres � pied, �a use les souliers");
			}
			
		}

	}

}
