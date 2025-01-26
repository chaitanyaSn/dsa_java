// Count the number of subarrays with a given sum.

package Array;

import java.util.HashMap;

public class CountSubarray {

    public static int sub2(int arr[],int sum){
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0, 1);
        int currSum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(mp.containsKey(currSum-sum)){
                count+=mp.get(currSum-sum);
            }
            mp.put(currSum,mp.getOrDefault(currSum, 0)+1);
        }
        return count;
    }

    public static int sub1(int arr[],int sum){
        int count=0;
        int l=0;
        int add=0;
        for(int j=0;j<arr.length;j++){
            add+=arr[j];
            while(add>sum && l<=j){
                add-=arr[l];
                l++;
            }
            if(add==sum){
                count++;
            }
                
            
        }


        return count;

    }
    public static void main(String[] args) {
        int arr[]={1, -1, 0, 2, -2, 3, 4, -4, 7};
        System.out.println(sub2(arr, 1));
        
    }
    
}
