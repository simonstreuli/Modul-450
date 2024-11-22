public class PriceCalculatorTest {

    public boolean test_calculate_price() {
        PriceCalculator calculator = new PriceCalculator();
        boolean test_ok = true;

        // Testfall 1
        double result1 = calculator.calculatePrice(1000, 200, 300, 4, 5);
        System.out.println("Berechneter Preis für Testfall 1: " + result1);
        if (Math.abs(result1 - 1420.0) > 0.01) {
            System.out.println("Testfall 1 fehlgeschlagen. Erwartet: 1420.0, Erhalten: " + result1);
            test_ok = false;
        }

        // Testfall 2
        double result2 = calculator.calculatePrice(1000, 200, 300, 5, 5);
        System.out.println("Berechneter Preis für Testfall 2: " + result2);
        if (Math.abs(result2 - 1405.0) > 0.01) {
            System.out.println("Testfall 2 fehlgeschlagen. Erwartet: 1405.0, Erhalten: " + result2);
            test_ok = false;
        }

        return test_ok;
    }

    public static void main(String[] args) {
        PriceCalculatorTest test = new PriceCalculatorTest();
        if (test.test_calculate_price()) {
            System.out.println("Alle Tests erfolgreich!");
        } else {
            System.out.println("Mindestens ein Test ist fehlgeschlagen.");
        }
    }
}
