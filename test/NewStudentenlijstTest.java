import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class NewStudentenlijstTest {
    Student klaas;
    Student jan;
    Student peter;

    MeerkeuzeVraag meerkvraag1;

    OpenVraag opvraag1;


    @BeforeAll
    void setUp() {
        klaas = new Student(12345678,"Klaas");
        jan = new Student(87654321,"Jan");
        peter = new Student(7776489,"Peter");

        meerkvraag1 = new MeerkeuzeVraag("Wat is de hoofdstad van Nederland?");
        meerkvraag1.addOptie("Rotterdam",false);
        meerkvraag1.addOptie("Den Haag",false);
        meerkvraag1.addOptie("Groningen",false);
        meerkvraag1.addOptie("Amsterdam",true);

        opvraag1 = new OpenVraag("Wat is 5*5+2?","27");

    }

    @Test
    void testLaatsteStudent() {
        assertEquals(peter,Studentenlijst.getLastStudent());
    }

    @Test
    void testStudentListSize() {
        assertEquals(3,Studentenlijst.getList().size());
    }

    @Test
    void testRemoveStudent() {
        assertEquals(3,Studentenlijst.getList().size());
        Studentenlijst.removeStudent("Jan");
        assertEquals(2,Studentenlijst.getList().size());
    }

    @Test
    void testStudentOnName() {
        assertEquals(peter,Studentenlijst.getStudentOnName("Peter"));
    }

    @Test
    void testStudentOnNumber() {
        assertEquals(jan,Studentenlijst.getStudentOnNumber(87654321));
    }

}