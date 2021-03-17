import java.util.*;
class MeerkeuzeVraag extends Vraag{

  private ArrayList<String> opties;
  private Integer goedAntwoord;


  MeerkeuzeVraag(String vraag) {
    super(vraag);
    opties = new ArrayList<String>;
  }

  public void addOptie(String optie, Boolean correct) {
    
    opties.add(optie);
    if (correct) {
      goedAntwoord = opties.size() +1;
    }
  }

  public void displayVraag() {
    System.out.println(vraag);
    String x = "";
    for(int i=0;i<opties.size();i++) {
      x = "["+(i+1)+"] ";
      System.out.println(x+opties.get(i));
    }
  }

  public Boolean stelVraag() {
    System.out.println("Geef uw antwoord: ");
    Scanner scanner = new Scanner(System.in);
    Integer antwoord = 0;
    antwoord = scanner.nextInt(); //Gebruiker geeft antwoord
    if (antwoord==goedAntwoord) { //Check of anwtoord klopt
      return true;
    } else {
      return false;
    }
  }

  


  



    
}