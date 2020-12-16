package com.lonely.test;

import java.util.HashMap;

/*
290.单词规律
 */
public class TestWordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        int len = pattern.length();
        int sLen = strs.length;
        if(len != sLen)
            return false;
        HashMap<Character, String> map = new HashMap();
        for(int i = 0; i < len; i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(strs[i])){
                    return false;
                }
            }else{
                if(map.containsValue(strs[i]))
                    return false;
                map.put(pattern.charAt(i), strs[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TestWordPattern test = new TestWordPattern();
        System.out.println(test.wordPattern("abba", "dog cat cat dog"));
        System.out.println(test.wordPattern("abba", "dog cat cat fish"));
        System.out.println(test.wordPattern("aaaa", "dog cat cat dog"));
    }
}
