class Exceptiondemo
{
	public static void main(String[] args) 
	{
int a=10;
int b=0;
try{
		System.out.println(a/b);
int c=-5;
int d[]={4,5,6,7};
System.out.println(d[-1]);
	}
catch(ArithmeticException e){
System.out.println("division by 0 not possible");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array index is out of bounds");
}
catch( Exception e){
System.out.println("some other exception caught");
}
finally{
System.out.println("Array index is out of bounds");
}
}
}
