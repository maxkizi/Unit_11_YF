package training.extendsThread;

public class TestThreads {
    public static void main(String[] args) {
        MarketNews mn = new MarketNews("Market News");
        mn.start();

        Portfolio p = new Portfolio("Portfolio");
        p.start();
        System.out.println("test is finished");
    }
}
