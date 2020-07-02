package training.interfaceRunnable;

public class TestFirstSecond2 {
    public static void main(String[] args) {
        First2 first = new First2();
        Thread thread1 = new Thread(first, "One");
        thread1.start();

        Second2 second = new Second2();
        Thread thread2 = new Thread(second,"Two");
        thread2.start();
        System.out.println("Test is finished");
    }
}
