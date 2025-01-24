package Array;
// Rotate an array by k positions.
public class RotateElement {

    public static void ratate(int arr[],int l,int r){
       
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void reverse(int arr[],int k){
        int n=arr.length;
        k=k%n;
        ratate(arr, 0, n-1);
        ratate(arr, 0, k-1);
        ratate(arr, k, n-1);
    }
  

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        for(int i:arr){
            System.out.print(i+ " ");
        }
         reverse(arr, 3);
         System.out.println(arr);
         for(int i:arr){
            System.out.print(i+ " ");
        }
         
        
    }
    
}
