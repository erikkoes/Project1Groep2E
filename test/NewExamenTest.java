import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NewExamenTest {
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
}