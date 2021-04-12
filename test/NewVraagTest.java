import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class NewVraagTest {

    Student klaas;

    MeerkeuzeVraag meerkvraag1;
    MeerkeuzeVraag meerkvraag2;
    OpenVraag opvraag1;
    OpenVraag opvraag2;

    @BeforeEach
    void setUp() {
        klaas = new Student(12345678,"Klaas");

        meerkvraag1 = new MeerkeuzeVraag("Wat is de hoofdstad van Nederland?");
        meerkvraag1.addOptie("Rotterdam",false);
        meerkvraag1.addOptie("Den Haag",false);
        meerkvraag1.addOptie("Groningen",false);
        meerkvraag1.addOptie("Amsterdam",true);

        opvraag1 = new OpenVraag("Wat is 5*5+2?","27");
    }

    @AfterEach
    void tearDown() {
        klaas=null;
        meerkvraag1=null;
        meerkvraag2=null;
        opvraag1=null;
        opvraag2=null;
    }

    @Test
    void testDisplayVraag() {
        String expected="Wat is 5*5+2?";
        String actual = opvraag1.displayVraagTest();
        assertEquals(expected,actual);
    }
}