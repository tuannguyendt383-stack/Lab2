package QLSV.src.model;

public class Main {
    public static void main(String[] args) {
        Service.inPut();
        Service.printStudentInfo(Service.inPut());
        Service.printStudentsByType(Service.inPut());
        Service.countStudentsByType(Service.inPut());
    }
   
}
