package training.join;

public class ClassTwo extends Thread{
    ClassTwo (String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.print("two " + i + " ");
        }
        System.out.println();
    }
}
