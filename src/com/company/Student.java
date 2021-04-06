import java.util.*;
class Student {
    private static ArrayList<Student> alleStudenten = new ArrayList<Student>();
    
    private String naam;
    private Integer StudentenNummer;
    private ArrayList<Resultaat> gemaakteExamens;
    private Boolean admin = false;

   

    Student(Integer StudentenNummer, String naam) {
        this.StudentenNummer = StudentenNummer;
        this.naam = naam;
        if(naam.equals("admin")){
            this.admin = true;
        }
        gemaakteExamens = new ArrayList<Resultaat>();
        alleStudenten.add(this);
    }
    public static  ArrayList<Student> getAlleStudenten(){
        return alleStudenten;
    }
    public static  Student getLastStudent(){
        int x = alleStudenten.size();
        return alleStudenten.get(x-1);
    }

    public Integer getStudentNumber(){
      return this.StudentenNummer;
    }

    public String getName() {
      return this.naam;
    }

    public Boolean getAdmin() {
        return this.admin;
    }

    public void setAdmin() {
        this.admin=true;
    }

    public void maakExamen(Examen e){
      Resultaat r = new Resultaat(this, e);    //Er word hier een nieuwe Resultaat class aangemaakt. in deze class word opgeslgaen wat de student als resultaat heeft voor dit examen.

      e.stelVragen(r);  // in deze functie worden vragen gesteld, en word in de resultaten class toegevoegd of de vragen goed of fout zijn beantwoord.
      gemaakteExamens.add(r);
      //dit examen is af, en word toegevoegd bij arraylist van gemaakte examens.

    }

}