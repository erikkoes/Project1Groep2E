package com.company;

class Main {

    public static void main(String[] args) {

    }
}

class Vraag {
    private String typeVraag;
    private String vraag;
    private String goedAntwoord;
    Vraag(String typeVraag, String vraag, String goedAntwoord){
       this.typeVraag=typeVraag;
       this.vraag = vraag;
       this.goedAntwoord = goedAntwoord;
   }
   public getGoedAntwoord(){
       return this.goedAntwoord;
   }
   public getVraag(){
       return this.vraag;
   }
   public getTypeVraag(){
       return this.typeVraag;
   }
}



class Examen {
    private String naam;
    private Integer aantalVragen;
    private String soortVragen;

    public Examen(String naam, Integer aantalVragen, String soortVragen) {
        this.naam=naam;
        this.aantalVragen=aantalVragen;
        this.soortVragen=soortVragen;
    }

    public String getNaam() {
        return this.naam;
    }

    public Integer getAantalVragen() {
        return this.aantalVragen;
    }

    public String getSoortVragen() {
        return this.soortVragen;
    }

    

}


