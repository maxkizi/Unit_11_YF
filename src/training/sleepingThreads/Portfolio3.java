package training.sleepingThreads;

public class Portfolio3  extends Thread{
    Portfolio3 (String s){
        super(s);
    }

    public void run (){
        try {
            for (int i = 0; i < 10; i++){
                sleep(700);
                System.out.println("portfolio" + i);
            }
        }catch (InterruptedException e1){
            System.out.println(Thread.currentThread().getName()+ e1.toString());
        }
    }
}
