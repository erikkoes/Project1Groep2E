import java.util.*;
class Examen {
    private static ArrayList<Examen> alleExamens = new ArrayList<Examen>();
    private String naam;
    private ArrayList<Vraag> vragen;
    private ArrayList<Student> examenGeslaagd;

    Examen(String naam) {
        this.naam=naam;
        alleExamens.add(this);
    }
    public ArrayList<Examen> getAlleExamens(){
        return alleExamens;
    }
    
    public String getNaam() {
        return this.naam;
    }

    public ArrayList<Vraag> getVragen(){
        return this.vragen;
    }

    public Integer getAantalVragen() {
        return vragen.size();
    }  

    public ArrayList<Student> getGeslaagd() {
        return examenGeslaagd;
    }

    public void stelVragen(Resultaat r){
       
       for(Vraag v: vragen ){
        
        v.displayVraag();   //todo Deze functies maken in class vraag
                            // v.stelVraag(); deze returnt een boolean
        r.addGoedOfFoutPerVraag(v.stelVraag());
       }
    }

}