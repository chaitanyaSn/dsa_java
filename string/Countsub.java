// Count the Number of Occurrences of a Substring
// Problem: Count how many times a specific substring appears in a string.
// Example:
// Input: "ababab", Substring: "ab"
// Output: 3

public class Countsub {
    public static int sub(String s,String su){
        int count=0;
        int l=0;
        int r=su.length();
        while(r<=s.length()){
            if(s.substring(l, r).equals(su)){
                count++;

            }
            l++;
            r++;
            
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(sub("abababab", "ab"));
        
    }
}
