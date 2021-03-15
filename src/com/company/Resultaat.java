class Resultaat {

    private static ArrayList<Resultaat> alleResultaten = new ArrayList<Resultaat>;

    private Examen fromExamen;
    private Student byStudent;

    public Resultaat(Student s, Examen e){
        this.fromExamen = e;
        this.byStudent = s;
        this.alleResultaten.add(this);
    }
    public Examen getFromExamen(){
        return this.fromExamen;
    }
    public Student getByStudent(){
        return this.byStudent;
    }
}