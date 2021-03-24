import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamenTest {

    @Test
    void getAlleExamens() {
        Examen e = new Examen("Toets1");
        assertEquals("Toets1", e.getAlleExamens());
    }

    @Test
    void getNaam() {
        Examen e = new Examen("Piet");
        assertEquals("Piet", e.getNaam());

    }

    @Test
    void getVragen() {
        Examen e = new Examen("Vraag1");
        assertEquals("Vraag1", e.getVragen());
    }

    @Test
    void getAantalVragen() {
        Examen e = new Examen("20");
        assertEquals("20", e.getAantalVragen());
    }

    @Test
    void getGeslaagd() {
        Examen e = new Examen("Geslaagd");
        assertEquals("Geslaagd", e.getGeslaagd());
    }

    @Test
    void stelVragen() {
        Examen e = new Examen("[vraag]");
        assertEquals("[vraag]", e.stelVragen());
    }
}