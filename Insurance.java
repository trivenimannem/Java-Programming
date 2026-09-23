import java.util.Scanner;
class  Insurance
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age of the person:");
int age=sc.nextInt();
System.out.println("choose the health condition of the person:");
System.out.println("1. diabetes   2. bp   3.Arthiritis");
int health=sc.nextInt();
switch(health){
case 1:
if(age<18){
System.out.println("Insurance premiun=1000");
	}
else{
System.out.println("Insurance premiun=1500");
}
break;
case 2:
if(age<18){
System.out.println("Insurance premiun=2000");
	}
else{
System.out.println("Insurance premiun=2500");
}
break;
case 3:
if(age<18){
System.out.println("Insurance premiun=3000");
	}
else{
System.out.println("Insurance premiun=3500");
}
break;
default :
System.out.println("Enter proper value");
}
}
}
