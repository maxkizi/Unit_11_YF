package training.TestThreadWait;

public class ClassAA extends Thread{
    ClassAA (String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("AA " + i);
        }
    }
}
