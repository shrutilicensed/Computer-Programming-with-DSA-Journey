package Recursionprograms;
import java.util.Scanner;
public class factorialrecursion {

  public int fact(int n){
    if(n==0){
      return 1;
    }
    else{
      int factorialresult= fact(n-1);
      int result = n*factorialresult;
      return result;
    }
  }

  public static void main(String args[]){
    factorialrecursion fr= new factorialrecursion();
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    scan.close();
    int answer= fr.fact(num);
    System.out.println(answer);
  }
}
