package dicegame;

import java.util.Random;

/**
 * Gra w odgadywanie wylosowanej liczby.
 * 
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (komputer lub człowiek) stara się odgadnąć liczbę
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Obiekt gracza trzymamy w zmiennej obiektowej typu Player.
           Dzięki temu, że zastosowaliśmy dziedziczenie, możemy przypisać tej
           zmiennej obiekt klasy PlayerComp lub PlayerHuman. Obiekty obu klas
           mają metodę guess(), a to jest dla poniższego kodu najważniejsze.
        */
        
        Player player = new PlayerComp();    //obiekt komputerowego gracza
//        Player player = new PlayerHuman();   //obiekt gracza-człowieka
        try {
			player.setName("*");       //ustawiamy imię gracza za pomocą metody setName (czyli settera)
		} catch(IllegalArgumentException ex) {
			System.err.println("Blad!!!" +ex.getMessage());
		}
        Random dice = new Random();     //obiekt losujący (kostka)
        int number,                     //wylosowana liczba
            guess;                      //propozycja (strzał) gracza
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane (number): " + number);

            guess = player.guess();     //wywołujemy metodę guess() obiektu gracza (klasy PlayerComp lub PlayerHuman)

            System.out.println("Gracz " + player.getName() + ": " + guess); //wyświetlamy informację zawierającą imię gracza i jego propozycję
            
            if (number == guess) {
                System.out.println("BRAWO!");
            } else {
                System.out.println("PUDŁO!");
            }
            
            System.out.println("---------------------------------------------");
        
        } while (number != guess);
    }
    
}
