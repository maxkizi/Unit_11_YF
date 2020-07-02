package training.TestThreadWait;

public class TestAABB {
    public static void main(String[] args) {
        ClassBB bb = new ClassBB("BBThread");
        bb.start();

        ClassAA aa = new ClassAA("AAThread");
        aa.start();

        Object locker = new Object();

        synchronized (locker){
            try{
                System.out.println("Waiting");
                locker.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main is finished");
    }
}
