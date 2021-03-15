class Examen {
    private String naam;
    private Integer aantalVragen;
    private String soortVragen;

    Examen(String naam, Integer aantalVragen, String soortVragen) {
        this.naam=naam;
        this.aantalVragen=aantalVragen;
        this.soortVragen=soortVragen;
    }

    public String getNaam() {
        return this.naam;
    }

    public Integer getAantalVragen() {
        return this.aantalVragen;
    }

    public String getSoortVragen() {
        return this.soortVragen;
    }

    

}