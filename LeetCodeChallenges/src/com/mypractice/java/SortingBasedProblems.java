package com.mypractice.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortingBasedProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer[] arr = {1,5,7,9,1,3,11,11, 9};
		sortByFrequency(arr);*/
		String str = "abcppp";
		//System.out.println(oneTwo(str));
		//System.out.println(zipZap(str));
		//occuredOnce(new int[] {7, 7, 8, 8, 9, 1, 1, 4, 2, 2});
		occuredOnce1(new int[] {7, 7, 8, 8, 9, 1, 1, 4, 2, 2});
	}
	
	// without sorting O(n)
	public static void occuredOnce1(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1])
				i++;
			else
				System.out.println(arr[i-1]);
		}
		// As array is rotated we have to compare last and first element whether they are equal or not.
		if(arr[n-1]!=arr[0] && arr[n-1]!=arr[n-2])
			System.out.println(arr[n-1]);
	}
	// O(nLog n) --> can be solved using hashmap by counting occurance and iterating hashmap for single element
	public static void occuredOnce(int[] arr) {
		Arrays.sort(arr);
		if(arr[0]!=arr[1])
			System.out.println(arr[0]);
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1] && arr[i-1] != arr[i])
				System.out.println(arr[i]);
		}
		if(arr[arr.length-2]!=arr[arr.length-1])
			System.out.println(arr[arr.length-1]);
	}
	
	public static String zipZap(String str) {
		if (str.length() <= 2)
			return str;
		String result = "";
		for (int i = 0;i<str.length();) {
			if (str.length() - i > 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				result += "zp";
				i = i + 3;
			} else {
				result += "" + str.charAt(i);
				i = i + 1;
			}
		}
		return result;
	}
	
	public static String oneTwo(String str) {
		if (str.length() <= 2)
			return "";
		String result = "";
		for (int i = 0; str.length()-i>=3; i = i + 3) {
			char c = str.charAt(i);
			result += str.substring(i + 1, i + 3) + c;
		}
		return result;
	}
	
	/*public String oneTwo(String str) {
	  if(str.length()<=2)
	    return "";
	  
	  return str.substring(1,3) + str.charAt(0) + oneTwo(str.substring(3));
	}*/
	
	public static void sortByFrequency(Integer[] arr) {
		//MySortingAlgo.selectionSort(arr);
		//MySortingAlgo.printArr(arr);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}
			else
				hm.put(arr[i], 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " Freq " + entry.getValue());
		}
	
	}
}
