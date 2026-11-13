package QLNV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Service.inPut());   
        int choice;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\n===== QUAN LY NHAN VIEN =====");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Hien thi danh sach nhan vien");
            System.out.println("3. Tim nhan vien theo ma");
            System.out.println("4. Cap nhat luong theo ma");
            System.out.println("0. Thoat");
            System.out.print(">> Chon chuc nang: ");
            choice = in.nextInt();in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma nhan vien: ");
                    String iD = in.nextLine();
                    System.out.print("Nhap ten nhan vien: ");
                    String name = in.nextLine();
                    System.out.print("Nhap luong: ");
                    Double salary = in.nextDouble();in.nextLine();
                    if(Service.addEmployee(new Employee(iD, name, salary))){
                        System.out.println("Them nhan vien thanh cong");
                    }else {
                        System.out.println("Nhan vien da ton tai !");
                    }
                    break;
                case 2:
                    Service.displayAll();
                    break;
                case 3:
                    System.out.print("Nhap ma nhan vien: ");
                    String id = in.nextLine();
                    if(Service.findById(id) != null ){
                        System.out.println(Service.findById(id));
                    }else{
                        System.out.println("Nhan vien khong ton tai !");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma nhan vien: ");
                    String ID = in.nextLine();
                    if(Service.findById(ID) == null ){
                        System.out.println("Nhan vien khong ton tai !");
                    }else{
                        System.out.print("Nhap luong moi: ");
                        Double Salary = in.nextDouble();
                        Service.updateSalary(ID, Salary);
                        System.out.println("Cap nhat thanh cong !");
                    }
                    break;
                case 0:
                    System.out.println("Tam biet !");
                    break;
                default:
                    System.out.println("Chon tu 0 - 4 !");
                    break; 
            }
        }while (choice != 0);
           
    }        

}
