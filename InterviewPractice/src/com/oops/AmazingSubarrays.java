package com.oops;

import java.util.HashSet;

/*You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
Example

Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.*/
public class AmazingSubarrays {

	public static void main(String[] args) {
		String A="ABEC";
		long count=0;
        HashSet<Character> se = new HashSet<>();
        se.add('a'); se.add('e'); se.add('i'); se.add('o'); se.add('u');
        se.add('A'); se.add('E'); se.add('I'); se.add('O'); se.add('U');

        for(int i=0;i<A.length();i++){           
              
             if(se.contains(A.charAt(i))){
                 count+=(A.length()-i);
             }
            }
            
        //this will conver into long into intechar
        System.out.print(count%10003);
	}

}
