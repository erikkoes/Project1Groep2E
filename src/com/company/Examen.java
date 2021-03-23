import java.util.*;
class Examen {
    private static ArrayList<Examen> alleExamens = new ArrayList<Examen>();
    private String naam;
    private ArrayList<Vraag> vragen;

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

    public void addVraag(Vraag v){
        vragen.add(v);
    }

    public void stelVragen(Resultaat r){
       
       for(Vraag v: vragen ){
        
        v.displayVraag();   //todo Deze functies maken in class vraag
                            // v.stelVraag(); deze returnt een boolean
        r.addGoedOfFoutPerVraag(v.stelVraag());
       }
    }

}