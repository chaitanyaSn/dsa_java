// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1]
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

package BinarySearch;

import java.util.Arrays;

class UppLow {

    static int first(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        int first=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                first=mid;
                r=mid-1;

            }else if(arr[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;

            }
        }
        return first;
    }

    static int last(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        int last=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                last=mid;
                l=mid+1;

            }else if(arr[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;

            }
        }
        return last;
    }
    static int[] find(int arr[],int target){
        int f=first(arr, target);
        int l=last(arr, target);
        return new int[]{f,l};

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,4,4,5,6,7};
        System.out.println(Arrays.toString(find(arr, 4)));
        
        
        

        
    }

    
}