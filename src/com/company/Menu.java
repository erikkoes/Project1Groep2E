import java.util.*;
class Menu {
    /* dit object eenmalig aanmaken
    daarna displayMenu() en menuChoice() loopen*/

    private static Boolean exit = false; //Wanneer je uit de loop wilt, word dit naar true veranderd.

    private Student user;                /* de student die momenteel het menu gebruikt.
                                            als de student een Admin is, is het menu verbreedt.*/

    Menu(){
        System.out.println("\n\nWelkom bij het examencommissie programma van projectgroep 2E\n\n");
    }

    public void displayMenu(Student s){
        this.user = s;
        System.out.println("\n\n1) Examen afnemen");
        System.out.println("2) Is student geslaagd voor laatst gemaakt examen?");
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
    public void menuChoice(Student s){
        this.user = s;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch(choice){
            case 4:
                //todo: Lijst met examens displayen
                break;
            case 5:
                //lijst met studenten displayen
                break;
            case 6:
                //nieuwe student inschrijven
                break;
            case 7:
                //student verwijderen
                break;
            case 1:
                //examen afnemen
                break;
            case 2:
                //is student geslaagd voor de test?
                break;
            case 3:
                //welke examens heeft student gehaald
                break;
            case 8:
                //welke student heeft de meeste examens gehaald?
                break;
            case 0:
                this.exit = true;
                break;
            default: 
                System.out.println("\nInvalid input!\n");
        
        }


    }
    public Boolean getExit(){
        return exit;
    }
}