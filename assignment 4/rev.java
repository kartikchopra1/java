import java.util.*;
class abc
{
public static void main(String args[])
{
int a, rev=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number you want to reverse");
int n=sc.nextInt();
while(n>=0)
{

a=n%10;
rev=rev*10+a;
n=n/10;
}
System.out.print("The reverse is: " + rev);
}
}