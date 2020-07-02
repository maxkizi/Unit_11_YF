package training.sleepingThreads;

public class First3 extends Thread {
    First3 (String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        try {
           for (int i = 0; i < 10; i++){
               sleep(1000);
               System.out.println("First" + i);
           }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
