package training.Wait_Notify;

public class ClassB extends Thread {
    ClassA parent;
    ClassB(ClassA parent){
        this.parent = parent;
    }

    @Override
    public void run() {
        parent.setData("Economy is recovering");
        parent.getData();
        synchronized (parent){
            parent.notify();
        }
    }
}
