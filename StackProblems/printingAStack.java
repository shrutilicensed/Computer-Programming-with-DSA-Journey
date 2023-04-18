package StackProblems;
import java.util.*;

public class printingAStack {
  public static void main(String[] args) {
    Stack<Integer> newStack= new Stack<Integer>();
    for(int i=0; i<=5; i++){
      newStack.push(i);
    }
    System.out.println(newStack);
    System.out.println("After pop operation: ");
    newStack.pop();
    System.out.println(newStack);
  }
}

