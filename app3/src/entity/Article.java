package entity;

public class Article {
    protected int id;
    private String lib ;

    public Article(int id, String lib) {
        this.id = id;
        this.lib = lib;
    }

    public int getId() {
        return id;
    }

    public String getLib() {
        return lib;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }
}
