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

   public Boolean stelVraag(){
        return false; //moet een lege class zijn zodat het ge override kan worden
   }

}