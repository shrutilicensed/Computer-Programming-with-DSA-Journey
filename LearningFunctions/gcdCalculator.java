package LearningFunctions;
import java.util.*;

public class gcdCalculator {
  
  public static void gcdFinder(int num1, int num2){
    ArrayList<Integer> listNum1 = new ArrayList<Integer>();
    ArrayList<Integer> listNum2 = new ArrayList<Integer>();

    for(int i=1; i<=num1; i++){
      if(num1%i==0){
        listNum1.add(i);
      }
    }
    for(int i=1; i<=num2; i++){
      if(num1%i==0){
        listNum2.add(i);
      }
    }

    for(int i=0;i<=listNum1.size(); i++){
      
    }

  }
  public static void main(String[] args) {
    // Scanner scan= new Scanner(System.in);
    // int num1= scan.nextInt();
    // int num2= scan.nextInt(); 
    int num1=12;
    int num2=10;
    gcdFinder(num1, num2);
  }
}
