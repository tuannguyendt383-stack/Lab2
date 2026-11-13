package QLNV;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private static final List<Employee> employees = new ArrayList<>();

    public static List<Employee> inPut() {
        employees.add(new Employee("P001", "Employee A", 10000000.0));
        employees.add(new Employee("P002", "Employee B", 20000000.0));
        employees.add(new Employee("P003", "Employee C", 15000000.0));
        employees.add(new Employee("P004", "Employee D", 30000000.0));
        employees.add(new Employee("P005", "Employee E", 25000000.0));
        employees.add(new Employee("P006", "Employee F", 12000000.0));
        employees.add(new Employee("P007", "Employee G", 18000000.0));
        employees.add(new Employee("P008", "Employee H", 22000000.0));
        return employees;
    }

    public static void  printEmployee(List<Employee> employees) {
        for (Employee e : employees) {
            System.err.println("Id: " + e.getId() + "Name: " + e.getName() + "Salary: " +e.getSalary());
            
        }
    }

     public static Employee findById(String id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

     public static boolean addEmployee(Employee e) {
        if (findById(e.getId()) != null) {
            return false;
        }
        employees.add(e);
        return true;
    }

    public static boolean updateSalary(String id, double newSalary) {
        Employee e = findById(id);
        if (e == null) {
            return false;
        }
        e.setSalary(newSalary);
        return true;
    }

    public static void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
