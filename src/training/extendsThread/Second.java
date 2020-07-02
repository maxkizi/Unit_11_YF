package training.extendsThread;

public class Second extends Thread {
    Second (String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("Второй");
    }
}
