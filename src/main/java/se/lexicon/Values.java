package se.lexicon;

public class Values {
    // Här sparas valutakurser (kan ändras vid behov)
    double sekToEur = 0.087;
    double sekToDkk = 0.65;
    double sekToUsd = 0.095;
    double sekToNok = 1.01;

    // Metod för att växla SEK till en annan valuta
    public double convertSekTo(double amount, String currency) {
        if (currency.equals("EUR")) {
            return amount * sekToEur;
        } else if (currency.equals("DKK")) {
            return amount * sekToDkk;
        } else if (currency.equals("USD")) {
            return amount * sekToUsd;
        } else if (currency.equals("NOK")) {
            return amount * sekToNok;
        } else {
            return 0; // Om fel valuta valts
        }
    }
}
