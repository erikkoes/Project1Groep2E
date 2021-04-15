import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
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
        topografie.addVraag(opvraag1);
        topografie.addVraag(opvraag2);
        topografie.addVraag(opvraag3);
        rekenen = new Examen("Rekenexamen");
        rekenen.addVraag(opvraag1);
    }

    @Test
    void testExamenMaken() {
        Resultaat r = new Resultaat(klaas,topografie);

        ArrayList<Vraag> x=new ArrayList<Vraag>();
        x= topografie.getVragen();

        String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        r.addGoedOfFoutPerVraag(x.get(0).stelVraag());

        String input2 = "27";
        System.setIn(new ByteArrayInputStream(input2.getBytes()));

        r.addGoedOfFoutPerVraag(x.get(1).stelVraag());

        String input3 = "Test";
        System.setIn(new ByteArrayInputStream(input3.getBytes()));

        r.addGoedOfFoutPerVraag(x.get(2).stelVraag());

        String input4= "xxxxxxxx";
        System.setIn(new ByteArrayInputStream(input4.getBytes()));

        r.addGoedOfFoutPerVraag(x.get(3).stelVraag());

        assertEquals(5.0,r.getCijfer(),0.001);

        assertEquals(1,klaas.getGemaakteExamens().size());
    }
}