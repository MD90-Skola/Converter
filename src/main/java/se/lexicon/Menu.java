package se.lexicon;
import java.util.Scanner;


public class Menu {
    Scanner scanner = new Scanner(System.in);
    Values values = new Values(); // Skapar objekt av Values-klassen


    public void showMenu() {
        System.out.println("Välkommen till valutaväxlaren :) ");
        System.out.println("Välj valuta att växla från SEK:");
        System.out.println("1. EUR");
        System.out.println("2. DKK");
        System.out.println("3. USD");
        System.out.println("4. NOK");
        System.out.println("5. Avsluta");

        int choice = scanner.nextInt();

        if (choice == 5) {
            System.out.println("Avslutar programmet...");
            return; // Avslutar programmet
        }

        System.out.print("Ange belopp i SEK: ");
        double amount = scanner.nextDouble();
        String currency = "";

        if (choice == 1) {
            currency = "EUR";
        } else if (choice == 2) {
            currency = "DKK";
        } else if (choice == 3) {
            currency = "USD";
        } else if (choice == 4) {
            currency = "NOK";
        } else {
            System.out.println("Ogiltigt val!");
            return;
        }

        // Anropar Values-klassen för konvertering
        double result = values.convertSekTo(amount, currency);

        // Visa resultatet
        System.out.println(amount + " SEK = " + result + " " + currency);
    }
}
