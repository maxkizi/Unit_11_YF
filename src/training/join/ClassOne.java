package training.join;

public class ClassOne extends Thread {
    ClassOne (String threadName){
        super (threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.print("one " + i + " ");
        }
        System.out.println();
    }
}
