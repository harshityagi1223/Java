package DSA;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import java.util.Queue;
import java.util.Stack;


public class Solution {
	public static List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();
        Map<Character, Integer> freqS = new HashMap<>();
        Map<Character, Integer> freqP = new HashMap<>();
        for(int i =0;i<n;i++){
            freqP.put(p.charAt(i),freqP.getOrDefault(p.charAt(i),0)+1);
        }
        for(int i =0;i<n;i++){
            freqS.put(s.charAt(i),freqS.getOrDefault(s.charAt(i),0)+1);
        }
        List<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<m){
        	System.out.print(freqP+" "+freqS+" "+i+" "+j+" "+res);
        
            if(freqP.equals(freqS)){
            	res.add(j);
            }
            freqS.put(s.charAt(j),freqS.getOrDefault(s.charAt(j),0)-1);
            if(freqS.get(s.charAt(j))==0) { freqS.remove(s.charAt(j));}
            j++;
            i= j+(n-1);
            
            if(i<m){
            	System.out.print(freqP+" "+freqS);
            	System.out.println(res);
                freqS.put(s.charAt(i),freqS.getOrDefault(s.charAt(i),0)+1);
            }
        }
        return res;
    }
	public static void main(String[] args) throws IOException {
        String s1 = "aaaaaaaaaa", p = "aaaaaaaaaaaaa";
        System.out.println(Solution.findAnagrams(s1, p));
    }
}