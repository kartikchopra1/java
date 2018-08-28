import java.util.*;

class Pallindrome{
  public static void main(String a[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int num = sc.nextInt();
      int p, sum=0, rem;
      p = num;
      while(num!=0){
        rem = num % 10;
        sum = rem+sum*10;
        num = num/10;
      }
      if(p == sum){
        System.out.println("Pallindome number");
      }
      else{
        System.out.println("Not a Pallindome number");
      }
  }
}
