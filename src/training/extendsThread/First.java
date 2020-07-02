package training.extendsThread;

public class First extends Thread {
    First (String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("Первый");
    }
}


