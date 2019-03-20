package com.strings;

import java.util.Arrays;

public class CrackCodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isUniqueChars("solution"));
		//System.out.println(checkPermutation("abab", "baba"));
		//replaceSpace("Mr John Smith    ".toCharArray(), 13);
		//System.out.println(isPermutationPalindrom("tact coa"));
		//System.out.println(oneEditAway("pal", "pale"));
		//System.out.println(Character.getNumericValue('z') + " | " + Character.getNumericValue('a'));
		
	}
	public static boolean oneEditInsert(String first, String second) {
		int index1=0, index2=0;
		/*while(index1<first.length() && index2<second.length()) {
			if(first.charAt(index1) != second.charAt(index2)) {
				if(index1!=index2)
					return false;
				index1++;
			}
			else {
				index1++;
				index2++;
			}
		}*/
		
		for(int i=0,j=0;i<first.length() && j<second.length();i++,j++) {
			if(first.charAt(i)!=second.charAt(j))
				return first.substring(i+1).equals(second.substring(j)); // here i+1 as first string will be always bigger
		}
		
		return true;
	}
	public static boolean oneEditReplace(String first, String second) {
		boolean oneDifference = false;
		for(int i=0;i<first.length();i++) {
			if(first.charAt(i) != second.charAt(i)) {
				if(oneDifference) {
					return false;
				}
				oneDifference = true;
			}
		}
		return true;
	}
	public static boolean oneEditAway(String first, String second) {
		if(first.length()==second.length())
			return oneEditReplace(first, second);
		if(first.length()>second.length())
			return oneEditInsert(first, second);
		if(first.length()<second.length())
			return oneEditInsert(second, first);
		return false;
	}
	
	public static int getCharNumber(char c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(a<=val && val<=z) {
			return val-a;
		}
		return -1; // When the character is not a-z
	}
	
	// To check a string has one of its permutation palindrom , then string can't have more than one character with odd number of times
	public static boolean isPermutationPalindrom(String str) {
		int countOdd = 0;
		int[] letters = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(int i=0;i<str.length();i++) {
			int x = getCharNumber(str.charAt(i));
			if(x != -1) {
				letters[x]++;
				if(letters[x]%2==1) {
					countOdd++;
				}
				else {
					countOdd--;
				}
			}
		}
		return countOdd<=1;
	}
	
	public static void replaceSpace(char[] str, int trueLength) {
		int spaces = 0;
		int index=0;
		for(int i=0;i<trueLength;i++) {
			if(str[i]==' ')
				spaces++;
		}
		index = trueLength + spaces*2;
		if(trueLength < str.length) str[trueLength] = '\0';
		for(int i = trueLength-1;i>=0;i--) {
			if(str[i]==' ') {
				str[index-1] = '0';
				str[index-2] = '2';
				str[index-3] = '%';
				index -= 3;
			}
			else {
				str[index-1] = str[i];
				index--;
			}
		}
		System.out.println(Arrays.toString(str));
	}
	
	public static boolean checkPermutation(String s, String t) {
		if(s.length() != t.length())
			return false;
		int[] letters = new int[128];
		for(int i=0;i<s.length();i++) {
			letters[s.charAt(i)]++;
		}
		for(int i=0;i<t.length();i++) {
			letters[t.charAt(i)]--;
			if(letters[t.charAt(i)] < 0)
				return false;
		}
		return true;
	}
	public static boolean isUniqueChars(String str) {
		/*if(str.length()>128)
			return false;
		boolean[] strArr = new boolean[128];
		for(int i=0;i<str.length();i++) {
			if(strArr[str.charAt(i)]) {
				return false;
			}
			strArr[str.charAt(i)] = true;
		}
		return true;*/
		int checker = 0;
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

}
