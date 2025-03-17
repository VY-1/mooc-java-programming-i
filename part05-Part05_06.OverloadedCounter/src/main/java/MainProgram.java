
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter counter = new Counter();
        Counter counter2 = new Counter(5);

        counter.increase();
        counter.increase(10);

        System.out.println(counter.value());

        System.out.println(counter2.value());
        counter2.decrease(2);
        System.out.println(counter2.value());
    }
}
