# Banken-Simulation Dokumentation

## Überblick
Die Software ist eine Banken-Simulation, die verschiedene Kontotypen und deren Transaktionen verwaltet. Sie besteht aus mehreren Klassen, die miteinander in Beziehung stehen, um die Funktionalität einer Bank nachzubilden.

## Klassen und Beziehungen

### Bank
- **Methoden**:
  - `createAccount()`: Erstellt ein neues Konto.
  - `deposit()`: Einzahlung auf ein Konto.
  - `getBalance()`: Abfrage des Kontostands.
  - `print()`: Druckt Kontoinformationen.
  - `withdraw()`: Abhebung von einem Konto.
- **Beziehungen**:
  - Aggregation zu `Account` (Eine Bank hat 0..1 Accounts).

### Account
- **Attribute**:
  - `balance: long`
  - `id: String`
- **Methoden**:
  - `canTransact()`: Prüft, ob Transaktionen möglich sind.
  - `deposit()`: Einzahlung auf das Konto.
  - `print()`: Druckt Kontoinformationen.
  - `withdraw()`: Abhebung vom Konto.
- **Beziehungen**:
  - Vererbung: `SavingsAccount`, `SalaryAccount`, `PromoYouthSavingsAccount` leiten von `Account` ab.

### Booking
- **Attribute**:
  - `amount: long`
  - `id: int`
- **Methoden**:
  - `print()`: Druckt Buchungsinformationen.
- **Beziehungen**:
  - Aggregation zu `Account` (Ein Account hat 0..1 Buchungen).

### SavingsAccount
- **Methoden**:
  - `withdraw()`: Spezifische Implementierung der Abhebung für Sparkonten.
- **Beziehungen**:
  - Erbt von `Account`.

### SalaryAccount
- **Methoden**:
  - `print()`: Druckt spezifische Informationen für Gehaltskonten.
  - `withdraw()`: Spezifische Implementierung der Abhebung für Gehaltskonten.
- **Beziehungen**:
  - Erbt von `Account`.

### PromoYouthSavingsAccount
- **Methoden**:
  - `deposit()`: Spezifische Implementierung der Einzahlung für Jugend-Sparkonten.
- **Beziehungen**:
  - Erbt von `Account`.

### BankUtils
- **Konstanten**:
  - `AMOUNT_FORMAT`: Format für Beträge.
  - `TWO_DIGIT_FORMAT`: Format für zwei Dezimalstellen.
- **Methoden**:
  - `formatAmount()`: Formatiert Beträge.
  - `formatBankDate()`: Formatiert Daten.
- **Beziehungen**:
  - Hilfsklasse, keine direkte Beziehung zu anderen Klassen.

## Zusammenhänge
- **Bank** verwaltet Konten (`Account`) und bietet Methoden zur Durchführung von Transaktionen.
- **Account** ist die Basisklasse für verschiedene Kontotypen (`SavingsAccount`, `SalaryAccount`, `PromoYouthSavingsAccount`).
- **Booking** speichert Informationen zu Transaktionen und ist einem `Account` zugeordnet.
- **BankUtils** stellt Hilfsmethoden zur Formatierung von Beträgen und Daten bereit.

## Funktionalität
- Konten können erstellt, eingezahlt und abgehoben werden.
- Transaktionen (`Booking`) werden mit Beträgen und IDs verwaltet.
- Formatierungen für Beträge und Daten werden durch `BankUtils` bereitgestellt.

Diese Dokumentation bietet einen Überblick über die Funktionsweise und die Zusammenhänge der Software basierend auf dem Klassendiagramm.
