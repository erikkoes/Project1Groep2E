import java.util.*;
class Resultaat {

    private static ArrayList<Resultaat> alleResultaten = new ArrayList<Resultaat>();  //een arraylist met alle gemaakte examens. alleen op te roepen door een admin.

    private Examen fromExamen;
    private Student byStudent;
    private Double cijfer;
    private ArrayList<Vraag> vragen;
    private ArrayList<Boolean> goedOfFoutPerVraag; //bij het maken van een examen word in deze arraylist ingevuld of vragen goed of fout zijn, DMV addGoedOfFoutPerVraag()

    public Resultaat(Student s, Examen e){
        this.fromExamen = e;
        this.byStudent = s;
        vragen = new ArrayList<Vraag>();
//        vragen.add(e.getVragen()); //geeft error in IDE, kan blijkbaar geen lijst in lijst zetten
        goedOfFoutPerVraag = new ArrayList<Boolean>();
        alleResultaten.add(this);
    }

    public Examen getFromExamen(){
        return this.fromExamen;
    }

    public Student getByStudent(){
        return this.byStudent;
    }

    public static ArrayList<Resultaat> getAlleResultaten(){
        return alleResultaten;
    }

    public void addGoedOfFoutPerVraag(Boolean b){
        goedOfFoutPerVraag.add(b);

    }
    public Double getCijfer(){
        if(goedOfFoutPerVraag.size()==0){                           //als er geen vragen zijn beantwoord word 0 returned.
            System.out.println("\nExamen is niet gemaakt\n");
            return 0.0;
        }
        else{
            Double goedeAntwoorden=0.0;
            for(Boolean temp : goedOfFoutPerVraag){                 //loopt door alle beantwoorde vragen en kijkt welke goed zijn beantwoord.
                if(temp){
                    goedeAntwoorden++;                              //als de vraag goed beantwoord is gaat de counter omhoog.
                }
            }
            int alleVragen = vragen.size();
            this.cijfer = goedeAntwoorden/alleVragen*10;            //cijfer word berekend door alle goede antwoorden te delen door het aantal vragen, en dan te vermenigvuldigen met 10.
            return this.cijfer;
        }
    }

}