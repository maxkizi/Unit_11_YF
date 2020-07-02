package training.join;

public class TestOneTwo {
    public static void main(String[] args) {
        ClassOne one = new ClassOne("First thread");
        one.start();

        ClassTwo two = new ClassTwo("Second thread");
        two.start();

        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Метод main  окончен");
    }

}
