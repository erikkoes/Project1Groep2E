class Student {
    private String naam;
    private Integer StudentenNummer;
    private ArrayList<Resultaat> gemaakteExamens;
    private Boolean admin = false;

    Student(Integer StudentenNummer, String naam) {
        this.StudentenNummer = StudentenNummer;
        this.naam = naam;
        gemaakteExamens = new ArrayList<Resultaat>();
    }

}