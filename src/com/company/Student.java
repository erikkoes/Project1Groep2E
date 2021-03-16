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

}