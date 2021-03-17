import java.util.*;
class Examen {
    private String naam;
    private Integer aantalVragen;
    private String soortVragen;
    private ArrayList<Vraag> vragen;
    private ArrayList<Student> examenGeslaagd;

    Examen(String naam) {
        this.naam=naam;
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

    public String getSoortVragen(){
        return this.soortVragen;
    }

    public void stelVragen(Resultaat r){
       
       for(Vraag v: vragen ){
        
        v.displayVraag();   //todo Deze functies maken in class vraag
                            // v.stelVraag(); deze returnt een boolean
        r.addGoedOfFoutPerVraag(v.stelVraag());
       }
    }

}