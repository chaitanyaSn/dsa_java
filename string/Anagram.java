// Write a program to check if two strings are anagrams.

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer>mp=new HashMap<>();
      
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            mp.put(c,mp.getOrDefault(c, 0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            if(!mp.containsKey(c) || mp.get(c)==0){
                return false;
            }
            mp.put(c,mp.get(c)-1);
        }
        return true;


    }
    public static void main(String[] args) {
        System.out.println(isAnagram("null", "llun"));
        
    }
    
}
