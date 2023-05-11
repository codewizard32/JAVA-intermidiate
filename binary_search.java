
import java.util.*;

public class binary_search {

    public static void search(int numbers[],int key){
        int low = 0;
        int high = numbers.length;
        while(low<=high){
            int mid = (high+low)/2;
            if(key==numbers[mid]){
                System.out.println("Element found at index");
            break;
            }

            else if(key<numbers[mid]){
                high = mid-1;
            }
            else if(key>numbers[mid]){
                low = mid+1;
            }
            
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the length of array");
        int a = sc.nextInt();
        int numbers[]= new int[a];
        System.out.println("enter the elements of list");
        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
        System.out.println("Enter the key to search");
        int key =sc.nextInt();
        search(numbers,key);
    }
    
}
