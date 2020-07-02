package training.sleepingThreads;

import training.extendsThread.Portfolio;

public class TestThreads3 {
    public static void main(String[] args) {
        MarketNews3  mn = new MarketNews3("Market News");
        mn.start();

        Portfolio3 p = new Portfolio3("Portfolio");
        p.start();

        Object locker = new Object();

        synchronized (locker){
            try {
                System.out.println("waiting");
                locker.wait(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The main method is finished");
    }
}
