interface Motor {
    int capacity=5;
    void run();
    void consume();
}
class Washingmachine implements Motor {
    public void run() {
        System.out.println("Motor is running");
    }
    public void consume() {
        System.out.println("Motor consumes power");
    }
}
public class Test {
    public static void main(String[] args) {
        Motor m = new Washingmachine();
        System.out.println("Capacity of motor is: "+m.capacity);
        m.run();
        m.consume();
    }
}
