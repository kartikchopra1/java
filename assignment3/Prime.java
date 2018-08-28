import java.util.*;

class Prime{
  public static void main(String a[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number: ");
      int num = sc.nextInt();
      int flag=0;
      for(int i=2; i<=num/2; i++){
        if(num % i==0){
          flag = 1;
          break;
        }
      }
      if(flag == 0){
        System.out.print("Number is prime");
      }
      else{
        System.out.print("Number is not prime");
      }
  }
}
