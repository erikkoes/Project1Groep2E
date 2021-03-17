import java.util.*;
class OpenVraag extends Vraag{

  private String goedAntwoord;

  OpenVraag(String vraag, String goedAntwoord) {
    super(vraag); //Zie superclass "Vraag"
    this.goedAntwoord=goedAntwoord;
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