import java.util.*;
class abc
{
public static void main(String args[])
{
int c=0,temp,a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number");
int n=sc.nextInt();
temp=n;  
while(n>0)  
{  
a=n%10;  
n=n/10;  
c=c+(a*a*a);  
}  
if(temp==c)  
System.out.println("armstrong number");   
else  
System.out.println("Not an armstrong number");   
}
}