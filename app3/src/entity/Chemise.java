package entity;

public class Chemise extends Article{
    private String couture;

    public Chemise(int id, String lib,String couture) {
        super(id, lib);
        this.couture=couture;
    }

    public String getCouture() {
        return couture;
    }

    public void setCouture(String couture) {
        this.couture = couture;
    }
}
