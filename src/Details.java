import java.util.Scanner;
interface Employee {
    void getdetails();
}
interface dept extends Employee {
    void getdeptdetails();
}
class Head implements dept {
    int emp_id,dept_id;
    String emp_name,dept_name;
    Scanner sc = new Scanner(System.in);
    public void getdetails() {
        System.out.println("Enter employee id: ");
        emp_id = sc.nextInt();
        System.out.println("Enter employee name: ");
        sc.nextLine();
        emp_name = sc.nextLine();
    }
    public void getdeptdetails() {
        System.out.println("Enter department id: ");
        dept_id = sc.nextInt();
        System.out.println("Enter department name: ");
        sc.nextLine();
        dept_name = sc.nextLine();
    }
    void display() {
        System.out.println("Employee id: "+emp_id);
        System.out.println("Employee name: "+emp_name);
        System.out.println("Department id: "+dept_id);
        System.out.println("Department name: "+dept_name);
    }
}

public class Details {
    public static void main(String[] args) {
        Head m = new Head();
        m.getdetails();
        m.getdeptdetails();
        m.display();
    }
}
