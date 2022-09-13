package com.oops;

import java.util.HashSet;

public class Stringoperations {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		String A="AbcaZeoB";
        int n=A.length();
        char[] s=A.toCharArray();
        HashSet<Character> se = new HashSet<>();
        se.add('a'); se.add('e'); se.add('i'); se.add('o'); se.add('u');
        for(int i=0;i<n;i++){
            if(s[i]>='a'&& s[i]<='z'){
                if(se.contains(A.charAt(i))){
                    sb.append('#');
                }else {
                sb.append(s[i]);
                }
            }

}
        System.out.println(sb);
	}
}


