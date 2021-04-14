import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NewResultaatTest {
    Student klaas;

    MeerkeuzeVraag meerkvraag1;
    MeerkeuzeVraag meerkvraag2;

    OpenVraag opvraag1;
    OpenVraag opvraag2;
    OpenVraag opvraag3;

    Examen topografie;
    Examen rekenen;

    @BeforeAll
    void setUp() {
    }
}