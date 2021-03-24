import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VraagTest {

    @Test
    void getVraag() {
        Vraag v = new Vraag(String "vraag");
        assertEquals("vraag", v.getVraag());
    }

    @Test
    void setVraag() {
        Vraag v = new Vraag("vraag2");
        assertEquals("vraag2", v.setVraag());
    }

    @Test
    void displayVraag() {
        Vraag v = new Vraag("vraag1");
        assertEquals("vraag1", v.displayVraag());
    }

    @Test
    void stelVraag() {
        Vraag v = new Vraag("wat is 1+1?");
        assertEquals("wat is 1+1?", v.stelVraag());
    }
}