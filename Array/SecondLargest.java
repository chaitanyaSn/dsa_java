package Array;
// Find the second largest element in an array.

import java.util.Arrays;

public class SecondLargest {
    public static int find(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-2];
        
    }

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1; // Invalid input
        }
        
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[]={2,3,425,13,35,135,54,5423};
        System.out.println(find(arr));
        
    }
    
}
