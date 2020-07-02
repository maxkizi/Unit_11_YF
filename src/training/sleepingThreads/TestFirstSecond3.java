package training.sleepingThreads;

public class TestFirstSecond3 {
    public static void main(String[] args) {
        First3 first3 = new First3("One");
        first3.start();

        Second3 second3 = new Second3("Two");
        second3.start();

        System.out.println("Test is finished");
    }
}
