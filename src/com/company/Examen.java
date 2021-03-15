class Examen {
    private String naam;
    private ArrayList<Vraag> vragen;
    private Integer aantalVragen;

    Examen(String naam) {
        this.naam=naam;
    }
    
    public String getNaam() {
        return this.naam;
    }

    public ArrayList<Vraag> getVragen(){
        return this.vragen;
    }

    public Integer getAantalVragen() {
        return vragen.size()
    }  

}