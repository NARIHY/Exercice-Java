// Animal.java
public class Animale {
    private String espece;
    private String nom;
    private String bruit;
    private int age;

    public Animale(String espece, String nom, String bruit, int age) {
        this.espece = espece;
        this.nom = nom;
        this.bruit = bruit;
        this.age = age;
    }

    public void parler() {
        System.out.println(this.nom + " fait " + this.bruit);
    }

    public static void main(String[] args) {
        // Déclaration et instanciation d'un tableau de 10 objets Animal
        Animale[] animaux = new Animale[10];

        // Création de 5 objets Animal et insertion dans le tableau
        animaux[0] = new Animale("chat", "Gros Minet", "miaou", 3);
        animaux[1] = new Animale("chien", "Rex", "ouaf", 5);
        animaux[2] = new Animale("oiseau", "Titi", "piou piou", 2);
        animaux[3] = new Animale("singe", "George", "hoo hoo", 4);
        animaux[4] = new Animale("lion", "Simba", "rugissement", 6);

        // Affichage du nom de chaque objet non nul du tableau
        for (Animale animal : animaux) {
            if (animal != null) {
                System.out.println("Nom de l'animal : " + animal.nom);
            }
        }

        // Faire parler chaque Animal du tableau
        for (Animale animal : animaux) {
            if (animal != null) {
                animal.parler();
            }
        }
    }
}
