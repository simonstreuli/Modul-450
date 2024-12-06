# Testfall-Dokumentation

## **Übung 1**

### **Testfälle für die Verkaufssoftware**

#### **Abstrakte Testfälle**

| ID  | Testfallbeschreibung                                     | Eingabe (Kaufpreis)         | Erwartetes Resultat |
| --- | -------------------------------------------------------- | --------------------------- | ------------------- |
| 1   | Kein Rabatt gewähren, wenn Kaufpreis < 15’000 CHF        | Kaufpreis < 15’000          | Rabatt = 0%         |
| 2   | 5% Rabatt, wenn Kaufpreis zwischen 15’000 und 20’000 CHF | 15’000 ≤ Kaufpreis < 20’000 | Rabatt = 5%         |
| 3   | 7% Rabatt, wenn Kaufpreis zwischen 20’000 und 25’000 CHF | 20’000 ≤ Kaufpreis < 25’000 | Rabatt = 7%         |
| 4   | 8.5% Rabatt, wenn Kaufpreis ≥ 25’000 CHF                 | Kaufpreis ≥ 25’000          | Rabatt = 8.5%       |

#### **Konkrete Testfälle**

| ID  | Testfallbeschreibung       | Kaufpreis (CHF) | Erwartetes Resultat |
| --- | -------------------------- | --------------- | ------------------- |
| 1   | Kein Rabatt bei 10’000 CHF | 10'000          | Rabatt = 0%         |
| 2   | 5% Rabatt bei 18’000 CHF   | 18'000          | Rabatt = 5%         |
| 3   | 7% Rabatt bei 22’000 CHF   | 22'000          | Rabatt = 7%         |
| 4   | 8.5% Rabatt bei 30’000 CHF | 30'000          | Rabatt = 8.5%       |

---

## **Übung 2**

### **Funktionale Black-Box Tests für eine Autovermietungs-Plattform**

#### **Tabelle der Testfälle**

| ID  | Beschreibung                                                 | Erwartetes Resultat                                          | Effektives Resultat | Status | Mögliche Ursache |
| --- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------- | ------ | ---------------- |
| 1   | Plattform lädt korrekt                                       | Startseite wird ohne Fehler geladen                          | -                   | -      | -                |
| 2   | Fahrzeugbuchung mit gültigen Daten                           | Buchung wird erfolgreich bestätigt                           | -                   | -      | -                |
| 3   | Fahrzeugbuchung mit ungültigen Zahlungsdaten                 | Fehler: "Zahlung abgelehnt"                                  | -                   | -      | -                |
| 4   | Suche nach Fahrzeugen in einer spezifischen Stadt            | Ergebnisse werden passend zu Stadt und Verfügbarkeit gezeigt | -                   | -      | -                |
| 5   | Benutzerregistrierung mit bereits verwendeter E-Mail-Adresse | Fehler: "E-Mail-Adresse bereits registriert"                 | -                   | -      | -                |

---

## **Übung 3**

### **Analyse der simplen Bank-Software**

#### **Black-Box Testfälle**

| ID  | Testfallbeschreibung                                      | Erwartetes Resultat                         |
| --- | --------------------------------------------------------- | ------------------------------------------- |
| 1   | Kontoerstellung mit gültigen Daten                        | Konto wird erfolgreich erstellt             |
| 2   | Kontoerstellung mit ungültigen Daten (z. B. leere Felder) | Fehler: "Ungültige Eingabe"                 |
| 3   | Einloggen mit korrekten Zugangsdaten                      | Erfolgreicher Login                         |
| 4   | Einloggen mit falschen Zugangsdaten                       | Fehler: "Benutzername oder Passwort falsch" |
| 5   | Überweisung zwischen zwei Konten mit ausreichend Guthaben | Überweisung wird erfolgreich abgeschlossen  |
| 6   | Überweisung mit unzureichendem Guthaben                   | Fehler: "Nicht genügend Guthaben"           |

#### **White-Box Testfälle (Methoden im Code)**

- **`createAccount(String username, String password)`**
  - Test auf korrekte Validierung der Eingaben und Funktionalität.
- **`login(String username, String password)`**

  - Test auf korrekte Authentifizierung und Fehlerbehandlung.

- **`transfer(String fromAccount, String toAccount, double amount)`**
  - Test auf fehlerfreie Logik bei Überweisungen (z. B. ausreichend Guthaben, fehlerfreie Kontonummern).

#### **Verbesserungsvorschläge am Code**

1. **Einhalten des SOLID-Prinzips:**  
   Überprüfen, ob Klassen und Methoden klar getrennte Verantwortlichkeiten haben.

2. **Fehlerbehandlung:**  
   Robustere Behandlung von Ausnahmen (z. B. Nullwerte, ungültige Eingaben).

3. **Code-Dokumentation:**  
   Kommentare zu jeder Methode, um die Funktionalität zu erläutern.

4. **Unit-Tests:**  
   Schreiben von umfassenden Unit-Tests mit einem Framework wie JUnit.

5. **Input-Validation:**  
   Sicherstellen, dass Benutzereingaben korrekt validiert werden, bevor sie verarbeitet werden.
