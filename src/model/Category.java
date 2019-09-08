package model;

public class Category {
    private long id;
    private String name;
    private String des;

    public Category(long id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
