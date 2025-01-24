// Write a program to check if a string is a palindrome.
public class Palindrome {

    public static Boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;

            }
            l++;
            r--;

        }
        return true;
    }
    public static void main(String[] args) {
         System.out.println(isPalindrome("puppppup"));
         System.out.println(isPalindrome("hello"));
        
    }
}
