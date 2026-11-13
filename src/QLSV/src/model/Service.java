package QLSV.src.model;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static List<Student> inPut() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "S001", StudentType.REGULAR));
        students.add(new Student("Bob", "S002", StudentType.PART_TIME));
        students.add(new Student("Charlie", "S003", StudentType.INTERNATIONAL));
        students.add(new Student("David", "S004", StudentType.REGULAR));
        students.add(new Student("Eve", "S005", StudentType.PART_TIME));
        
        return students;
    }
    public static void printStudentInfo(List<Student> students) {
        for (Student s : students) {
            System.out.println("Student Name: " + s.getName() + ", ID: " + s.getId() + ", Type: " + s.getType());
        }
    }
    public static void printStudentsByType(List<Student> students) {
        System.out.println("=== Danh sach sinh vien theo loai ===");
        for (StudentType s : StudentType.values()) {
            System.out.println("=== " + s + " ===");
            boolean found = false;
            for (Student student : students) {
                if (student.getType() == s) {
                    System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("(Không có sinh viên)");
            }
            System.out.println();
        }
    }

    public static void countStudentsByType(List<Student> students) {
        System.out.println("=== Thong ke so luong sinh vien theo loai ===");
        for (StudentType s : StudentType.values()) {
            int count = 0;
            for (Student student : students) {
                if (student.getType() == s) {
                    count++;
                }
            }
            System.out.println(s + ": " + count);
        }
    }
}



    