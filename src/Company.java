import java.util.Scanner;
interface Salary {
    void earnings();
    void deductions();
    void bonus();
}
class Manager implements Salary {
    double b_sal,earn,deduct;
    Scanner sc = new Scanner(System.in);
    void enter() {
        System.out.println("Enter basic salary: ");
        b_sal = sc.nextDouble();
    }
    public void earnings() {
    earn = (1.95)*b_sal;
    System.out.println("Earnings: "+earn);
    }
    public void deductions() {
        deduct = (0.12)*b_sal;
        System.out.println("Deduction: "+deduct);
    }
    public void bonus() {}
}
class Substaff extends Manager {
    double bonus;

    public void bonus() {
        bonus = (0.50) * b_sal;
        System.out.println("Bonus: " + bonus);
    }
}

public class Company {
    public static void main(String[] args) {
      Manager m = new Substaff();
      m.enter();
      m.earnings();
      m.deductions();
      m.bonus();
    }
}

