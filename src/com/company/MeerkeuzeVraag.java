class MeerkeuzeVraag extends Vraag{

  private ArrayList<String> opties;
  private Integer goedAntwoord;


  MeerkeuzeVraag(String vraag) {
    super(vraag);
    opties = new ArrayList<String>;
  }

  public void addOptie(String optie, Boolean correct) {
    //todo voeg list? toe met de goede optie om later te kunnen controleren
    opties.add(optie);
    if (goedAntwoord) {
      goedAntwoord = opties.size()
    }
  }

  public Boolean stelVraag() {
    System.out.println("Geef uw antwoord: ")

  }
    
}