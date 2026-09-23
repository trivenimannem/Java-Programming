class A
{
A(int x)
{ System.out.println("parent class:" +x);
}
}
class B extends A
{ 
B(int x,int y){
super(x);
System.out.println("the value  y is :" +y);
}
}
public class Super
{
 Public static void main(string[] args)
     B ob=new B(10,20);
}
