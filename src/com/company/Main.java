package com.company;
import java.util.*;

class Main {

    public static void main(String[] args) {

    }
}

class Menu {

    Menu(){
        System.out.println("Welkom bij het examencommissie programma van projectgroep 2E");
    }

    public void displayMenu(){
        System.out.println("1) Lijst met examens");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println("4) Student verwijderen");
        System.out.println("5) Examen afnemen");
        System.out.println("6) Is student geslaagd voor test?");
        System.out.println("7) Welke examens heeft student gehaald?");
        System.out.println("8) Welke student heeft de meeste examens gehaald?");
        System.out.println("0) Exit");
/* pls???? */
    }
}

class Vraag {

    private String typeVraag;
    private String vraag;
    private String goedAntwoord;
    
    Vraag(String typeVraag, String vraag, String goedAntwoord){
       this.typeVraag=typeVraag;
       this.vraag = vraag;
       this.goedAntwoord = goedAntwoord;
   }
   public String getGoedAntwoord(){
       return this.goedAntwoord;
   }
   public String getVraag(){
       return this.vraag;
   }
   public String getTypeVraag(){
       return this.typeVraag;
   }

}



class Examen {
    private String naam;
    private Integer aantalVragen;
    private String soortVragen;

    Examen(String naam, Integer aantalVragen, String soortVragen) {
        this.naam=naam;
        this.aantalVragen=aantalVragen;
        this.soortVragen=soortVragen;
    }
}
class Student {
    private String name;
    private Integer StudentenNummer;

<<<<<<< Updated upstream
    public String getNaam() {
        return this.naam;
    }

    public Integer getAantalVragen() {
        return this.aantalVragen;
    }

    public String getSoortVragen() {
        return this.soortVragen;
    }

    

=======
    Student(Integer StudentenNummer) {
        this.StudentenNummer = StudentenNummer;
    }
>>>>>>> Stashed changes
}



