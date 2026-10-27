class Counter{
   private int count=0;

   Synchronised void increment(){

          count++;
   }

  int getCount()
{
      return count;
}


}
class MyThread extends Thread
{
      Counter c;
     MyThread(Counter c)
{
      this.c=c;
}
public void run(){
     
  for(int i=0;i<5;i++)
{
    c.increment();
}
}

}
public class TSDemo{
      public static void main(String[] args) throws InterruptedException
{
      Counter c=new Counter();
      MyThread t1=new MyThread(c);
      MyThread t2=new MyThread(c);
      t1.start();
      t2.start();
      t1.join();
      t2.join();
  System.out.println("Count="+c.getCount());
  

 
}


}