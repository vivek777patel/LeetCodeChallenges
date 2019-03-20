package com.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Pattern;

import jdk.nashorn.internal.runtime.FindProperty;

public class MyStringProblems {

	/*
	 * class Adder extends Arithmetic{ int add(int a, int b){ return a+b; } }
	 */

	public static void main(String[] args) {

		
		 /* List<String> l = stringSubsequences("aabc"); for (String s : l) {
		  System.out.println(s); }
		 */

		// String X = "XMJYAUZ", Y = "MZJAWXU";
		/*
		 * String X = "ABCBDAB", Y = "BDCABA"; //
		 * System.out.print("The length of LCS is " + LCSubsequenceLength(X, Y));
		 * 
		 * int[][] T = new int[X.length() + 1][Y.length() + 1]; Set<String> lcs =
		 * findLCS(X, Y, T);
		 * 
		 * // print set elements System.out.print(lcs);
		 */
		// findAllSubstring("abbc");

		/*
		 * String X = "ABAB", Y = "BABA";
		 * System.out.println(LCSubString(X,Y,X.length(),Y.length()));
		 */
		/*
		 * int[] A = { 3, 5, 8, 4, 5, 9, 10, 8, 5, 3, 4 };
		 * System.out.println(findBitonicSubarray(A, A.length-1));
		 */

		/*
		 * for(List<Integer> i : threeSum(new int[]{-1, 0, 1, 2, -1, -4})) { for(Integer
		 * j: i) { System.out.print(j+" "); } System.out.println(); }
		 * 
		 * MyStringProblems m = new MyStringProblems(); m.threeSum(new int[] {});
		 */
		/*
		 * int x=2437,y=875; while(x!=y) { if(x>y) x=x-y; else if(x<y) y=y-x; }
		 * System.out.println(y);
		 */
		// System.out.println(divide(4,0));

		/*
		 * Scanner scan = new Scanner(System.in); while(scan.hasNextLine()){ String
		 * values[] = scan.nextLine().split(" "); power(Integer.parseInt(values[0]),
		 * Integer.parseInt(values[1])); }
		 */
		// System.out.println(LongestWord("fun&!! TIME"));
		// System.out.println(isAnagram("geeksforgeeks","forgeeksgeekx"));
		// System.out.println(removeDirtyChars("geeksforgeeks","mask"));
		// System.out.println(reverseRecursion("geeksforgeeks"));
		/*
		 * ArrayList<String> permList = new ArrayList<>();
		 * permutation(permList,"","1234"); for(String s: permList) {
		 * System.out.println(s); }
		 */

		//System.out.println(lengthOfLongestSubstring("abcabcabxc"));
		// System.out.println(longestSubstring("abcabcabxc"));
		// countCombination(5);
		  System.out.println(Arrays.toString(permutationString("abc").toArray()));
	}
	
	public static List<String> permutationString(String str){
		List<String> permutation = new ArrayList<>();
		permutationString("", str, permutation);
		return permutation;
	}
	
	public static void permutationString(String prefix, String remaining, List<String> list) {
		if(remaining.isEmpty()) {
			list.add(prefix);
			return;
		}
		for(int i=0;i<remaining.length();i++) {
			permutationString(prefix+remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i+1), list);
		}
	}
	
	// My Twilio Interview Problem
	public static void countCombination(int num) {
		HashMap<String, Integer[]> keyPathMap = new HashMap<>();
		keyPathMap.put("2", new Integer[] { 7, 9 });
		keyPathMap.put("3", new Integer[] { 4, 8 });
		keyPathMap.put("4", new Integer[] { 3, 9 });
		keyPathMap.put("6", new Integer[] { 7 });
		keyPathMap.put("7", new Integer[] { 2, 6 });
		keyPathMap.put("8", new Integer[] { 3 });
		keyPathMap.put("9", new Integer[] { 2, 4 });
		List<String> list = new ArrayList<>();
		createLiteral("2", num, keyPathMap, "2", list);
		for(String s: list) {
			System.out.println(s);
		}
	}

	public static void createLiteral(String val, int num, HashMap<String, Integer[]> keyPath, String literal, List<String> list) {
		if (literal.length() == num) {
			list.add(literal);
			return;
		}
		Integer[] arr = keyPath.get(val);
		for (int i = 0; i < arr.length; i++) {
			createLiteral(arr[i]+"", num, keyPath, literal + arr[i], list);
			literal = literal.substring(0, literal.length());
		}
	}
	
	public static String longestSubstring(String s) {
		String result = "";
		int maxLength = 0;
		LinkedHashMap<Character, Integer> charPosition = new LinkedHashMap<>();
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			if(!charPosition.containsKey(s.charAt(i))) {
				charPosition.put(s.charAt(i), i);
			}
			else {
				i = charPosition.get(s.charAt(i));
				charPosition.clear();
			}
			
			if(charPosition.size() > maxLength) {
				maxLength = charPosition.size();
				result = charPosition.keySet().toString();
			}
		}
		
		return result;
	}
	
	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		int result = 0;
		int k = 0;
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				result = Math.max(result, set.size());
			} else {
				while (k < i) {
					if (s.charAt(k) == c) {
						k++;
						break;
					} else {
						set.remove(s.charAt(k));
						k++;
					}
				}
			}
		}

		return result;
	}

	private static void permutation(ArrayList<String> permList, String perm, String word) {
		if (word.isEmpty()) {
			// System.err.println(perm + word);
			permList.add(perm);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(permList, perm + word.charAt(i),
						word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}

	public static String reverseRecursion(String str) {
		if (str.length() < 2) {
			return str;
		}
		return reverseRecursion(str.substring(1)) + str.charAt(0);
	}

	public static boolean isInRotation(String s1, String s2) {
		String concatenated = s1 + s1;
		return s1.indexOf(s2) != -1 ? true : false;
	}

	static final int NO_OF_CHARS = 256;

	static int[] getCharCountArray(String str) {
		int count[] = new int[NO_OF_CHARS];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;

		return count;
	}

	/*
	 * removeDirtyChars takes two string as arguments: First string (str) is the one
	 * from where function removes dirty characters. Second string is the string
	 * which contain all dirty characters which need to be removed from first string
	 */
	static String removeDirtyChars(String str, String mask_str) {
		int count[] = getCharCountArray(mask_str);
		int ip_ind = 0, res_ind = 0;

		char arr[] = str.toCharArray();

		while (ip_ind != arr.length) {
			char temp = arr[ip_ind];
			if (count[temp] == 0) {
				arr[res_ind] = arr[ip_ind];
				res_ind++;
			}
			ip_ind++;

		}

		str = new String(arr);

		/*
		 * After above step string is ngring. Removing extra "iittg" after string
		 */

		return str.substring(0, res_ind);

	}

	public static boolean isAnagram(String s1, String s2) {

		int[] s1Count = new int[256];
		int[] s2Count = new int[256];

		if (s1.length() != s2.length()) {
			return false;
		}

		Arrays.fill(s1Count, 0);
		Arrays.fill(s2Count, 0);

		for (int i = 0; i < s1.length(); i++) {
			s1Count[s1.charAt(i)]++;
			s2Count[s2.charAt(i)]++;
		}

		for (int i = 0; i < s1Count.length; i++) {
			if (s1Count[i] != s2Count[i]) {
				return false;
			}
		}

		return true;
	}

	public int countTriplets(int[] arr, int sum) {
		int result = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 2; i++) {
			int l = i + 1;
			int r = arr.length - 1;
			while (l < r) {
				if (arr[i] + arr[l] + arr[r] >= sum) {
					r--;
				} else {
					result += r - l;
					l++;
				}

			}
		}
		return result;
	}

	public static void zigZagArray(int[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (flag) {
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}
			}
			flag = !flag;
		}
	}

	public static void reverseWithoutSpecialChar(char[] input) {
		int l = 0, r = input.length;
		while (l < r) {
			if (!Character.isLetter(input[l])) {
				l++;
			}
			if (!Character.isLetter(input[r])) {
				r--;
			} else {
				char temp = input[l];
				input[l] = input[r];
				input[r] = temp;
			}
		}
	}

	// fun&!! time
	public static String LongestWord(String sen) {
		String[] words = sen.split("[^A-Za-z0-9]");
		int maxLength = 0;
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > words[maxLength].length()) {
				maxLength = i;
			}
		}
		return words[maxLength];
	}

	private static String pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	private String mIpAddress;

	public boolean isMatch() {
		return Pattern.compile(pattern).matcher(mIpAddress).matches();
	}

	static void power(int n, int p) {
		if (n < 0 || p < 0) {
			System.out.println("java.lang.Exception: n and p should be non-negative");
			return;
		}

		int intResult = (int) Math.pow(n, p);
		System.out.println(intResult);
	}

	static String[] braces(String[] values) {
		Stack<Character> braceStack = new Stack<>();
		String result[] = new String[values.length];
		int k = 0;

		for (int i = 0; i < values.length; i++) {
			boolean isBreak = false;
			braceStack = new Stack<>();
			for (int j = 0; j < values[i].length(); j++) {
				char curr = values[i].charAt(j);
				if (curr == '(') {
					braceStack.push(')');
				} else if (curr == '{') {
					braceStack.push('}');
				} else if (curr == '[') {
					braceStack.push(']');
				} else if (braceStack.isEmpty() || curr != braceStack.pop()) {
					result[k++] = "NO";
					isBreak = true;
					break;
				}
			}
			if (!isBreak)
				result[k++] = braceStack.isEmpty() ? "YES" : "NO";
		}
		return result;
	}

	public static int divide(int a, int b) {
		int c = -1;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.print("Exception ");
		} finally {
			System.out.println("finally ");
		}
		return c;
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		int length = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < length - 2; i++) {
			int l = i + 1;
			int r = length - 1;
			int res = -nums[i];
			while (l < r) {
				if (nums[l] + nums[r] == res) {
					List<Integer> temp = new ArrayList<>();
					temp.add(i);
					temp.add(l);
					temp.add(r);
					result.add(temp);
					l++;
					r--;
				} else if (nums[l] + nums[r] > res) {
					r--;
				} else {
					l++;
				}

			}
		}
		return result;
	}

	public static int findBitonicSubarray(int[] A, int n) {
		// I[i] stores the length of the longest increasing sub-array
		// ending at A[i]
		int[] I = new int[n + 1];
		I[0] = 1;
		for (int i = 1; i <= n; i++) {
			I[i] = 1;
			if (A[i - 1] < A[i]) {
				I[i] = I[i - 1] + 1;
			}
		}

		// D[i] stores the length of the longest decreasing sub-array
		// starting with A[i]
		int[] D = new int[n + 1];
		D[n] = 1;
		for (int i = n - 1; i >= 0; i--) {
			D[i] = 1;
			if (A[i] > A[i + 1]) {
				D[i] = D[i + 1] + 1;
			}
		}

		// consider each element as peak and calculate LBS
		int lbs_len = 1;
		int beg = 0, end = 0;

		for (int i = 0; i <= n; i++) {
			if (lbs_len < I[i] + D[i] - 1) {
				lbs_len = I[i] + D[i] - 1;
				beg = i - I[i] + 1;
				end = i + D[i] - 1;
			}
		}

		// print longest bitonic sub-array
		System.out.println("The length of longest bitonic sub-array is " + lbs_len);

		System.out.println("The longest bitonic sub-array is [" + beg + ", " + end + "]");

		return lbs_len;
	}

	// Function to fill lookup table by finding the length of LCS
	// of substring X and Y
	public static void LCSLength(String X, String Y, int[][] T) {
		// fill the lookup table in bottom-up manner
		for (int i = 1; i <= X.length(); i++) {
			for (int j = 1; j <= Y.length(); j++) {
				// if current character of X and Y matches
				if (X.charAt(i - 1) == Y.charAt(j - 1))
					T[i][j] = T[i - 1][j - 1] + 1;

				// else if current character of X and Y don't match
				else
					T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
			}
		}
	}

	// Function to find all LCS of String X[0..m-1] and Y[0..n-1]
	public static Set<String> findLCS(String X, String Y, int[][] T) {
		// fill lookup table
		LCSLength(X, Y, T);

		// find all longest common sequences
		List<String> lcs = findAllLCS(X, Y, X.length(), Y.length(), T);

		// since List can contain duplicates, "convert" the list
		// to Set and return
		return new HashSet<>(lcs);
	}

	public static List<String> findAllLCS(String X, String Y, int m, int n, int[][] T) {
		if (m == 0 || n == 0) {
			// create a List with 1 empty string and return
			return new ArrayList<>(Collections.nCopies(1, ""));
		}
		System.out.println(m + " -m : n- " + n);
		// if last character of X and Y matches
		if (X.charAt(m - 1) == Y.charAt(n - 1)) {
			// ignore last characters of X and Y and find all LCS of
			// substring X[0..m-2], Y[0..n-2] and store it in a List
			List<String> lcs = findAllLCS(X, Y, m - 1, n - 1, T);

			// append current character X[m - 1] or Y[n - 1]
			// to all LCS of substring X[0..m-2] and Y[0..n-2]
			for (int i = 0; i < lcs.size(); i++) {
				lcs.set(i, lcs.get(i) + (X.charAt(m - 1)));
			}

			return lcs;
		}

		// we reach here when the last character of X and Y don't match

		// if top cell of current cell has more value than the left cell,
		// then ignore current character of String X and find all LCS of
		// substring X[0..m-2], Y[0..n-1]
		if (T[m - 1][n] > T[m][n - 1])
			return findAllLCS(X, Y, m - 1, n, T);

		// if left cell of current cell has more value than the top cell,
		// then ignore current character of String Y and find all LCS of
		// substring X[0..m-1], Y[0..n-2]
		if (T[m][n - 1] > T[m - 1][n])
			return findAllLCS(X, Y, m, n - 1, T);

		// if top cell has equal value to the left cell,
		// then consider both character

		List<String> top = findAllLCS(X, Y, m - 1, n, T);
		List<String> left = findAllLCS(X, Y, m, n - 1, T);

		// merge two Lists and return
		top.addAll(left);

		return top;
	}

	public static String LCSubString(String X, String Y, int m, int n) {
		int maxlen = 0; // stores the max length of LCS
		int endingIndex = m; // stores the ending index of LCS in X

		// lookup[i][j] stores the length of LCS of substring
		// X[0..i-1], Y[0..j-1]
		// int[][] lookup = new int[m+1][n + 1];
		int[][] lookup = new int[2][n + 1];
		int currVal = 0;
		// fill the lookup table in bottom-up manner
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				// if current character of X and Y matches
				if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					lookup[currVal][j] = lookup[1 - currVal][j - 1] + 1;
					// lookup[i][j] = lookup[i - 1][j - 1] + 1;
					// update the maximum length and ending index
					if (lookup[currVal][j] > maxlen) {
						// if (lookup[i][j] > maxlen) {
						maxlen = lookup[currVal][j];
						// maxlen = lookup[i][j];
						endingIndex = i;
					}
				}
			}
			currVal = 1 - currVal;
		}
		System.out.println("my maxLen : " + maxlen);
		// return Longest common substring having length maxlen
		return X.substring(endingIndex - maxlen, endingIndex);
	}

	public static char maximumOccurringCharacter(String text) {
		// Write your code here
		// int acsii = 128;
		char result = ' ';
		int[] charArray = new int[128];
		for (int i = 0; i < text.length(); i++) {
			charArray[text.charAt(i)]++;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < text.length(); i++) {
			if (max < charArray[text.charAt(i)]) {
				max = charArray[text.charAt(i)];
				result = text.charAt(i);
			}
		}

		return result;
	}

	public static void findAllSubstring(String str) {

		for (int i = 1; i <= str.length(); i++) {
			for (int j = 0; j < i; j++) {
				String s = str.substring(j, i);
				System.out.println(s);
			}
		}
	}

	public static int LCSubsequenceLength(String X, String Y) {
		int m = X.length(), n = Y.length();

		// lookup table stores solution to already computed sub-problems
		// i.e. T[i][j] stores the length of LCS of substring
		// X[0..i-1] and Y[0..j-1]
		int[][] T = new int[m + 1][n + 1];
		// fill the lookup table in bottom-up manner
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				// if current character of X and Y matches
				if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					T[i][j] = T[i - 1][j - 1] + 1;
				}
				// else if current character of X and Y don't match,
				else {
					T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
				}
			}
		}
		// LCS will be last entry in the lookup table
		return T[m][n];
	}

	// My Google Interview Question
	public static List<String> stringSubsequences(String str) {
		List<String> result = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = str.length(); j > i; j--) {
				String sub = str.substring(i, j);
				if (!result.contains(sub)) {
					result.add(sub);
				}
				for (int k = 0; k < sub.length() - 1; k++) {
					StringBuffer sb = new StringBuffer(sub);
					sb.deleteCharAt(k);
					if (!result.contains(sb.toString()))
						result.add(sb.toString());
					/* stringSubsequences(sb.toString()); */
				}
			}
		}

		return result;
	}
}
