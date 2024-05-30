package Deneme.Database;

public class Student {
    private int id;
    private String name;
    private int sınıf;

    public Student(int id, String name, int sınıf) {
        this.id = id;
        this.name = name;
        this.sınıf = sınıf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSınıf() {
        return sınıf;
    }

    public void setSınıf(int sınıf) {
        this.sınıf = sınıf;
    }
}
