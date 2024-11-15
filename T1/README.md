## Aufgabe 1: Formen von Tests in der Informatik

Es gibt verschiedene Formen von Softwaretests. Drei Beispiele aus der Praxis:

### Unit-Tests

Beschreibung: Testen einzelne Komponenten oder Methoden der Software.
Durchführung: Mit automatisierten Test-Frameworks wie JUnit (für Java), xUnit (für .NET) oder Pytest (für Python). Es werden Input-Daten vorgegeben, und die Ausgabe wird mit den erwarteten Ergebnissen verglichen.

### Integrationstests

Beschreibung: Überprüfen das Zusammenspiel verschiedener Module oder Komponenten.
Durchführung: Module werden zusammengeführt und mit Testfällen überprüft, um sicherzustellen, dass die Schnittstellen korrekt funktionieren. Tools wie Postman für API-Tests oder Selenium für Webtests werden oft verwendet.

### End-to-End-Tests

Beschreibung: Testen die gesamte Anwendung vom Anfang bis zum Ende aus der Sicht des Benutzers.
Durchführung: Automatisch mit Tools wie Cypress oder manuell durch Benutzer, um typische Szenarien zu simulieren, z. B. einen Bestellprozess in einem Online-Shop.

## Aufgabe 2: Beispiele für SW-Fehler und SW-Mängel

### Software-Fehler (Bug)

Beispiel: Ein Taschenrechner-Programm gibt bei der Division durch 0 keinen Fehler aus, sondern stürzt ab.
Erklärung: Ein Fehler im Code verursacht unerwartetes Verhalten oder Abstürze.

### Software-Mangel

Beispiel: Eine Anwendung hat keine Möglichkeit, Passwörter zurückzusetzen.
Erklärung: Dies ist kein Bug, sondern eine fehlende Funktionalität, die die Benutzbarkeit beeinträchtigt.

### Hoher Schaden durch einen SW-Fehler

Beispiel: Ein Fehler in der Flugsteuerungssoftware verursacht den Absturz eines Flugzeugs.
Erklärung: Solche Fehler können Leben kosten oder enorme finanzielle Verluste verursachen.

## Aufgabe 3: Implementierung und Tests

Code: Preisberechnung

```
public class PriceCalculator {

    public double calculatePrice(double baseprice, double specialprice, double extraprice, int extras, double discount) {
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
```

```
public class PriceCalculatorTest {

    public boolean test_calculate_price() {
        PriceCalculator calculator = new PriceCalculator();
        boolean test_ok = true;

        // Testfall 1: Basispreis mit Rabatt
        double result1 = calculator.calculatePrice(1000, 200, 300, 4, 5);
        if (Math.abs(result1 - 1235.0) > 0.01) {
            System.out.println("Testfall 1 fehlgeschlagen: " + result1);
            test_ok = false;
        }

        // Testfall 2: Mehr als 5 Zusatzausstattungen
        double result2 = calculator.calculatePrice(1000, 200, 300, 5, 5);
        if (Math.abs(result2 - 1215.0) > 0.01) {
            System.out.println("Testfall 2 fehlgeschlagen: " + result2);
            test_ok = false;
        }

        // Weitere Testfälle können hier hinzugefügt werden...

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
```

### Bonus: Fehler im Code finden

Fehler im ursprünglichen Code:
Der Rabatt für Zusatzausstattungen (addon_discount) wird immer vom Rabatt auf den Grundpreis (discount) überschrieben, wenn discount > addon_discount. Dies ist jedoch falsch, da beide Rabatte separat behandelt werden sollten.

Korrektur:
Die beiden Rabatte müssen unabhängig voneinander berücksichtigt werden. Der Rabatt auf Zusatzausstattungen darf nicht durch den Händlerrabatt überschrieben werden. Der Code wurde oben entsprechend angepasst.
