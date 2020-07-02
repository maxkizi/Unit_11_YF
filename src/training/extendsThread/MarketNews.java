package training.extendsThread;

public class MarketNews extends Thread {
    MarketNews(String threadName){
        super(threadName);
    }

    public void run(){
        System.out.println("The stock market is improving");
    }
}
