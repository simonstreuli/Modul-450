# Aufgabe 1

#### Mit welchen Test Levels hatten Sie bereits zu tun?

Die verschiedenen Test Levels, mit denen ich bisher gearbeitet habe, umfassen:

- **Unit-Tests (z. B. JUnit):** Fokus auf einzelne Methoden oder Funktionen.
- **Integrationstests:** Validierung der Interaktion zwischen Modulen.
- **Systemtests:** Überprüfung des Gesamtsystems.
- **Akzeptanztests:** Tests basierend auf Kundenanforderungen, meist durchgeführt von Endbenutzern oder QA-Teams.

---

#### Wann werden Tests ausgeführt?

- **Während der Entwicklung (Shift Left):** Unit- und Integrationstests parallel zur Entwicklung.
- **Nach der Entwicklung:** Systemtests vor der Freigabe.
- **Vor und nach dem Deployment:** Regressionstests, um sicherzustellen, dass Änderungen keine unerwünschten Effekte haben.
- **Kontinuierlich:** CI/CD-Pipelines ermöglichen automatisierte Tests bei jedem Commit.

---

#### Haben Sie dedizierte Testing- oder QA-Teams?

Bei Helsana gibt es dedizierte QA-Teams, die für das Testmanagement verantwortlich sind. Entwickler führen jedoch auch eigenständig Tests (z. B. Unit-Tests) durch. Die QA-Teams übernehmen:

- **Testplanung und -koordination.**
- **Erstellung von Testfällen.**
- **Automatisierung von Tests.**
- **Überwachung der Testabdeckung und Qualitätssicherung.**

---

#### Wie sieht Ihr Testing Lifecycle aus?

1. **Anforderungsanalyse:** Klärung der zu testenden Anforderungen.
2. **Testplanung:** Definition der Teststrategie und Auswahl der Testarten (automatisiert/manuell).
3. **Testdesign:** Erstellung der Testfälle und Vorbereitung der Testdaten.
4. **Testausführung:** Durchführung von Tests, manuell oder automatisiert.
5. **Defect Management:** Erfassung und Verfolgung von Fehlern.
6. **Reporting:** Erstellung von Testberichten und Kommunikation mit Stakeholdern.
7. **Abschluss:** Lessons Learned und Optimierung des Testprozesses.

---

# Aufgabe 2

#### 1.Testing Approach (Testansatz):

Beschreibt die übergeordnete Strategie, wie Tests geplant, entworfen und ausgeführt werden. Es gibt zwei Hauptansätze:

- **Präventiv (präskriptiv):** Strukturierter Ansatz mit detaillierten Testplänen, der frühzeitig startet.
- **Reaktiv:** Flexibler Ansatz, der sich an veränderte Anforderungen anpasst, oft explorativ.

---

#### 2. Testing Levels (Teststufen):
Beschreiben die Hierarchie der Tests und konzentrieren sich auf unterschiedliche Testziele:

- **Unit Testing:** Test einzelner Code-Elemente, oft durch Entwickler.
- **Integration Testing:** Validierung von Schnittstellen zwischen Modulen.
- **System Testing:** Sicherstellung, dass die gesamte Anwendung wie vorgesehen funktioniert.
- **Acceptance Testing:** Endbenutzer überprüfen, ob Anforderungen erfüllt sind.

---

#### 3. Testing Types, Techniques und Tactics

 **Testing Types:**
- **Funktionale Tests:** 
  - Beispiel: Unit-, System- oder Akzeptanztests.
- **Nicht-funktionale Tests:**
  - Beispiel: Performance-, Usability-Tests.


 **Testing Techniques:**
- **Black-Box-Techniken:** 
  - Fokus auf Eingaben und erwartete Ausgaben.
  - Beispiele: Äquivalenzklassen, Grenzwertanalyse.
- **White-Box-Techniken:** 
  - Fokus auf die interne Struktur des Codes.
  - Beispiele: Code Coverage, Pfadtests.

 **Testing Tactics:**
- **Methoden, um spezifische Ziele zu erreichen:**
  - Beispiele: Exploratory Testing, Pair Testing.
