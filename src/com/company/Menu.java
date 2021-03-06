
import java.util.*;

class Menu {
    /* dit object eenmalig aanmaken
    daarna displayMenu() en menuChoice() loopen*/

    private static Boolean exit = false; //Wanneer je uit de loop wilt, word dit naar true veranderd

    private Student user;                /* de student die momenteel het menu gebruikt.
                                            als de student een Admin is, is het menu verbreedt.*/

    Menu(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("\n\nWelkom bij het examencommissie programma van projectgroep 2E");
      System.out.println("Voeg studentnummer en naam in om te beginnen\n\n");

      System.out.println("Studentnummer: ");   
      Integer studentennummer = scanner.nextInt();
      scanner.nextLine();

      System.out.println("Naam: ");
      String naam = scanner.nextLine();

      this.user = new Student(studentennummer,naam);
      user.setAdmin();
    }


    public void displayMenu(){
        System.out.println("\n\n1) Examen afnemen");
        System.out.println("2) Is student geslaagd voor laatst gemaakte examen?");
        System.out.println("3) Welke examens heeft student gehaald?");
        if(user.getAdmin()){
            System.out.println("4) Lijst met examens");
            System.out.println("5) Lijst met studenten");
            System.out.println("6) Nieuwe student inschrijven");
            System.out.println("7) Student verwijderen");
            System.out.println("8) Welke student heeft de meeste examens gehaald?");
        }
        System.out.println("0) Exit\n\n\n");

    }
    public void menuChoice(){
      Scanner scanner = new Scanner(System.in);
        // this.user = s;
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 4:
                //todo: Lijst met examens displayen     todo Chris
                for(Examen s:Examen.getAlleExamens()){
                    System.out.println(s.getNaam());
                }
                break;
            case 5:
                //lijst met studenten displayen     Todo Chris
                for(Student s: Student.getAlleStudenten()){
                    System.out.println(s.getName());
                }
                break;
            case 6:
                //nieuwe student inschrijven    Todo Chris
                System.out.println("Voer naam in:");
                String naam  = "";
                naam = scanner.nextLine();
                Integer StudentNr = Student.getLastStudent().getStudentNumber()+1;
                Student s = new Student(StudentNr,naam);
                break;
            case 7:
                //student verwijderen
                System.out.println("Deze studenten zijn ingeschreven:");
                int x = 1;
                for(Student stu: Studentenlijst.getList()){
                    System.out.println(x+") "+stu.getName());
                    x++;
                }
                x=1;
                System.out.println("Welke wilt u verwijderen?:");
                int student = scanner.nextInt();
                scanner.nextLine();
                for(Student stud: Studentenlijst.getList()) {
                    if (x == student) {
                        System.out.println("Test");
                    }
                    x++;
                }
                break;
            case 1:
                //examen afnemen            Todo Stan
                System.out.println("Deze examens zijn beschikbaar:");
                int i = 1;
                for(Examen e:Examen.getAlleExamens()){
                    System.out.println(i+") "+e.getNaam());
                    i++;
                }
                i = 1;
                System.out.println("Welk examen wilt u afnemen?:");
                  int examen = scanner.nextInt();
                  scanner.nextLine();
                for(Examen ex:Examen.getAlleExamens()){
                  if(i == examen){
//                    user.maakExamen(ex);
                  }
                  i++;
                }
                break;
            case 2:
                //is student geslaagd voor de test?     Todo Stan


                break;
            case 3:
                //welk examen heeft de student gehaald?         Todo Stan

                break;
            case 8:
                //welke student heeft de meeste examens gehaald?        Todo Stan


                break;
            case 0:
                this.exit = true;
                break;
            default: 
                System.out.println("\nInvalid input!\n");
        
        }


    }
    public boolean getExit(){
        return exit;
    }
}