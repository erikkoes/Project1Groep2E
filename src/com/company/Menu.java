class Menu {
    /* dit object eenmalig aanmaken
    daarna displayMenu() en menuChoice() loopen*/
    Boolean exit = false;


    Menu(){
        System.out.println("Welkom bij het examencommissie programma van projectgroep 2E");
    }

    public void displayMenu(){
        System.out.println("\n\n1) Lijst met examens");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println("4) Student verwijderen");
        System.out.println("5) Examen afnemen");
        System.out.println("6) Is student geslaagd voor test?");
        System.out.println("7) Welke examens heeft student gehaald?");
        System.out.println("8) Welke student heeft de meeste examens gehaald?");
        System.out.println("0) Exit\n\n\n");

    }
    public void menuChoice(){

        int choice = System.in.nextInt()
        switch(choice){
            case 1:
                //Lijst met examens displayen
                break;
            case 2:
                //lijst met studenten displayen
                break;
            case 3:
                //nieuwe student inschrijven
                break;
            case 4:
                //student verwijderen
                break;
            case 5:
                //examen afnemen
                break;
            case 6:
                //is student geslaagd voor de test?
                break;
            case 7:
                //welke examens heeft student gehaald
                break;
            case 8:
                //welke student heeft de meeste examens gehaald?
                break;
            case 0:
                this.exit = true;
                break:
            default: 
                System.out.println("\nInvalid input!\n");
        
        }


    }
    public getExit(){
        return exit;
    }
}