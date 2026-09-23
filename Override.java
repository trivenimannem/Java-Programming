class Animal {
 void eat()
{
 System.out.println("the animal is eating ");
}
class Dog extends Animal{
void  eat()
{
System.out.println("the dog is barking");
}
class Override{ 
 public static void main (String args[])
{ 
   Dog ob =new Dog();
  ob.eat();
  
}
}
}
}