package QLSV.src.model;

public class Student {
    private String name, id;
    private StudentType type;

    public Student(String name, String id, StudentType type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public StudentType getType() {
        return type;
    }

}
