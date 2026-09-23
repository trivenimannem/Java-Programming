import java .util.Scanner;
class Insufficient extends Exception 
{
public Insufficient(String message)
{
 super(message);
}
}
public class Userdefined {
public static void main(String args[])
{ Scanner  sc = new Scanner(System.in);
System.out.println("ENTER BALANCE");
int balance = sc.nextInt();
System.out.println("ENTER DEBIT AMOUNT");
int debitamount = sc.nextInt();
try{
if(debitamount>balance)
{
throw new Insufficient("amount>bal");
}
else{
balance -=debitamount;
System.out.println("successful balance:" +balance);
}
}
catch(Insufficient e)
{ System.out.println("caught :" + e.getMessage());
}
}
}