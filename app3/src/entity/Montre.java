package entity;

public class Montre extends Article {

    private String nature;

    public Montre(int id, String lib, String nature) {
        super(id, lib);
        this.nature = nature;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }
}
