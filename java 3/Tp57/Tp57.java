
import java.time.LocalDate;

public class Tp57 {
    public static void main(String[] args) {
        // Testing Voiture
        Voiture voiture = new Voiture("Toyota", LocalDate.of(2020, 1, 1), 20000, 1.6, 4, 120, 50000);
        voiture.affiche(); // Call the affiche method of Voiture
        voiture.calculePrix(); // Call the calculePrix method of Voiture

        // Testing Avion
        Avion avion = new Avion("Boeing", LocalDate.of(2018, 5, 15), 5000000, "Turbofan", 5000);
        avion.affiche(); // Call the affiche method of Avion
        avion.calculePrix(); // Call the calculePrix method of Avion
    }
}
