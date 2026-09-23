class MyThread extends Thread {
MyThread(String name){
super(name);
}
    @Override
    public void run() {
        System.out.println("Thread is running via extending Thread class "+this.getName());
	Thread.yield();
	System.out.println("Thread finished running ");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("bob");
 	MyThread t2 = new MyThread("may");
	MyThread t3 = new MyThread("june");
        t1.start(); 
   System.out.println("Thread 1: " + t1.getName());
	try {t1.sleep(200, 10);}
	catch(InterruptedException e){
	System.out.println("Exception caught");
}
	try {t1.join(200, 10);}
	catch(InterruptedException e){
	System.out.println("Exception caught");
}
        t2.start(); 
        t3.start(); 
    }
}
