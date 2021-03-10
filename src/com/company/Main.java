package com.company;

class Main {

    public static void main(String[] args) {

    }
}


class Examen {
    


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


