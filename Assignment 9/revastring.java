import java.util.Scanner;
class ques1
{
public static void main(String[] args)
{
String x,r="";
Scanner s=new Scanner(System.in);
System.out.println("Enter string");
x=s.nextLine();
int l=x.length();
for(int i=l-1;i>0;i--)
{
r=r+x.charAt(i);
}
System.out.println("Reverse "+r);
}
}