
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();
        counter.decrement();
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.decrement();
        counter.printValue();

        DecreasingCounter counter2 = new DecreasingCounter(5);
        counter2.printValue();
        counter2.reset();
        counter2.printValue();
    }
}
