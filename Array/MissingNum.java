package Array;
// Find the missing number in an array of size n containing numbers from 1 to n+1.
public class MissingNum {

    public static int missing(int arr[]){
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        int add=0;
        for(int i:arr){
            add+=i;

        }
        return sum-add;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8,9};
        System.out.println(missing(arr));
        
    }
    
}
