class Vraag {

    private String vraag;
    private String goedAntwoord;
    
    Vraag(String vraag, String goedAntwoord){
       this.vraag = vraag;
       this.goedAntwoord = goedAntwoord;
   }
   public String getGoedAntwoord(){
       return this.goedAntwoord;
   }
   public String getVraag(){
       return this.vraag;
   }

}