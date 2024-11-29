
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