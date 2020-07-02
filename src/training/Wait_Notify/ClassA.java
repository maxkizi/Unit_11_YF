package training.Wait_Notify;

public class ClassA {
    String marketNews = null;

    void someMethod () throws InterruptedException {
        ClassB myB = new ClassB(this);
        myB.start();
        synchronized (this){
            wait(5000);
        }
        System.out.println("Пришел notify");
    }
    public void setData (String news){
        marketNews = news;
    }
    public void getData(){
        System.out.println(marketNews);
    }

}
