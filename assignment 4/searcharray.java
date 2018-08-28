import java.util.*;
class abc
{
public static void main(String avg[])
{
int i,k=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements of an array");
int n=sc.nextInt();
int[]a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter the Digit to Search");
int search=sc.nextInt();
for(i=0;i<a.length;i++)
{
if(search==a[i] || i<a.length)
{
if(search==a[i])
{
for(i=0;i<a.length;i++)
if(search==a[i])
{
k++;
}
System.out.println("Match Found");
break;
}
}
if(search != a[i] && i == n-1)
{
System.out.println("Not Found");
break;
}
}
System.out.println(k+" Times Repeated");
}
}

