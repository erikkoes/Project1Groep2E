class Menu {
    /* dit object eenmalig aanmaken
    daarna displayMenu() en menuChoice() loopen*/

    private static Boolean exit = false; //Wanneer je uit de loop wilt, word dit naar true veranderd

    private Student user;                /* de student die momenteel het menu gebruikt.
                                            als de student een Admin is, is het menu verbreedt.*/

    Menu(){
        System.out.println("\n\nWelkom bij het examencommissie programma van projectgroep 2E");
        System.out.println("Voeg studentnummer en naam in om te beginnen\n\n");
        Student user = new Student(System.in.nextInt(),System.in.nextLine());
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
        this.user = s;
        int choice = System.in.nextInt();
        switch(choice){
            case 4:
                //todo: Lijst met examens displayen     todo Chris
                for(Examen s:Examen.getAlleExamens()){
                    System.out.println(s.getNaam());
                }
                break;
            case 5:
                //lijst met studenten displayen     Todo Chris
                for(Student s: student.getAlleStudenten()){
                    System.out.println(s.getName());
                }
                break;
            case 6:
                //nieuwe student inschrijven    Todo Chris
                System.out.println("Voer naam in:");
                String naam  = "";
                naam = System.in.nextLine();
                Student.getAlleStudenten.get
                Student s = new Student()
                break;
            case 7:
                //student verwijderen       Todo Chris
                break;
            case 1:
                //examen afnemen            Todo Stan
                for(Examen s:Examen.getAlleExamens()){
                  System.out.println(s.getNaam());
                  //user.maakExamen
                }

                break;
            case 2:
                //is student geslaagd voor de test?     Todo Stan
                break;
            case 3:
                for(Examen s:User.getGeslaagd()){
                  System.out.println(s.getNaam());
                }
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