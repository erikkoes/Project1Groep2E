import java.util.*;
class MeerkeuzeVraag extends Vraag{

  private ArrayList<String> opties;
  private String goedAntwoord;

  MeerkeuzeVraag(String vraag) {
    super(vraag);
    opties = new ArrayList<String>();
  }

  public void addOptie(String optie, Boolean correct) {
    Integer x=0;
    opties.add(optie);
    if (correct) {
      x = opties.size();
    }
    goedAntwoord= String.format("%d", x);
  }

  public void displayVraag() {
    System.out.println(this.getVraag());
    String x = "";
    for(int i=0;i<opties.size();i++) {
      x = "["+(i+1)+"] ";
      System.out.println(x+opties.get(i));
    }
  }

  public String displayVraagTest() {
    String x="";
    x+=this.getVraag();
//    System.out.println(this.getVraag());
    String y="";
    for(int i=0;i<opties.size();i++) {
      y = "["+(i+1)+"] ";
      x+=y+opties.get(i);
//      System.out.println(x+opties.get(i));
    }
    return x;
  }

  public Boolean stelVraag() {
    System.out.println("Geef uw antwoord: ");
    Scanner scanner = new Scanner(System.in);
    String antwoord = "";
    antwoord = scanner.nextLine(); //Gebruiker geeft antwoord
    if (antwoord.equals(goedAntwoord)) { //Check of anwtoord klopt
      return true;
    } else {
      return false;
    }
  }

}