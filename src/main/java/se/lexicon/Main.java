package se.lexicon;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Values values = new Values(); // Skapar ett objekt av Values-klassen



        while (true) { // Programmet ska alltid fortsätta
            System.out.println("Välkommen till Forex");
            double amount = 0;


            while (true) {
                System.out.print("Ange belopp i SEK: ");
                if (scanner.hasNextDouble()) {
                    amount = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Fel inmatning endast siffror 1234");
                    scanner.next(); // Rensa felaktig inmatning
                }
            }



            int choice;
            while (true) {
                System.out.println("Välj valuta:");
                System.out.println("1. EUR");
                System.out.println("2. DKK");
                System.out.println("3. USD");
                System.out.println("4. NOK");
                System.out.println("↻ Börja om ");

                choice = scanner.nextInt();

                if (choice >= 1 && choice <= 4) {
                    break; // Gå vidare om valet är giltigt
                } else if (choice == 5) {
                    System.out.println("Startar om programmet...");
                    continue; // Startar om hela programmet
                } else {
                    System.out.println("Fel inmatning! Försök igen.");
                    // Frågar om meny igen utan att starta om hela programmet
                }
            }

            double result = 0;
            String currency = "";

            if (choice == 1) {
                result = values.convertSekTo(amount, "EUR");
                currency = "EUR";
            } else if (choice == 2) {
                result = values.convertSekTo(amount, "DKK");
                currency = "DKK";
            } else if (choice == 3) {
                result = values.convertSekTo(amount, "USD");
                currency = "USD";
            } else if (choice == 4) {
                result = values.convertSekTo(amount, "NOK");
                currency = "NOK";
            }

            System.out.println(amount + " SEK = " + result + " " + currency);
            System.out.println("Tack för du använder forex omvandlare");
            System.out.println("--------------------");
        }
    }
}
