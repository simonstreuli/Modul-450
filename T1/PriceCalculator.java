public class PriceCalculator {

    public double calculatePrice(double baseprice, double specialprice, double extraprice, int extras,
            double discount) {
        double addon_discount;
        double result;

        // Rabatt für Zubehörteile basierend auf Anzahl der Zusatzausstattungen
        if (extras >= 5)
            addon_discount = 15;
        else if (extras >= 3)
            addon_discount = 10;
        else
            addon_discount = 0;

        // Ergebnis berechnen
        result = (baseprice * (100 - discount) / 100.0)
                + specialprice
                + (extraprice * (100 - addon_discount) / 100.0);

        return result;
    }
}