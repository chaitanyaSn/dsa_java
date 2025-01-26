// Find the longest substring without repeating characters.

import java.util.HashSet;

public class LongestSubstring {

    public static int longSub(String s){
        HashSet<Character>map=new HashSet<>();
        int l=0;
        int r=0;
        int count=0;
        while(r<s.length()){
            if(map.contains(s.charAt(r))){
                map.remove(s.charAt(l));
                l++;
            }else{
                map.add(s.charAt(r));
                r++;
                count=Math.max(count,r-l);
            }
        }
        return count;

    }

    public static void main(String[] args) {

        String s="abcdeadcbacajhjf";
        System.out.println(longSub(s));
        
    }
    
}
