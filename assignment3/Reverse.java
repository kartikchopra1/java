import java.util.*;

class Reverse{
  public static void main(String a[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int num = sc.nextInt();
      int p, sum=0, rem;
      while(num!=0){
        rem = num % 10;
        sum = rem + sum*10;
        num = num/10;
      }
      System.out.print("Reverse of the number: "+ sum);
  }
}
