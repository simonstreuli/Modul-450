# Überblick über gängige JUnit-Features

JUnit ist ein weit verbreitetes Framework für das Testen von Java-Anwendungen. Hier sind die wichtigsten Features zusammengefasst:

## 1. Test-Annotationen

JUnit verwendet Annotationen, um Tests zu definieren und deren Verhalten zu steuern.

- `@Test`: Kennzeichnet eine Methode als Testmethode.
  - **Beispiel**:
    ```java
    @Test
    void testAddition() {
        assertEquals(2, 1 + 1);
    }
    ```
- `@BeforeEach`: Wird vor jeder Testmethode ausgeführt.
  - **Beispiel**:
    ```java
    @BeforeEach
    void setup() {
        // Setup Code
    }
    ```
- `@AfterEach`: Wird nach jeder Testmethode ausgeführt.
  - **Beispiel**:
    ```java
    @AfterEach
    void teardown() {
        // Teardown Code
    }
    ```
- `@BeforeAll`: Wird einmal vor allen Testmethoden ausgeführt (statisch).
  - **Beispiel**:
    ```java
    @BeforeAll
    static void initAll() {
        // Initialization Code
    }
    ```
- `@AfterAll`: Wird einmal nach allen Testmethoden ausgeführt (statisch).
  - **Beispiel**:
    ```java
    @AfterAll
    static void cleanupAll() {
        // Cleanup Code
    }
    ```
- `@Disabled`: Deaktiviert eine Testmethode oder eine Testklasse.
  - **Beispiel**:
    ```java
    @Disabled("Not implemented yet")
    @Test
    void testNotImplemented() {
        // Test Code
    }
    ```

[JUnit-Dokumentation zu Test-Alnnotationen](https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations).

## 2. Assertions

Assertions werden verwendet, um die erwarteten Ergebnisse zu überprüfen.

- `assertEquals(expected, actual)`: Überprüft, ob zwei Werte gleich sind.
  - **Beispiel**:
    ```java
    @Test
    void testEquality() {
        assertEquals(2, 1 + 1);
    }
    ```
- `assertTrue(condition)`: Überprüft, ob eine Bedingung wahr ist.
  - **Beispiel**:
    ```java
    @Test
    void testCondition() {
        assertTrue(3 > 2);
    }
    ```
- `assertFalse(condition)`: Überprüft, ob eine Bedingung falsch ist.
  - **Beispiel**:
    ```java
    @Test
    void testFalseCondition() {
        assertFalse(2 > 3);
    }
    ```
- `assertNull(value)`: Überprüft, ob ein Wert null ist.
  - **Beispiel**:
    ```java
    @Test
    void testNull() {
        assertNull(null);
    }
    ```
- `assertNotNull(value)`: Überprüft, ob ein Wert nicht null ist.
  - **Beispiel**:
    ```java
    @Test
    void testNotNull() {
        assertNotNull(new Object());
    }
    ```
- `assertThrows(expectedType, executable)`: Überprüft, ob eine Ausnahme geworfen wird.
  - **Beispiel**:
    ```java
    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 1 / 0;
        });
    }
    ```

[JUnit-Dokumentation zu Assertions](https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions).

## 3. Test Suites

Mit JUnit können Test Suites erstellt werden, um mehrere Testklassen gemeinsam auszuführen.

- `@Suite`: Kennzeichnet eine Klasse als Test Suite.
  - **Beispiel**:
    ```java
    @RunWith(Suite.class)
    @Suite.SuiteClasses({TestClass1.class, TestClass2.class})
    public class TestSuite {
        // Suite Code
    }
    ```
[JUnit-Dokumentation zu Test Suites](https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-suites).

## 4. Parametrisierte Tests

JUnit unterstützt parametrisierte Tests, die es ermöglichen, eine Testmethode mit verschiedenen Eingabewerten mehrmals auszuführen.

- `@ParameterizedTest`: Kennzeichnet eine Methode als parametrisierten Test.
  - **Beispiel**:
    ```java
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void testWithParameters(String word) {
        assertNotNull(word);
    }
    ```
- `@CsvSource`: Gibt CSV-Daten an, die an die Testmethode übergeben werden.
  - **Beispiel**:
    ```java
    @ParameterizedTest
    @CsvSource({"apple, 1", "banana, 2"})
    void testWithCsvSource(String fruit, int number) {
        assertNotNull(fruit);
        assertTrue(number > 0);
    }
    ```

[JUnit-Dokumentation zu Parametrisierten Tests](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests).

## 5. Assumptions

Assumptions werden verwendet, um Tests nur unter bestimmten Bedingungen auszuführen.

- `assumeTrue(condition)`: Fährt nur fort, wenn die Bedingung wahr ist.
  - **Beispiel**:
    ```java
    @Test
    void testOnCondition() {
        assumeTrue("DEV".equals(System.getenv("ENV")));
        // Test Code
    }
    ```
- `assumeFalse(condition)`: Fährt nur fort, wenn die Bedingung falsch ist.
  - **Beispiel**:
    ```java
    @Test
    void testOnFalseCondition() {
        assumeFalse("PROD".equals(System.getenv("ENV")));
        // Test Code
    }
    ```
- `assumingThat(condition, executable)`: Führt den angegebenen Code nur aus, wenn die Bedingung wahr ist.
  - **Beispiel**:
    ```java
    @Test
    void testConditionalExecution() {
        assumingThat("DEV".equals(System.getenv("ENV")), () -> {
            // Conditional Test Code
        });
        // Always executed
    }
    ```

[JUnit-Dokumentation zu Assumptions](https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions).

## 6. Timeout

JUnit bietet die Möglichkeit, Tests mit einer maximalen Ausführungszeit zu versehen.

- `@Test(timeout = millis)`: Setzt eine Zeitüberschreitung für eine Testmethode.
  - **Beispiel**:
    ```java
    @Test(timeout = 1000) // Test muss innerhalb von 1000 Millisekunden abgeschlossen sein
    void testWithTimeout() {
        // Testlogik
    }
    ```

[JUnit-Dokumentation zu Zeitüberschreitungen](https://junit.org/junit5/docs/current/user-guide/#writing-tests-timeouts).

Alle Informationen kommen von hier:
__[offizielle JUnit-Dokumentation](https://junit.org/junit5/docs/current/user-guide/).__
