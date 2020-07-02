package training.interfaceRunnable;

import training.extendsThread.MarketNews;

public class TestThreads2 {
    public static void main(String[] args) {
        MarketNews2 mn2 = new MarketNews2();
        Thread th1 = new Thread(mn2, "Market News");
        th1.start();

        Portfolio2 p2 = new Portfolio2();
        Thread th2 = new Thread(p2, "Portfolio");
        th2.start();

        System.out.println("TestThreads2 is finished");


    }
}
