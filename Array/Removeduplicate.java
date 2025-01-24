package Array;
// Write a program to remove duplicates from a sorted array.
public class Removeduplicate {

    public static int removeduplicate(int nums[]){
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int uniq=0;
        for(int i=1;i<n;i++){
            if(nums[uniq]!=nums[i]){
                uniq++;
                nums[uniq]=nums[i];

            }
        }
        return uniq+1;


    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3,4,4,4,5,5,5,5,5,5,7,7};
        System.out.println(removeduplicate(arr));

        
    }
    
}
