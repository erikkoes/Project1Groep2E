class Vraag {

    private String vraag;
    
    Vraag(String vraag){
       this.vraag = vraag;
   }

   public String getVraag(){
       return this.vraag;
   }

   public void setVraag(String vraag){
       this.vraag = vraag;
   }

   public void displayVraag() {
    System.out.println(vraag);
   }


   
}