
import java.util.*;
 
public class sentinel_search {
    public static int sentinelLinearSearch(int[] array, int key) {
        int last = array[array.length - 1];
        array[array.length - 1] = key;
        int i = 0;
        while (array[i] != key) {
            i++;
        }
        array[array.length - 1] = last;
        if (i < array.length - 1 || last == key) {
            return i;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of array");
        int a = sc.nextInt();
        int[] array = new int[a];
        System.out.println("Enter the element ");
        for(int i=0;i<a;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the key to search");
        int key = sc.nextInt();
        int index = sentinelLinearSearch(array, key);
        if (index == -1) {
            System.out.println(key + " is not found in the array: " + Arrays.toString(array));
        } else {
            System.out.println(key + " is found at index " + index + " in the array: " + Arrays.toString(array));
        }
    }
}