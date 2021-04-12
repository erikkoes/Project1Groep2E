import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NewExamenTest {
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
        klaas = new Student(12345678,"Klaas");

        meerkvraag1 = new MeerkeuzeVraag("Wat is de hoofdstad van Nederland?");
        meerkvraag1.addOptie("Rotterdam",false);
        meerkvraag1.addOptie("Den Haag",false);
        meerkvraag1.addOptie("Groningen",false);
        meerkvraag1.addOptie("Amsterdam",true);

        meerkvraag2 = new MeerkeuzeVraag("Test");

        opvraag1 = new OpenVraag("Wat is 5*5+2?","27");
        opvraag2 = new OpenVraag("Testen","Test");
        opvraag3 = new OpenVraag("Test","Testen");

        topografie = new Examen("Topografie Examen");
        topografie.addVraag(meerkvraag1);
        rekenen = new Examen("Rekenexamen");
        rekenen.addVraag(opvraag1);
    }

    @Test
    void testExamenLijst() {
        assertEquals(2,Examen.getAlleExamens().size());
    }

    @Test
    void testVragenInExamen() {
        assertEquals(1,topografie.getAantalVragen());
        topografie.addVraag(opvraag2);
        topografie.addVraag(opvraag3);
        assertEquals(3,topografie.getAantalVragen());
    }
}