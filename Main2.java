class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running via implementing Runnable.");
    }
}
public class Main2 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
