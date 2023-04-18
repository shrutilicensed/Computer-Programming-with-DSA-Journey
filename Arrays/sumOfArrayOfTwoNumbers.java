package Arrays;
import java.util.*;

public class sumOfArrayOfTwoNumbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Initialising first array
    System.out.println("Enter size of first array: ");
    int num1Size= scan.nextInt();
    int[] arr1 = new int[num1Size];
    System.out.println("Enter elements of first array: ");
    for(int i=0; i<num1Size; i++){
      arr1[i]= scan.nextInt();
    }

    // initialising second array
    System.out.println("Enter size of second array: ");
    int num2Size= scan.nextInt();
    int[] arr2 = new int[num2Size];
    System.out.println("Enter elements of second array: ");
    for(int i=0; i<num2Size; i++){
      arr2[i]= scan.nextInt();
    }
    int[] SumArr;
    // finding size of sumArray
    if(num1Size>num2Size){
      SumArr= new int[num1Size+1];
    }
    else{
      SumArr= new int[num2Size+1];
    }
    int carry = 0;
    int point = (SumArr.length)-1;
    int i= num1Size;
    int j= num2Size;
    while(point >0){

    }
  }
}
