import java.util.*;

public class insertion_sort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
 
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        System.out.println("The sorted array is: ");
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the elements");
        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        insertion_sort ob = new insertion_sort();
        ob.sort(arr);
 
        printArray(arr);
    }
};
