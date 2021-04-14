import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


class NewVraagTest {

    Student klaas;

    MeerkeuzeVraag meerkvraag1;

    OpenVraag opvraag1;

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
        opvraag1=null;
    }

    @Test
    void testDisplayVraag() {
        String expected="Wat is 5*5+2?";
        String actual = opvraag1.displayVraagTest();
        assertEquals(expected,actual);
    }

    @Test
    void testSetVraag() {
        opvraag1.setVraag("Wat is 13+14?");
        assertEquals("Wat is 13+14?",opvraag1.getVraag());
    }

    @Test
    void testDisplayMeerkeuzeVraag() {
        String expected = "Wat is de hoofdstad van Nederland?" +
                "[1] Rotterdam" +
                "[2] Den Haag" +
                "[3] Groningen" +
                "[4] Amsterdam";
        assertEquals(expected,meerkvraag1.displayVraagTest());
    }

    @Test
    void testStelVraag() {
        String input = "27";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertTrue(opvraag1.stelVraag());

        String input2 = "4";
        System.setIn(new ByteArrayInputStream(input2.getBytes()));
        assertTrue(meerkvraag1.stelVraag());

    }
}