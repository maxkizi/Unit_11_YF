package training.sleepingThreads;

public class Second3  extends Thread{
    public Second3(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        try {

            for (int i = 0; i < 10; i++) {
                sleep(500);
                System.out.println("Второй" + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
