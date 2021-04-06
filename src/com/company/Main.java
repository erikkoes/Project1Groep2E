<<<<<<< HEAD

import java.util.*;


=======

import java.util.*;
>>>>>>> 612aa271dc707c0e1a8e0c2c750d8fb44325df1e
class Main {

    public static void main(String[] args) {
      Menu menu = new Menu();


      //todo: verschillende Examen aanmaken met vragen
      //todo: Studenten aanmaken

      Student piet = new Student(13579101,"Piet");
      Student klaas = new Student(58303853,"Klaas");
      Student bertus = new Student (9159839,"Bertus");

      Examen rekenen = new Examen("Rekenexamen");

      MeerkeuzeVraag rekenvraag1 = new MeerkeuzeVraag("Wat is 1+1?");

     rekenvraag1.addOptie("4",false);
     rekenvraag1.addOptie("27",false);
     rekenvraag1.addOptie("2",true);

     rekenen.addVraag(rekenvraag1);

     MeerkeuzeVraag rekenvraag2 = new MeerkeuzeVraag("Wat is 15*3?");
     rekenvraag2.addOptie("5",false);
     rekenvraag2.addOptie("18",false);
     rekenvraag2.addOptie("45",true);

     rekenen.addVraag(rekenvraag2);

     OpenVraag rekenvraag3 = new OpenVraag("Wat is de wortel van 25?","5");
     rekenen.addVraag(rekenvraag3);


     while(menu.getExit()==false){
            menu.displayMenu();
            menu.menuChoice();
        }

    }
}










