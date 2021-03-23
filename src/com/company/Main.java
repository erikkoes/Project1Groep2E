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



    }
}










