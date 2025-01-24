package Array;
// Implement a function to find the largest and smallest numbers in an array.
public class MaxMin {

    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int arr[]={2,4,5,6,3,76,87,0,2345};
        for(int i:arr){
            if(i<min){
                min=i;
            }else{
                max=i;
            }
        }
        System.out.println(min + " " + max);
        
    }
}