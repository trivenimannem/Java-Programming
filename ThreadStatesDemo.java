class MyThread extends Thread{

    public void run() {

    try{
    
 System.out.println("Thread is running....");
 
     Thread.sleep(2000);
 System.out.println("Thread completed Exection");
}

catch(InterruptedException e){
      System.out.println(e);
}
}
} 
  public class ThreadStatesDemo{
   public static void main(String[] args)throws InterruptedException{
      
         MyThread t=new MyThread();
     System.out.println("After creating Thrread:"+t.getState());
     t.start();
    System.out.println("After calling start():"+t.getState());

       Thread.sleep(500);
    System.out.println("While thread is sleeping:"+t.getState());

        t.join();

    System.out.println("After thread completion:"+t.getState());
}
}