package com.company;
import java.util.*;

class Main {

    public static void main(String[] args) {
            Menu menu = new Menu();
                                        //todo: verschillende Examen aanmaken met vragen
                                        //todo: Studenten aanmaken
            
            
            
            while(menu.getExit()==false){
                menu.displayMenu();
                menu.menuChoice();
                
            }

            Student piet = new Student(13579101,"Piet");
            Student klaas = new Student(58303853,"Klaas");
            Student bertus = new Student (09159839,"Bertus");

            Examen rekenen = new Examen("Rekenexamen");

            Meerkeuzevraag rekenvraag1 = new Meerkeuzevraag("Wat is 1+1?");

            rekenvraag1.addOptie("4",false);
            rekenvraag1.addOptie("27",false);
            rekenvraag1.addOptie("2",true);

            rekenvraag1




    }
}










