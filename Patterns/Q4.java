import java.util.Scanner;

public class Q4 {
  public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int num= scan.nextInt();
    int num0= num-1;
    scan.close();
    for( int i=0; i<=num; i++){
      for (int j=0; j<num; j++){
        if(j < num0){
          System.out.print(" ");
        }
        else{
          System.out.print("*");
        }
        num0= num0-1;
      }
      num0= num-1;
      System.out.println();
    }
  }
}
