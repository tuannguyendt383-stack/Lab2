package QLNV;


public class Employee {
    private String name, id;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "|" + id + "|" + name + "|" + salary;
    }

    
}
