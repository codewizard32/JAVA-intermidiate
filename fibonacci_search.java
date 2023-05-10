
import java.util.*;
 
class Main {
  public static int fibonacciSearch(int[] arr, int x) {
    int n = arr.length;
    if (n == 0) {
      return -1;
    }
 
    // Initialize Fibonacci numbers
    int fib1 = 0, fib2 = 1, fib3 = fib1 + fib2;
 
    // Find the smallest Fibonacci number greater than or equal to n
    while (fib3 < n) {
      fib1 = fib2;
      fib2 = fib3;
      fib3 = fib1 + fib2;
    }
 
    // Initialize variables for the current and previous split points
    int offset = -1;
    while (fib3 > 1) {
      int i = Math.min(offset + fib2, n-1);
 
      // If x is greater than the value at index i, move the split point to the right
      if (arr[i] < x) {
        fib3 = fib2;
        fib2 = fib1;
        fib1 = fib3 - fib2;
        offset = i;
      }
 
      // If x is less than the value at index i, move the split point to the left
      else if (arr[i] > x) {
        fib3 = fib1;
        fib2 = fib2 - fib1;
        fib1 = fib3 - fib2;
      }
 
      // If x is equal to the value at index i, return the index
      else {
        return i;
      }
    }
 
    // If x is not found in the array, return -1
    if (fib2 == 1 && arr[offset+1] == x) {
      return offset + 1;
    } else {
      return -1;
    }
  }
 
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements to be searched ");
    for (int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("Enter the key to be searched");
    int x = sc.nextInt();
    int ind = fibonacciSearch(arr, x);
    if (ind >= 0) {
      System.out.println("Found at index: " + ind);
    } else {
      System.out.println(x + " isn't present in the array");
    }
  }
}