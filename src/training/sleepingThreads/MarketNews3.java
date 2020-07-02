package training.sleepingThreads;

public class MarketNews3 extends Thread {
    MarketNews3(String s){
        super(s);
    }

    public void run (){
        try {
            for (int i = 0; i < 10; i++){
                sleep (1000);
                System.out.println("market news " + i);
            }
        }catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName() + getName() +e.toString());
        }
    }
}
