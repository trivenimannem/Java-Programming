import java.util.Scanner;
class Square{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean found=false;
for(int i=1;i<=n;i++){
if(i*i==n){
found=true;
break;
}
}
if(found){
System.out.println("Its a perfect square");
}
else{
System.out.println("Its not a perfect square");
}
}
}

