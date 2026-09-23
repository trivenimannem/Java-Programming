class Parent {
void display()
{ System.out.println("displaying parent class");
}
}
class Child extends parent
void display()
{ 
super.display();
System.out.println("displaying child classs ");
}
}
public class Overide
{
public static void main (String args[])
{ Child ob=new Child()
  Child.display();
}
}