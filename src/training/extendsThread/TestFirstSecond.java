package training.extendsThread;

import training.extendsThread.First;
import training.extendsThread.Second;

public class TestFirstSecond {
    public static void main(String[] args) {
        First first = new First("One");
        first.start();

        Second second = new Second("Two");
        second.start();

        System.out.println("main is finished");
    }
}
