
# Testfälle für die Verkaufssoftware

## Übung 1

### 1. Abstrakte Testfälle

| Testfall-ID | Bedingung                                 | Erwartetes Ergebnis        |
|-------------|-------------------------------------------|----------------------------|
| 1         | Kaufpreis < 15.000 CHF                    | Kein Rabatt                |
| 2         | 15.000 CHF ≤ Kaufpreis < 20.000 CHF       | 5% Rabatt                  |
| 3         | 20.000 CHF ≤ Kaufpreis < 25.000 CHF       | 7% Rabatt                  |
| 4         | Kaufpreis ≥ 25.000 CHF                    | 8,5% Rabatt                |

### 2. Konkrete Testfälle

| Testfall-ID | Kaufpreis (CHF) | Erwartetes Ergebnis        |
|-------------|-----------------|----------------------------|
| 1           | 14.999          | Kein Rabatt                |
| 2           | 15.000          | 5% Rabatt                  |
| 3           | 19.999          | 5% Rabatt                  |
| 4           | 20.000          | 7% Rabatt                  |
| 5           | 24.999          | 7% Rabatt                  |
| 6           | 25.000          | 8,5% Rabatt                |
| 7           | 30.000          | 8,5% Rabatt                |

## Übung 2

### Funktionale Black-Box Tests für Sixt.ch Autovermietungsplattform

| ID  | Beschreibung                                                  | Erwartetes Resultat                                             | Effektives Resultat                                  | Status   | Mögliche Ursache                             |
|-----|---------------------------------------------------------------|-----------------------------------------------------------------|-----------------------------------------------------|----------|------------------------------------------------|
| 1   | Fahrzeugverfügbarkeitssuche                                   | Nach Eingabe des Standorts und der Mietdaten werden verfügbare Fahrzeuge angezeigt. | Fahrzeuge werden korrekt angezeigt oder nicht       | Offen    | Datenbankverbindung oder Suchalgorithmus hat fehler |
| 2   | Fahrzeugbuchung                                               | Nach Auswahl eines Fahrzeugs und Eingabe der erforderlichen Informationen wird die Buchung erfolgreich abgeschlossen. | Buchungsbestätigung wird angezeigt oder nicht       | Offen    | Fehler im Buchungsprozess oder Zahlungsabwicklung |
| 3   | Benutzerregistrierung durchführen                             | Nach Eingabe aller erforderlichen Registrierungsdaten wird ein Benutzerkonto erstellt und eine Bestätigungs-E-Mail versendet. | Konto wird erstellt oder nicht                      | Offen    | E-Mail Versandfehler oder Datenbankproblem   |
| 4   | Preisberechnung für Mietdauer und Zusatzoptionen              | Nach Eingabe der Mietdauer und Auswahl von Zusatzoptionen (z.B. GPS, Kindersitz) wird der korrekte Gesamtpreis angezeigt. | Preis wird korrekt berechnet oder nicht             | Offen    | Fehler bei der Preisberechnung oder Logikfehler |
| 5   | Benutzerlogin prüfen                                          | Nach Eingabe der korrekten Anmeldeinformationen wird der Benutzer erfolgreich eingeloggt und zur Startseite weitergeleitet. | Benutzer wird eingeloggt oder abgewiesen            | Offen    | Authentifizierungsserver nicht erreichbar oder fehlerhaft |


# Testfälle und Verbesserungsvorschläge

## Überblick
Die Software ist eine Banken-Simulation, die verschiedene Kontotypen und deren Transaktionen verwaltet. Sie besteht aus mehreren Klassen, die miteinander in Beziehung stehen, um die Funktionalität einer Bank nachzubilden.



## 1. Account.java

### Black-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Erstellen eines neuen Kontos                          | Der Anfangssaldo ist korrekt initialisiert               |
| Einzahlung auf ein Konto                              | Der neue Kontostand wird korrekt aktualisiert            |
| Abhebung von einem Konto                              | Der neue Kontostand wird korrekt aktualisiert            |
| Abhebung über dem verfügbaren Saldo                   | Der Saldo bleibt unverändert, Fehler wird angezeigt      |

### White-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Test der Saldoaktualisierung bei Einzahlung           | Der Saldo wird korrekt erhöht                            |
| Test der Saldoaktualisierung bei Abhebung             | Der Saldo wird korrekt verringert                        |
| Test von Grenzbedingungen (z.B. Abhebung = Saldo)     | Der Saldo wird auf 0 gesetzt, keine Fehler               |

## 2. Bank.java

### Black-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Erstellen einer Bank mit mehreren Konten              | Die Konten werden korrekt initialisiert                  |
| Geldüberweisung zwischen zwei Konten                  | Beide Kontostände werden korrekt aktualisiert            |
| Löschen eines Kontos                                  | Das Konto wird aus der Kontenliste entfernt              |

### White-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Hinzufügen eines Kontos zur Bank                      | Das Konto wird korrekt zur Liste hinzugefügt             |
| Entfernen eines Kontos aus der Bank                   | Das Konto wird korrekt aus der Liste entfernt            |
| Test der Übertragungsmethode                          | Beide Konten werden korrekt aktualisiert                 |

## 3. Counter.java

### Black-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Erhöhen des Zählers                                   | Der Zähler wird korrekt erhöht                           |
| Verringern des Zählers                                | Der Zähler wird korrekt verringert                       |
| Rücksetzen des Zählers                                | Der Zähler wird auf den Anfangswert zurückgesetzt        |

### White-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Test der Zähleraktualisierung                         | Der Zählerstand wird korrekt aktualisiert                |
| Test von Zählergrenzen                                | Es werden keine negativen Zählerstände zugelassen        |

## 4. ExchangeRateOkhttp.java

### Black-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Abrufen eines Wechselkurses für gültige Währung       | Der korrekte Wechselkurs wird zurückgegeben              |
| Abrufen eines Wechselkurses für ungültige Währung     | Ein Fehler wird korrekt behandelt und angezeigt          |

### White-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Test der HTTP-Client-Konfiguration                    | Der Client ist korrekt konfiguriert und funktioniert      |
| Test der JSON-Verarbeitung                            | Die API-Antwort wird korrekt geparst                     |

## 5. Main.java

### Black-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Ausführen der Anwendung mit vollständiger Transaktion | Die Transaktion wird korrekt ausgeführt                  |
| Überprüfung der Konsolenausgabe                       | Die Ausgabe ist korrekt und entspricht den Erwartungen   |

### White-Box Testfälle
| Testfall                                              | Erwartetes Ergebnis                                      |
|-------------------------------------------------------|----------------------------------------------------------|
| Test des Kontrollflusses in der Main-Methode          | Der Code wird korrekt durchlaufen                        |
| Test der Ausnahmebehandlung                           | Fehlerhafte Eingaben werden korrekt abgefangen           |

## Verbesserungsvorschläge und Best Practices
- **Einhaltung der SOLID-Prinzipien**: Jede Klasse sollte nur eine Verantwortung haben.
- **Dokumentation**: Nutzung von Javadoc für bessere Wartbarkeit.
- **Fehlerbehandlung**: Bessere Fehlerbehandlung und Logging.
- **Unit-Tests**: Implementierung von Unit-Tests für alle Methoden.
- **Code-Formatierung**: Konsistente Einrückungen und Namenskonventionen.