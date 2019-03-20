package com.leetcode.challenge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.regex.Pattern;

public final class MyLeetCode {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		 //rotate(new int[] {5,3,7,9,2},2);
		 // rotateLeft(new int[] {5,3,7,9,2},2);
		/*
		 * String[] splited = "20th Oct 2052".split("\\s+");
		 * System.out.println(splited[0]); System.out.println(Character.isDigit('c'));
		 * System.out.println(Character.isDigit(' ')); Map<String,Integer> resultHashMap
		 * = new HashMap<String,Integer>(); int count = resultHashMap.get("");
		 * resultHashMap.put("", count++);
		 */
		 
		//System.out.println(findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
		 //System.out.println(findMaxConsecutiveOnesKZeros(new int[] {1,1,1,0,0,0,1,1,1,1,0}));
		 // System.out.println(findMostConsecutiveOne(19));
		// System.out.println(findBitWiseAndMaxToK(n,k));

		// Not a leetcode problem
		// nestedLogic("31 12 2009","1 1 2010");

		/*
		  int a=2437,b=875; int x=a; int y=b;
		  
		  while(x!=y) { if(x>y) { x=x-y; } else if(x<y) { y=y-x; } }
		  System.out.println(x+" "+y);
		*/  

		// Not a leetcode problem
		// System.out.println(differentTeams("pcmpcmbbbzz"));
		
		
		// System.out.println(compute("ab"));
		/*
		 * 5 10000 01000 00100 00010 00001
		 */
		/*
		 * List<String> l = new ArrayList<>(); l.add("4"); l.add("1100"); l.add("1110");
		 * l.add("0110"); l.add("0001");
		 * 
		 * //System.out.println(zombieCluster(l));
		 * //System.out.println(solution(2,"1A 2F 1C"));
		 * 
		 * String st="abc as skldfj";
		 * 
		 * int start=0; String word=""; for(int i=0;i<st.length();i++) {
		 * if(st.charAt(i)==' ') { word = st.substring(start, i); start = i+1;
		 * System.out.println(word); } } String lastWord = st.substring(start);
		 * System.out.println(lastWord);
		 */
	

		
		// System.out.println("100^3 : "+(100^3));
		 /*System.out.println(Arrays.toString(missingNumbers(new int[] {
				 3696,3739,3714,3719,3687,3732,3657,3664,3717,3702,3741,3683,3660,3648,3649,3721,3652,3683,3694,3647,3696,3673,3741,3732,3677,3738,3666,3741,3701,3723,3721,3648,3654,3706,3743,3733,3704,3668,3660,3741,3730,3710,3729,3739,3662,3647,3701,3713,3674,3663,3690,3696,3719,3690,3728,3653,3734,3718,3722,3721,3725,3723,3703,3665,3668,3669,3654,3692,3699,3691,3682,3646,3649,3712,3688,3646,3662,3724,3705,3714,3692,3680,3690,3741,3693,3729,3664,3692,3660,3652,3718,3723,3684,3650,3685,3725,3679,3734,3710,3735,3685,3711,3672,3715,3739,3687,3660,3735,3674,3672,3674,3705,3666,3714,3710,3740,3656,3667,3655,3707,3710,3730,3695,3661,3713,3708,3688,3646,3653,3652,3701,3689,3657,3654,3647,3648,3656,3696,3730,3721,3712,3735,3651,3657,3716,3742,3704,3742,3705,3673,3680,3720,3727,3658,3738,3684,3653,3669,3656,3711,3734,3741,3743,3742,3655,3709,3743,3709,3697,3648,3667,3726,3717,3673,3700,3655,3651,3654,3728,3724,3651,3704,3687,3659,3656,3721,3663,3727,3725,3723,3660,3666,3664,3683,3678,3665,3681,3737,3714,3723,3660,3662,3724,3672,3657,3690,3718,3726,3714,3742,3689,3725,3706,3719,3674,3736,3712,3681,3701,3715,3738,3719,3714,3664,3659,3692,3651,3647,3722,3691,3647,3675,3700,3646,3706,3687,3685,3722,3740,3730,3732,3703,3730,3667,3667,3718,3720,3695,3711,3679,3656,3680,3677,3744,3740,3668,3710,3690,3724,3695,3692,3647,3717,3717,3682,3741,3681,3717,3691,3700,3659,3673,3705,3673,3672,3691,3686,3737,3701,3702,3742,3689,3658,3680,3676,3679,3716,3696,3673,3669,3711,3726,3691,3703,3650,3669,3742,3697,3737,3665,3710,3723,3668,3690,3700,3725,3736,3723,3718,3701,3679,3714,3651,3736,3664,3705,3656,3722,3694,3665,3660,3656,3676,3664,3715,3654,3675,3666,3688,3660,3667,3726,3718,3736,3735,3684,3667,3703,3701,3664,3682,3678,3718,3687,3699,3726,3650,3730,3648,3695,3690,3730,3713,3711,3732,3692,3736,3654,3698,3735,3652,3711,3742,3712,3664,3671,3682,3645,3691,3716,3719,3738,3681,3720,3651,3680,3657,3733,3702,3673,3682,3651,3688,3646,3665,3743,3704,3669,3721,3742,3667,3730,3715,3653,3721,3704,3737,3729,3700,3648,3668,3696,3742,3700,3666,3735,3720,3657,3722,3684,3655,3692,3670,3671,3673,3744,3647,3701,3671,3713,3709,3674,3688,3715,3656,3686,3649,3737,3712,3696,3646,3677,3654,3669,3659,3723,3702,3687,3726,3737,3713,3646,3723,3704,3693,3710,3726,3649,3669,3645,3667,3683,3684,3662,3705,3669,3676,3715,3666,3677,3648,3738,3696,3678,3682,3655,3678,3678,3682,3676,3724,3720,3694,3740,3707,3737,3654,3698,3731,3683,3706,3687,3712,3735,3694,3708,3680,3675,3668,3660,3652,3656,3657,3649,3688,3681,3739,3716,3667,3680,3668,3670,3738,3716,3652,3711,3720,3744,3671,3677,3705,3668,3666,3744,3687,3692,3697,3687,3673,3722,3694,3709,3649,3725,3666,3681,3689,3721,3706,3721,3723,3722,3650,3696,3701,3725,3716,3648,3703,3709,3739,3687,3697,3647,3718,3660,3739,3657,3701,3651,3683,3731,3678,3645,3731,3654,3743,3702,3677,3645,3677,3698,3722,3722,3711,3724,3738,3663,3649,3697,3723,3655,3662,3715,3677,3729,3723,3689,3673,3678,3661,3737,3682,3675,3728,3652,3721,3650,3653,3744,3686,3738,3712,3685,3738,3660,3723,3660,3730,3723,3664,3698,3683,3685,3716,3741,3648,3731,3692,3659,3658,3669,3702,3724,3652,3675,3649,3657,3701,3678,3647,3719,3646,3655,3646,3708,3663,3725,3655,3660,3729,3702,3661,3712,3695,3668,3678,3648,3650,3733,3709,3666,3688,3687,3742,3682,3662,3704,3735,3697,3740,3727,3703,3692,3683,3700,3705,3649,3660,3738,3742,3679,3707,3721,3698,3675,3690,3676,3694,3744,3669,3658,3680,3654,3668,3706,3722,3667,3657,3744,3727,3710,3681,3672,3646,3692,3690,3723,3647,3732,3722,3689,3697,3683,3717,3686,3679,3646,3683,3708,3727,3673,3706,3647,3714,3652,3679,3687,3707,3660,3650,3723,3692,3717,3688,3660,3725,3699,3668,3733,3672,3737,3697,3704,3715,3665,3681,3677,3731,3734,3650,3708,3717,3716,3680,3735,3730,3698,3718,3694,3720,3648,3724,3690,3680,3670,3734,3698,3708,3656,3689,3726,3676,3683,3671,3671,3733,3709,3667,3680,3711,3687,3707,3720,3706,3728,3680,3683,3736,3659,3734,3721,3707,3720,3680,3662,3647,3656,3720,3658,3724,3717,3660,3704,3671,3662,3730,3734,3721,3712,3731,3737,3687,3740,3721,3674,3742,3645,3683,3717,3713,3653,3698,3718,3701,3645,3742,3681,3719,3720,3682,3652,3733,3707,3685,3675,3683,3701,3656,3645,3725,3655,3737,3681,3671,3711,3683,3715,3700,3732,3693,3705,3677,3701,3716,3683,3655,3676,3739,3650,3693,3666,3715,3726,3675,3683,3705,3672,3650,3654,3727,3647,3727,3668,3664,3734,3703,3650,3648,3700,3672,3673,3734,3666,3656,3693,3693,3684,3713,3704,3696,3658,3662,3726,3653,3692,3681,3729,3700,3703,3675,3696,3696,3678,3681,3678,3676,3682,3714,3659,3726,3662,3663,3675,3721,3741,3708,3695,3687,3694,3674,3725,3737,3691,3699,3665,3739,3703,3698,3669,3725,3663,3694,3741,3663,3673,3719,3652,3664,3734,3701,3647,3720,3675,3741,3732,3652,3686,3718,3655,3674,3732,3725,3722,3723,3678,3716,3669,3672,3673,3717,3650,3702,3690,3654,3692,3648,3728,3653,3702,3705,3712,3673,3685,3711,3697,3736,3691,3704,3725,3725,3727,3713,3728,3705,3674,3715,3662,3662,3739,3674,3700,3647,3718,3708,3678,3680,3715,3672,3726,3744,3704,3645,3742,3671,3663,3667,3674,3687,3679,3720,3690,3661,3650,3670,3657,3696,3654,3741,3731
		 }, 
				 new int[] {
						 3697,3674,3700,3652,3702,3718,3693,3724,3676,3657,3656,3654,3668,3721,3683,3704,3711,3695,3656,3715,3685,3688,3688,3728,3731,3732,3669,3717,3687,3654,3694,3689,3653,3682,3646,3674,3668,3719,3720,3657,3668,3722,3675,3674,3698,3690,3732,3650,3651,3696,3725,3683,3705,3710,3688,3727,3725,3716,3716,3721,3728,3722,3671,3670,3681,3645,3696,3713,3680,3717,3673,3675,3720,3741,3738,3669,3676,3679,3723,3727,3647,3713,3660,3681,3687,3707,3675,3678,3726,3649,3723,3726,3694,3701,3741,3718,3743,3720,3674,3738,3686,3706,3698,3723,3728,3648,3654,3742,3690,3709,3737,3704,3681,3725,3713,3724,3684,3648,3690,3650,3667,3741,3655,3718,3680,3665,3665,3727,3660,3655,3703,3692,3739,3649,3677,3724,3737,3683,3696,3708,3736,3744,3738,3742,3739,3703,3706,3652,3668,3648,3683,3654,3708,3688,3713,3669,3717,3675,3694,3709,3739,3702,3666,3681,3685,3673,3662,3645,3683,3691,3671,3652,3702,3659,3649,3652,3665,3721,3704,3739,3719,3715,3713,3729,3692,3703,3731,3645,3662,3734,3654,3667,3664,3646,3704,3680,3730,3737,3742,3683,3732,3701,3666,3673,3669,3715,3655,3675,3654,3720,3720,3678,3739,3726,3707,3738,3681,3720,3653,3669,3716,3700,3681,3668,3741,3731,3650,3705,3675,3687,3671,3738,3646,3661,3737,3744,3696,3690,3648,3719,3723,3670,3673,3666,3743,3714,3657,3725,3677,3704,3697,3703,3725,3682,3723,3662,3664,3647,3701,3723,3691,3710,3742,3704,3674,3691,3718,3682,3697,3664,3646,3683,3705,3682,3685,3702,3658,3648,3733,3702,3739,3742,3703,3742,3737,3649,3669,3683,3668,3653,3670,3723,3680,3681,3717,3732,3657,3734,3735,3714,3698,3650,3735,3656,3676,3712,3678,3739,3701,3735,3677,3672,3710,3646,3721,3652,3737,3686,3692,3682,3695,3662,3719,3736,3711,3672,3721,3676,3732,3698,3673,3667,3716,3648,3698,3648,3678,3723,3645,3742,3724,3678,3705,3678,3701,3649,3742,3717,3699,3677,3680,3700,3717,3691,3737,3672,3661,3702,3672,3740,3709,3649,3719,3742,3739,3668,3650,3737,3660,3691,3723,3679,3696,3696,3682,3738,3671,3687,3700,3722,3655,3701,3694,3723,3742,3667,3707,3652,3715,3711,3657,3718,3656,3663,3655,3720,3725,3674,3719,3715,3694,3676,3708,3737,3740,3690,3696,3675,3694,3660,3710,3667,3715,3717,3700,3695,3712,3687,3687,3726,3663,3733,3675,3735,3664,3662,3728,3711,3742,3718,3722,3646,3687,3680,3715,3664,3669,3654,3659,3686,3730,3666,3648,3713,3703,3712,3704,3701,3665,3679,3722,3682,3741,3650,3689,3735,3725,3657,3694,3728,3724,3685,3725,3731,3649,3651,3736,3694,3723,3677,3689,3685,3683,3682,3696,3718,3654,3673,3722,3718,3667,3658,3718,3683,3693,3705,3660,3694,3698,3650,3714,3657,3652,3656,3732,3668,3685,3734,3678,3689,3701,3666,3674,3646,3695,3692,3653,3705,3679,3654,3741,3666,3684,3645,3697,3735,3716,3735,3685,3730,3672,3656,3727,3695,3723,3714,3647,3681,3647,3713,3699,3696,3733,3722,3659,3652,3733,3683,3660,3736,3730,3687,3731,3704,3725,3733,3683,3692,3721,3657,3689,3668,3703,3723,3673,3711,3670,3725,3710,3655,3739,3666,3676,3681,3652,3667,3679,3723,3666,3712,3682,3692,3691,3668,3671,3720,3688,3658,3671,3687,3648,3716,3735,3649,3651,3720,3676,3705,3712,3673,3677,3722,3659,3683,3699,3679,3718,3650,3711,3722,3648,3662,3650,3656,3738,3672,3734,3740,3655,3664,3673,3667,3730,3700,3741,3729,3686,3647,3734,3730,3715,3651,3704,3696,3705,3650,3700,3664,3701,3714,3727,3702,3684,3659,3720,3655,3715,3706,3654,3698,3669,3728,3718,3663,3680,3696,3662,3688,3653,3645,3662,3687,3744,3709,3742,3680,3678,3742,3660,3679,3663,3671,3682,3674,3721,3712,3702,3703,3714,3651,3725,3738,3705,3709,3683,3654,3677,3684,3725,3663,3697,3689,3672,3738,3711,3678,3660,3660,3692,3646,3731,3726,3736,3657,3742,3686,3710,3708,3677,3680,3669,3723,3717,3667,3681,3732,3741,3676,3735,3684,3652,3677,3734,3718,3656,3687,3692,3677,3658,3683,3721,3660,3656,3717,3705,3719,3711,3667,3653,3672,3700,3705,3730,3647,3675,3708,3717,3650,3714,3650,3701,3715,3680,3659,3679,3675,3655,3723,3649,3678,3660,3721,3663,3707,3687,3714,3692,3658,3730,3722,3697,3680,3712,3697,3661,3692,3666,3678,3727,3708,3653,3673,3684,3662,3740,3743,3672,3726,3726,3681,3713,3719,3673,3715,3725,3698,3648,3653,3665,3669,3730,3708,3683,3730,3729,3645,3693,3678,3647,3736,3736,3732,3673,3660,3646,3691,3727,3712,3662,3656,3690,3673,3656,3724,3690,3716,3721,3741,3725,3721,3690,3647,3721,3690,3657,3655,3680,3692,3674,3706,3744,3741,3692,3729,3687,3744,3707,3664,3744,3656,3712,3680,3660,3701,3720,3664,3665,3737,3662,3667,3667,3647,3665,3648,3723,3693,3701,3702,3712,3720,3734,3724,3651,3734,3647,3654,3663,3724,3671,3738,3658,3740,3693,3678,3726,3656,3651,3669,3689,3733,3721,3716,3695,3720,3726,3697,3674,3698,3660,3688,3701,3652,3706,3687,3743,3711,3726,3706,3670,3666,3687,3741,3668,3660,3700,3710,3729,3646,3704,3690,3690,3729,3693,3714,3709,3706,3699,3700,3696,3721,3684,3650,3647,3700,3669,3716,3647,3716,3726,3664,3660,3660,3668,3647,3661,3674,3730,3705,3688,3692,3710,3724,3681,3715,3722,3726,3683,3677,3706,3645,3701,3721,3666,3737,3654,3744,3662,3720,3707,3734,3704,3711,3707,3647,3659,3740,3655,3697,3717,3692,3685,3708,3701,3680,3682,3648,3744,3687,3657,3663,3690,3731,3673,3674,3734,3652,3714,3725,3703,3651,3711,3664,3696,3722,3685,3741,3647,3646,3709,3695,3691,3673,3743,3671,3727,3704,3675,3672,3737
				 })));*/
		//System.out.println(balancedSums(Arrays.asList(new Integer[] {2,0,0,0})));
		/*MyLeetCode m = new MyLeetCode();
		List<List<Integer>> list = m.combine(4, 2);
		for(List<Integer> l : list) {
			for(Integer i : l) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}*/
		
		//System.out.println(numberOfPairs(new int[] {1,3,46,1,3,9}, 47));
		
		//System.out.println(getOccurence(41, 1));
		// System.out.println(searchRotatedSorted(new int[] {4,5,6,7,0,1,2}, 1));
		//System.out.println(generateParenthesis(2));
		//System.out.println(generateParenthesis1(2));
		//System.out.println(combinationSum(new int[] {2,3,6,7}, 7));
		//System.out.println(birthdayCakeCandles(new int[] {18,90,90,13,90,75,90,8,90,43}));
		//System.out.println(coinChange(new int[] {1,2,5}, 11));
	//	System.out.println(coinChangeTopDown(new int[] {1,2,5}, 11));
		//System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}));
		
		/*List<String> ls = new ArrayList<>();
		ls.add("cats");
		ls.add("dog");
		ls.add("sand");
		ls.add("and");
		ls.add("cat");
		Set<String> ls = new HashSet<>();
		ls.add("cats");
		ls.add("dog");
		ls.add("sand");
		ls.add("and");
		ls.add("cat");
		System.out.println(wordBreak("catsanddog", ls));
		*/
		
		//System.out.println(lengthOfLongestSubString1("abcbaxsb"));
		
		/*char[][] grid = {{'1','1','0','0','0'},
						{'1','1','0','0','0'},
						{'0','0','1','0','0'},
						{'0','0','0','1','1'},
						{'0','0','0','0','0'}};
		System.out.println(numIslands(grid));*/
		//System.out.println(generateMatrix(3));
		//System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
		// System.out.println(addition(10, 100));
		//System.out.println(findCelebrity(4));
		
		// Below both are same
		//System.out.println(taskScheduler(new char[] {'a','a','a','b','b','b' }, 3));
		//System.out.println(leastInterval(new char[] {'a','A','A','B','B' }, 3));
		
		//System.out.println(Arrays.toString(cellCompete(new int[] {1,1,1,0,1,1,1,1}, 2).toArray()));
		
		/*List<List<Integer>> nn = new ArrayList<>();
		List<Integer> n = new ArrayList<>();
		List<List<Integer>> bb = new ArrayList<>();
		n.add(1);
		n.add(8);
		nn.add(new ArrayList<>(n));
		n = new ArrayList<>();
		n.add(2);
		n.add(15);
		nn.add(new ArrayList<>(n));
		n = new ArrayList<>();
		n.add(3);
		n.add(9);
		nn.add(new ArrayList<>(n));
		n.add(4);
		n.add(10);
		nn.add(new ArrayList<>(n));
		List<Integer> b = new ArrayList<>();
		b.add(1);
		b.add(8);
		bb.add(b);
		b = new ArrayList<>();
		b.add(2);
		b.add(11);
		bb.add(b);
		b = new ArrayList<>();
		b.add(3);
		b.add(12);
		bb.add(b);
		b = new ArrayList<>();
		b.add(4);
		b.add(5);
		bb.add(b);
		System.out.println(optimalUtilization(20, nn, bb));*/
		
		//System.out.println(electionWinner(new String[] {"Mary","Joe","Joe","Mary",""}));
		//System.out.println(electionWinner1(new String[] {"Mary","Joe","Joe","Mary","Joe",""}));
		//System.out.println(findMinimalOperation("aaaabb"));
		//System.out.println(Arrays.toString(minimalOperation(new String[] {"ab","aab","abb","abab","abaaaba"}).toArray()));
		/*List<String> sentences = new ArrayList<>();
		sentences .add("bob and alice like to text each other");
		sentences.add("bob does not like to ski but does not like to fall");
		sentences.add("alice likes to ski");
		List<String> queries = new ArrayList<>();
		queries.add("bob alice");
		queries.add("alice");
		queries.add("like");
		textQueries(sentences, queries);*/
		//System.out.println(isPalindrom(1221));
		//System.out.println(findMedianSortedArrays(new int[] {1,2}, new int[] {-1,3}));
		/*int[][] matrix = new int[][] {
			{1,1,0},
			{1,0,1},
			{0,0,0}
		};
		System.out.println(Arrays.toString(flipAndInvertImage(matrix)));*/
		
		// "barfoofoobarthefoobarman"
		// ["bar","foo","the"]
		// "wordgoodgoodgoodbestword"
		// ["word","good","best","good"]
		//System.out.println(findSubstring("wordgoodgoodgoodbestword", new String[] {"word", "good", "best", "word"}));
		//System.out.println(findSubstring("wordgoodgoodgoodbestword", new String[] {"word", "good", "best", "good"}));
		//System.out.println(findSubstring("barfoofoobarthefoobarman", new String[] {"foo", "bar", "the"}));
		
		/*char[][] board = 
				{
					{'5','3','.','.','7','.','.','.','.'},
					  {'6','.','.','1','9','5','.','.','.'},
					  {'.','9','8','.','.','.','.','6','.'},
					  {'8','.','.','.','6','.','.','.','3'},
					  {'4','.','.','8','.','3','.','.','1'},
					  {'7','.','.','.','2','.','.','.','6'},
					  {'.','6','.','.','.','.','2','8','.'},
					  {'.','.','.','4','1','9','.','.','5'},
					  {'.','.','.','.','8','.','.','7','9'}
				};
		System.out.println(isValidSudoku(board));*/
		//System.out.println(jump(new int[] {2,3,1,1,4}));
	}
	// -2147483648
	// -1

	// Frog Jump #403
	public boolean canCross(int[] stones) {
		for (int i = 3; i < stones.length; i++) {
			if (stones[i] > 2 * stones[i - 1])
				return false;
		}
		int lastStone = stones[stones.length - 1];
		Set<Integer> stonesSet = new HashSet<>();
		for (int stone : stones) {
			stonesSet.add(stone);
		}
		Stack<Integer> positions = new Stack<>();
		Stack<Integer> jumps = new Stack<>();
		positions.push(0);
		jumps.push(0);
		while (!positions.isEmpty()) {
			int position = positions.pop();
			int jump = jumps.pop();
			for (int i = jump - 1; i <= jump + 1; i++) {
				if (i <= 0)
					continue;
				int nextPosition = position + i;
				if (nextPosition == lastStone)
					return true;
				else if (stonesSet.contains(nextPosition)) {
					positions.push(nextPosition);
					jumps.push(i);
				}
			}
		}
		return false;
	}
	
	// #45 Jump Game II
	public static int jump(int[] nums) {
		int jumpCount = 0;
		int currMaxJump = 0;
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			max = Math.max(max, i + nums[i]);
			if (i == currMaxJump) {
				jumpCount++;
				currMaxJump = max;
			}
		}
		return jumpCount;
	}
	
	// #55 Jump Game
	public static boolean canJump(int[] nums) {
		int max = 0;
		for(int i=0;i<nums.length;i++) {
			if(i>max)	return false;
			max = Math.max(max, i + nums[i]);
		}
		return true;
	}
	
	public static boolean canJump1(int[] nums) {
		if(nums.length<=1)
			return true;
		int max = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(max<=i && nums[i]==0)
				return false;
			if(i + nums[i] > max)
				max = i + nums[i];
			if(max >= nums.length-1)
				return true;
		}
		return false;
	}
	
	// O(2^n) 
	public static boolean canJumpSlower(int[] nums) {
		return canJump(nums, 0);
	}
	
	public static boolean canJump(int[] nums, int pos) {
		if(pos == nums.length-1)
			return true;
		int maxSteps = Math.min(pos + nums[pos], nums.length-1);
		for(int steps = maxSteps; steps>=0; steps--) {
			if(canJump(nums, steps))
				return true;
		}
		return false;
	}
	
	public static List<List<String>> groupAnagramsFaster(String[] strs) {

		Map<Long, List<String>> map = new HashMap<Long, List<String>>();
		int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
				103 };
				// prime number or 1-26 is also fine
		for (int i = 0; i < strs.length; i++) {

			char[] charArr = strs[i].toCharArray();
			long sum = 1;
			for (int j = 0; j < charArr.length; j++) {
				sum *= prime[charArr[j] - 'a']; // instead of * --> + is also right
			}
			if (map.containsKey(sum)) {
				List<String> anaList = map.get(sum);
				anaList.add(strs[i]);
				map.put(sum, anaList);
			} else {
				List<String> anaList = new ArrayList<String>();
				anaList.add(strs[i]);
				map.put(sum, anaList);
			}
		}

		List<List<String>> output = new ArrayList<List<String>>();
		for (Long key : map.keySet()) {
			List<String> anaList = map.get(key);
			output.add(anaList);
		}

		return output;
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for(String s : strs) {
			char[] sCharArr = s.toCharArray();
			Arrays.sort(sCharArr);
			String key = new String(sCharArr);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}
		result.addAll(map.values());
		return result;
	}
	
	public static boolean isValidSudoku(char[][] board) {
		if(board == null || board.length!=9 || board[0].length!=9)
			return false;
		// Check horizontal rows
		for(int i=0;i<9;i++) {
			boolean[] check = new boolean[9];
			for(int j=0;j<9;j++) {
				if(board[i][j]!='.') {
					int index = (int)(board[i][j]-'1');
					if(check[index])
						return false;
					check[index] = true;
				}
			}
		}
		
		// Check vertical rows
		for (int i = 0; i < 9; i++) {
			boolean[] check = new boolean[9];
			for (int j = 0; j < 9; j++) {
				if (board[j][i] != '.') {
					int index = (int) (board[j][i] - '1');
					if (check[index])
						return false;
					check[index] = true;
				}
			}
		}
		
		/*// Check column wise
		for (int block = 0; block < 9; block++) {
			boolean[] m = new boolean[9];
			for (int i = (block/3)*3; i < (block / 3)*3 + 3; i++) {
				for (int j = (block%3)*3; j < (block % 3)*3 + 3; j++) {
					if (board[i][j] != '.') {
						if (m[(int) (board[i][j] - '1')]) {
							return false;
						}
						m[(int) (board[i][j] - '1')] = true;
					}
				}
			}
		}*/
		
		for(int xs = 0 ; xs < 9 ;xs += 3){
            for(int ys = 0 ; ys < 9 ; ys += 3){
                boolean[] m = new boolean[9];
                for(int i = xs; i < xs +3 ; i ++){
                    for(int j = ys; j < ys +3 ; j ++){
                        if(board[i][j]!='.') {
                        	int index = (int)(board[i][j] - '1');
                        	if(m[index])
                        		return false;
                        	m[index] = true;
                        }
                    }
                }
            }
        }
		
		return true;
	}
	
	public static List<Integer> findSubstring(String s, String[] words) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (s == null || s.length() == 0 || words == null || words.length == 0) {
			return result;
		}

		// frequency of words
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String w : words) {
			map.put(w, map.getOrDefault(w, 0) + 1);
		}

		int len = words[0].length();

		for (int j = 0; j < len; j++) {
			HashMap<String, Integer> currentMap = new HashMap<String, Integer>();
			int start = j;// start index of start
			int count = 0;// count total qualified words so far
			for (int i = j; i < s.length() - len; i = i + len) {
				String sub = s.substring(i, i + len);
				if (map.containsKey(sub)) {
					// set frequency in current map
					currentMap.put(sub, currentMap.getOrDefault(sub, 0) + 1);
					count++;
					
					/*if(currentMap.get(sub) > map.get(sub)) {
						currentMap.clear();
						currentMap.put(sub, 1);
						start = i;
						count=1;
						
					}*/
					// For cases like below we need while loop to reset the current map
					// "wordgoodgoodgoodbestword"
					// ["word","good","best","good"] 
					while (currentMap.get(sub) > map.get(sub)) {
						String leftString = s.substring(start, start + len);
						currentMap.put(leftString, currentMap.get(leftString) - 1);
						count--;
						start = start + len;
					}

					if (count == words.length) {
						result.add(start); // add to result

						// shift right and reset currentMap, count & start point
						String left = s.substring(start, start + len);
						currentMap.put(left, currentMap.get(left) - 1);
						count--;
						start = start + len;
					}
				} else {
					currentMap.clear();
					start = i + len;
					count = 0;
				}
			}
		}

		return result;
	}
	
	public static int longestValidParentheses1(String s) {
		Stack<Integer> stack = new Stack<>();
		int maxLength = 0;
		stack.push(-1);
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == '(')
				stack.push(i);
			else {
				stack.pop();
				if(stack.isEmpty())
					stack.push(i);
				else
					maxLength = Math.max(maxLength, i - stack.peek());
			}
		}
		return maxLength;
	}
	
	public static int longestValidParentheses(String s) {
		int maxLength=0, left=0, right=0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				left++;
			}
			else{
				right++;
			}
			
			if(left == right) {
				maxLength = Math.max(maxLength, 2*right);
			}
			else if(right > left) {
				left = right = 0;
			}
		}
		
		left = right = 0;
		for(int i=s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			if(c == '(') {
				left++;
			}
			else{
				right++;
			}
			
			if(left == right) {
				maxLength = Math.max(maxLength, 2*left);
			}
			else if(left > right) {
				left = right = 0;
			}
		}
		return maxLength;
	}
	
	public static int[][] flipAndInvertImage1(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			int j = 0, k = A[0].length - 1;
			while (j < k) {
				int temp = A[i][j];
				A[i][j++] = A[i][k];
				A[i][k--] = temp;
			}
			for (j = 0; j < A[0].length; j++) {
				A[i][j] = A[i][j] == 1 ? 0 : 1;
			}
		}
		return A;
	}
	
	public static int[][] flipAndInvertImage(int[][] A) {
		int n = A.length;
		for (int[] row : A) {
			for (int i = 0; i * 2 < A.length; i++) {
				if (row[i] == row[n - i - 1]) {
					row[i] = row[n - i - 1] ^= 1;
				}
			}
		}
		return A;
	}
	
	public static void rotate(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=i;j<matrix[0].length;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length/2;j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j] = temp;
			}
		}
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int count = 0;
		boolean odd = (nums1.length + nums2.length) % 2 != 0;
		int n = nums1.length == nums2.length ? nums1.length : (nums1.length + nums2.length) / 2;
		int m1 = Integer.MAX_VALUE, m2 = Integer.MAX_VALUE;
		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] <= nums2[j]) {
				if (odd && count == n)
					return nums1[i];
				if (!odd && count == n - 1)
					m1 = nums1[i];
				else if (!odd && count == n)
					m2 = nums1[i];
				i++;
			} else {
				if (odd && count == n)
					return nums2[j];
				if (!odd && count == n - 1)
					m1 = nums2[j];
				else if (!odd && count == n)
					m2 = nums2[j];
				j++;
			}
			count++;
			if (m1 != Integer.MAX_VALUE && m2 != Integer.MAX_VALUE)
				return (m1 + m2) / 2.0;
		}

		while (i < nums1.length) {
			if (odd && count == n)
				return nums1[i];
			if (!odd && count == n - 1)
				m1 = nums1[i];
			else if (!odd && count == n)
				m2 = nums1[i];
			i++;
			count++;
		}
		if (m1 != Integer.MAX_VALUE && m2 != Integer.MAX_VALUE)
			return (m1 + m2) / 2.0;
		while (j < nums2.length) {
			if (odd && count == n)
				return nums2[j];
			if (!odd && count == n - 1)
				m1 = nums2[j];
			else if (!odd && count == n)
				m2 = nums2[j];
			j++;
			count++;
		}
		return (m1 + m2) / 2.0;
	}
	public static boolean isPalindrom(int x) {
		if(x < 0 || (x!=0 && x%10==0))
			return false;
		
		int reverse = 0;
		while(x > reverse) {
			reverse = reverse*10 + x%10;
			x /=10;
		}
		return x==reverse || x == reverse/10;
	}
	
	public static String zigZagConvert(String s, int numRows) {
		List<StringBuilder> list = new ArrayList<>();
		for(int i=0;i<Math.min(numRows, s.length());i++) {
			list.add(new StringBuilder());
		}
		int currRow = 0;
		for(char c: s.toCharArray()) {
			list.get(currRow).append(c);
			if(currRow == 0) currRow++;
			else if(currRow == s.length()-1) currRow--;
		}
		String str = "";
		for(StringBuilder sb : list) {
			str += sb.toString();
		}
		return str;
	}
	
	public static void textQueries(List<String> sentences, List<String> queries) {
		List<Map<String, Integer>> mapList = new ArrayList<>();
		for(String sentence : sentences) {
			mapList.add(makeWordsMap(sentence));
		}
		for(String query: queries) {
			String result = "";
			if(!query.isEmpty()) {
				for(int i=0;i<mapList.size();i++) {
					int count = Integer.MAX_VALUE;
					for(String s : query.split("\\s")) {
						count = Math.min(count, mapList.get(i).get(s)==null?0:mapList.get(i).get(s));
					}
					for(int j=1;j<=count;j++) {
						result += "sentences["+i+"],";
					}
				}

			}
			System.out.println(result);
		}
	}
	
	public static Map<String, Integer> makeWordsMap(String str){
		Map<String, Integer> map = new HashMap<>();
		for(String s: str.split("\\s")) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		return map;
	}

	public static List<Integer> minimalOperation(String[] inventory) {
		List<Integer> result = new ArrayList<>();;
		for(int i=0;i<inventory.length;i++) {
			result.add(findMinimalOperation(inventory[i]));
		}
		return result;
	}
	
	public static int findMinimalOperation(String s) {
		int result = 0;
		if(s.length()<=0)
			return result;
		char prev = s.charAt(0);
		for(int i=1;i<s.length();i++){
			char curr = s.charAt(i);
			if(prev == curr) {
				result++;
				if(i+1<s.length() && prev == s.charAt(i+1))
					i++;
			}
			prev = curr;
		}
		return result;
	}

	public static String electionWinner1(String[] candidates) {
		String result = "";
		int max = Integer.MIN_VALUE;
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<candidates.length;i++) {
			map.put(candidates[i], map.getOrDefault(candidates[i], 0)+1);
			if(max < map.get(candidates[i])) {
				max = map.get(candidates[i]);
				result = candidates[i];
			}
			else if(max == map.get(candidates[i])) {
				result = biggerString(result, candidates[i]);
			}
		}
		return result;
	}
	
	public static String biggerString(String s1, String s2) {
		int big = s1.compareTo(s2);
		if(big > 1)
			return s1;
		if(big < 1)
			return s2;
		return s1;
	}
	public static String electionWinner(String[] candidates) {
		int max = Integer.MIN_VALUE;
		Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<candidates.length;i++) {
			map.put(candidates[i], map.getOrDefault(candidates[i], 0)+1);
			max = Math.max(max, map.get(candidates[i]));
		}
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		for(String s: map.keySet()) {
			if(map.get(s) == max) {
				pq.add(s);
			}
		}
		return pq.isEmpty()?"":pq.poll();
	}
	
	class Point{
		int x;
		int y;
		double distance;
	}
	
	
	List<List<Integer>> ClosestXdestinations1(int numDestinations, List<List<Integer>> allLocations, int numDeliveries) {
// WRITE YOUR CODE HERE
		List<List<Integer>> list = new ArrayList<>();

		PriorityQueue<Point> pq = new PriorityQueue<>(new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
// TODO Auto-generated method stub
				if (o1.distance < o2.distance)
					return -1;
				if (o1.distance > o2.distance)
					return 1;
				return 0;
			}
		});

		for (List<Integer> list1 : allLocations) {
			int x = list1.get(0);
			int y = list1.get(1);
			double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			Point p = new Point();
			p.x = x;
			p.y = y;
			p.distance = distance;
			pq.add(p);
			if (pq.size() > numDeliveries) {
				pq.poll();
			}
		}
		while (!pq.isEmpty()) {
			List<Integer> location = new ArrayList<>();
			Point p = pq.poll();
			location.add(p.x);
			location.add(p.y);
			list.add(location);
		}
		return list;
	}
	List<List<Integer>> ClosestXdestinations(int numDestinations, List<List<Integer>> allLocations, int numDeliveries) {
// WRITE YOUR CODE HERE

	    PriorityQueue<Point> pq = new PriorityQueue<>(new Comparator<Point>() {

				@Override
				public int compare(Point o1, Point o2) {
					// TODO Auto-generated method stub
					if(o1.distance<o2.distance)
					    return 1;
					if(o1.distance>o2.distance)
					    return -1;
					return 0;
				}
			});
	        for(List<Integer> list: allLocations){
	            int x = list.get(0);
	            int y = list.get(1);
	            double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	            Point p = new Point();
				p.x = x;
				p.y= y;
				p.distance = distance;
	            pq.add(p);
	            if(pq.size()>numDeliveries){
	                pq.poll();
	            }
	        }
	        List<List<Integer>> list = new ArrayList<>();
	        while(!pq.isEmpty()){
	            List<Integer> location = new ArrayList<>();
	            Point p = pq.poll();
	            location.add(p.x);
	            location.add(p.y);
	            list.add(location);
	        }
	        return list;

	}

	static List<List<Integer>> optimalUtilization(int deviceCapacity, List<List<Integer>> foregroundAppList,
			List<List<Integer>> backgroundAppList) {
// WRITE YOUR CODE HERE
		Map<Integer, List<List<Integer>>> map = new HashMap<>();
		int min = Integer.MAX_VALUE;
		for (List<Integer> list : foregroundAppList) {
			int id = list.get(0);
			int mem = list.get(1);
			for (List<Integer> bgList : backgroundAppList) {
				int bgid = bgList.get(0);
				int bgmem = bgList.get(1);
				int sum = deviceCapacity - (mem + bgmem);
				if (sum >= 0) {
					if (sum < min) {
						List<Integer> l = new ArrayList<>();
						l.add(id);
						l.add(bgid);
						if (!map.containsKey(sum)) {
							List<List<Integer>> ll = new ArrayList<>();
							ll.add(l);
							map.put(sum, ll);
							min = sum;
						} else {
							List<List<Integer>> ll = map.get(sum);
							ll.add(l);
							map.put(sum, ll);
						}
					} else if (sum == min) {
						List<Integer> l = new ArrayList<>();
						l.add(id);
						l.add(bgid);
						List<List<Integer>> ll = map.get(sum);
						ll.add(l);
						map.put(sum, ll);
					}
				}
			}
		}

		int max = Integer.MAX_VALUE;
		for (int key : map.keySet()) {
			max = Math.min(max, key);
		}
		return map.get(max);
	}
	
	public static List<Integer> cellCompete(int[] states, int days) {
		// WRITE YOUR CODE HERE
		List<Integer> result = new ArrayList<>();
		int length = states.length;
		for (int k = 1; k <= days; k++) {
			int index = 0;
			int prev = 0;
			int next = 0;
			while (index < length) {
				next=0;//to handle last index
				if (index < length - 1)
					next = states[index + 1];
				if (prev == next) {
					prev = states[index];
					states[index] = 0;
				} else {
					prev = states[index];
					states[index] = 1;
				}
				index++;
			}

		}

		for (int i = 0; i < length; i++) {
			result.add(states[i]);
		}

		return result;
	}

	/**
	 * 
	 * Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters represent different tasks. Tasks could be done without original order. Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.

		However, there is a non-negative cooling interval n that means between two same tasks, there must be at least n intervals that CPU are doing different tasks or just be idle.
		
		You need to return the least number of intervals the CPU will take to finish all the given tasks.
		Example:
		
		Input: tasks = ["A","A","A","B","B","B"], n = 2
		Output: 8
		Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.
		 
		
		Note:
		
		The number of tasks is in the range [1, 10000].
		The integer n is in the range [0, 100].
	 * 
	 */
	public static int taskScheduler(char[] ch, int n) {
		Map<Character, Integer> map = new HashMap<>();
		for(char c: ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		pq.addAll(map.values());
		int allTime = 0;
		int cycle = n+1;
		while(!pq.isEmpty()) {
			int workTime = 0;
			List<Integer> tmp = new ArrayList<>();
			for(int i=0;i<cycle;i++) {
				if(!pq.isEmpty()) {
					tmp.add(pq.poll());
					workTime++;
				}
			}
			for(int cnt: tmp) {
				if(--cnt > 0)
					pq.offer(cnt);
			}
			allTime += !pq.isEmpty() ? cycle : workTime; 
		}
		return allTime;
	}

	//partCount = count(A) - 1
	//emptySlots = partCount * (n - (count of tasks with most frequency - 1))
	//availableTasks = tasks.length - count(A) * count of tasks with most frenquency
	//idles = max(0, emptySlots - availableTasks)
	//result = tasks.length + idles

	//https://leetcode.com/problems/task-scheduler/discuss/104500/Java-O(n)-time-O(1)-space-1-pass-no-sorting-solution-with-detailed-explanation

	public static int leastInterval(char[] tasks, int n) {
		int[] counter = new int[58]; // 58 can be 26 if there's only upper case or lower case-- here we took 58 because we considered upper and lower cases 58 + 6 as they are 6 places apart in ASCII
		int max = 0; // Maximum occurance of a task
		int maxCount = 0; // how many times max occurance task value repeats for eg. 3A 3B --> max is 3 and maxCount is 2 (as both A and B appears same number of time)
		// e.g. 3A 2B --> max = 3 , maxCount=1 (As max count appears only 1 in case of A)
		for (char task : tasks) {
			counter[task - 'A']++;
			if (max == counter[task - 'A']) {
				maxCount++;
			} else if (max < counter[task - 'A']) {
				max = counter[task - 'A'];
				maxCount = 1;
			}
		}
		// 3A 2B --> max = 3 , maxCount = 1, n = 2
		// A * A * A -- * depends on 2 factors n and maxCount -- partCount = max-1 = 2
		//  ----   ----        == partLength = n - (maxCount-1) = 2 - (1-1) = 2 Slots here indicated by 2 ? marks  -- If case is 3A 3B then consider them as 1 entity and calculation explanation would be easy 
		// A ? ? A ? ? A       == emptySlots to fill in = partCount * partLength = 4 -- replicate partLength in every partCount
		// 2B is the only available task = task length - max*maxCount = 5 - 3*1 = 2
		// Idle task is emptySlots - availabletask = 2
		
		int partCount = max - 1;
		int partLength = n - (maxCount - 1);
		int emptySlots = partCount * partLength;
		int availableTasks = tasks.length - max * maxCount; // Available tasks apart from max count tasks
		int idles = Math.max(0, emptySlots - availableTasks);

		return tasks.length + idles;
	}
	    
	public static boolean knows(int a, int b) {
		int MATRIX[][] = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };
		return MATRIX[a][b] == 1;
	}
	
	public static int findCelebrity(int n) {
		int celebrity = 0;
		for (int i = 1; i < n; i++) {
			if (knows(celebrity, i))
				celebrity = i;
		}
		/*int a = 0;
		int b = n-1;
		while (a < b) 
	    { 
	        if (knows(a, b)) 
	            a++; 
	        else
	            b--; 
	    }
		
		for (int i = 0; i < n; i++) {
			if (i != a) {
				if (knows(a, i) || !knows(i, a))
					return -1;
			}
		}*/
		
		for (int i = 0; i < n; i++) {
			if (i != celebrity) {
				if (knows(celebrity, i) || !knows(i, celebrity))
					return -1;
			}
		}
		//return a;
		return celebrity;
	}
	
	public static String countAndSay(int n) {
		if(n<=0)
			return "";
		String result = "1";
		int i=1;
		while(i<n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for(int j=1;j<result.length();j++) {
				if(result.charAt(j)==result.charAt(j-1))
					count++;
				else {
					sb.append(count);
					sb.append(result.charAt(j-1));
					count=1;
				}
			}
			sb.append(count);
			sb.append(result.charAt(result.length()-1));
			result = sb.toString();
			i++;
		}
		return result;
	}
	
	public static int addition(int a, int b) {
		System.out.println("Addition of a and b");
		return a+b;
	}
	/**
	  	Say you have an array for which the ith element is the price of a given stock on day i.

		If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
		
		Note that you cannot sell a stock before you buy one.
		
		Example 1:
		
		Input: [7,1,5,3,6,4]
		Output: 5
		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
	*/
	// #121
	public static int maxProfit1(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i: prices){
            if(i<min)
                min = i;
            else
                max = Math.max(max, i-min);
        }
        return max;
    }
	
	/**
	 * Say you have an array for which the ith element is the price of a given stock on day i.

		Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
		
		Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
		
		Example 1:
		
		Input: [7,1,5,3,6,4]
		Output: 7
		Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
		Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
	 */
	// Leet code #122
	public static int maxProfitSinglePass(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
	// Leet code #122
	public static int maxProfit(int[] prices) {
		int i = 0;
		int valley = prices[0];
		int peak = prices[0];
		int maxprofit = 0;
		while (i < prices.length - 1) {
			while (i < prices.length - 1 && prices[i] >= prices[i + 1])
				i++;
			valley = prices[i];
			while (i < prices.length - 1 && prices[i] <= prices[i + 1])
				i++;
			peak = prices[i];
			maxprofit += peak - valley;
		}
		return maxprofit;
	}
	
	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		if (n == 0) {
			return result;
		}
		int number = 1;
		int left = 0;
		int right = n - 1;
		int top = 0;
		int bottom = n - 1;
		while (left <= right && top <= bottom) {
			for (int i = left; i <= right; i++) {
				result[top][i] = number++;
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				result[i][right] = number++;
			}
			right--;
			for (int i = right; i >= left; i--) {
				result[bottom][i] = number++;
			}
			bottom--;
			for (int i = bottom; i <= top; i++) {
				result[i][left] = number++;
			}
			left++;

		}
		return result;
	}
	
	public static List<Integer> spiralOrder(int[][] matrix){
		List<Integer> result = new ArrayList<>();
		if(matrix == null || matrix.length==0)
			return result;
		
		int top=0;
		int bottom = matrix.length-1;
		int left=0;
		int right = matrix[0].length-1;
		
		while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				result.add(matrix[top][i]);
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				result.add(matrix[i][right]);
			}
			right--;
			for(int i=right;i>=left;i--) {
				result.add(matrix[bottom][i]);
			}
			bottom--;
			for(int i=bottom;i>=top;i--) {
				result.add(matrix[i][left]);
			}
			left--;
			
		}
		return result;
	}
	
	public static int numIslands(char[][] grid) {
		if(grid == null || grid.length==0)
			return 0;
		int noOfIslands = 0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j] == '1')
					noOfIslands += dfs(grid, i, j);
			}
		}
		return noOfIslands;
	}
	
	public static int dfs(char[][] grid, int i, int j) {
		if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0')
			return 0;
		grid[i][j] = '0';
		dfs(grid, i-1, j);
		dfs(grid, i+1, j);
		dfs(grid, i, j-1);
		dfs(grid, i, j+1);
		return 1;
	}
	
	public static boolean isValidIndex(char[][] grid, int i, int j) {
		if(i<0 || i>= grid.length || j<0 || j>=grid[0].length)
			return false;
		return true;
	}
	
	
	/**
	 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
	
	Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
	
	You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
	
	Example:
	
	Given n = 5, and version = 4 is the first bad version.
	
	call isBadVersion(3) -> false
	call isBadVersion(5) -> true
	call isBadVersion(4) -> true
	
	Then 4 is the first bad version. 
	*/
	
	public static boolean isBadVersion(int i) {
		return true;
	}
	public static int firstBadVersion(int n) {
		int l = 1;
		int r = n;
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(!isBadVersion(mid)) {
				l = mid+1;
			}
			else {
				r = mid;
			}
		}
		return l;
	}
	
	public static String frequencySort(String s) {
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
		}
		
		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue() - o1.getValue();
			}
		});
		
		pq.addAll(map.entrySet());
		
		while(!pq.isEmpty()) {
			Map.Entry<Character, Integer> entry = pq.poll();
			for(int i=0;i<entry.getValue();i++) {
				sb.append(entry.getKey());
			}
		}
		
		return sb.toString();
	}
	
	// Length of longest substring without repeating a character
	public static int lengthOfLongestSubString1(String s) {
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
            	//abcbaxsb -- here the reason to take math.max is...when we first encounter duplicate b (index 3) and then we discover a (index 4)
            	// but as a is already present in map we dont consider its original index we have to take the string from the first repeating character that is b at index 3
                j = Math.max(map.get(curr) + 1, j);
            }
            map.put(curr, i);
            max = Math.max(max, i-j + 1);
        }
        return max;
    }
	// Length of longest substring without repeating a character
	public static int lengthOfLongestSubString(String s) {
		if(s==null || s.length()==0)
			return 0;
		int max = Integer.MIN_VALUE;
		Set<Character> set = new HashSet<>();
		int k=0;
		for(int i=0;i<s.length();i++) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				max = Math.max(max, set.size());
			}
			else {
				while(k<i) {
					if(s.charAt(k)==s.charAt(i)) {
						k++;
						break;
					}
					else {
						set.remove(s.charAt(k));
						k++;
					}
				}
			}
		}
		return max;
	}

	public static int myAtoi(String s) {
		if (s == null || s.length() == 0)
			return 0;
		s = s.trim();
		// Check for null string
		if (s.length() == 0)
			return 0;
		// To have grater value than Integer.MAX_VALUE (what if the string contains
		// grater value than MAX_VALUE)
		double result = 0;
		int i = 0;
		char flag = '+';
		if (s.charAt(0) == '+') {
			i++;
		} else if (s.charAt(0) == '-') {
			flag = '-';
			i++;
		}
		while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			result = result * 10 + (s.charAt(i) - '0');
			i++;
		}
		if (flag == '-')
			result = -result;
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		return (int) result;

	}
	
	/**
	 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences.

		Note:
		
		The same word in the dictionary may be reused multiple times in the segmentation.
		You may assume the dictionary does not contain duplicate words.
		Example 1:
		
		Input:
		s = "catsanddog"
		wordDict = ["cat", "cats", "and", "sand", "dog"]
		Output:
		[
		  "cats and dog",
		  "cat sand dog"
		]
	 * 
	 */

	// Word break 2
	public List<String> wordBreak(String s, List<String> wordDict) {
		if (s.length() == 0) {
			return new ArrayList<>();
		}

		Set<String> set = new HashSet<>();
		for (String word : wordDict) {
			set.add(word);
		}
		return dfs(s, set, new HashMap<>());
	}

	/**
	 * break the sentence into two part, check whether set contains first part. If
	 * so, recursively check the second part
	 */
	public List<String> dfs(String s, Set<String> set, Map<String, List<String>> map) {
		// retrieve memo from map cache
		if (map.containsKey(s)) {
			return map.get(s);
		}

		List<String> result = new ArrayList<String>();
		// base case: the leaf level (represents the last word of sentence)
		if (set.contains(s)) {
			result.add(s);
		}

		// try every possible prefix string, and recursively check postfix string
		for (int i = 1; i < s.length(); i++) {
			String prefix = s.substring(0, i);
			if (set.contains(prefix)) {
				List<String> tempList = dfs(s.substring(i), set, map);
				for (int j = 0; j < tempList.size(); j++) {
					result.add(prefix + " " + tempList.get(j));
				}
			}
		}
		// update memo cache
		map.put(s, result);
		return result;
	}
	
	// Make last index of substring true so we can break the words based on dictionary
	public static boolean wordBreak(String s, Set<String> dict) {
		boolean[] bool = new boolean[s.length()+1];
		bool[0] = true;
		for(int i=1; i<=s.length(); i++) {
			for(int j=0; j<i; j++)
				if(bool[j] && dict.contains(s.substring(j, i))) {
					bool[i] = true;
					break;
				}
		}
		return bool[s.length()];
	}
	
	public static boolean wordBreak1(String s, List<String> wordDict) {
		int[] dp = new int[s.length()+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for(int i=0;i<s.length();i++) {
			// to check whether all the cases are matched from list -- > for case catsanddog if list has only dog the result will be true without if condition
			if(dp[i]!=-1) {
				for(int j=i+1;j<=s.length();j++) {
					if(wordDict.contains(s.substring(i, j))) {
						dp[j] = i;
					}
				}
			}
		}
		return dp[s.length()]!=-1;
	}
	public static String mostCommonWord(String para, String[] banned) {
		Set<String> hs = new HashSet<>();
		for(String s: banned) {
			hs.add(s.toLowerCase());
		}
		Map<String, Integer> map = new HashMap<>();
		// [^A-Za-z] means other than A-Za-z --> replacing all the other characters with " " - blank space
		for(String s: para.replaceAll("[^A-Za-z]", " ").toLowerCase().split("\\s")) {
			if(!hs.contains(s))
				map.put(s, map.getOrDefault(s, 0)+1);
		}
		String result="";
		for(String key: map.keySet()) {
			if(result.equals("") || map.get(key) > map.get(result)) {
				result = key;
			}
		}
		return result;
	}
	
	public static int coinChangeMin(int[] coins, int amount) {
		if(amount < 0)	return Integer.MAX_VALUE;
		if(amount == 0) return 0;
		int coin = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			int res = coinChangeMin(coins, amount - coins[i]);
			if(res != Integer.MAX_VALUE)
				coin = Math.min(coin, 1 + res);
		}
		return coin;
	}
	
	public static int coinChangeTopDown(int[] coins, int amount) {
		if(amount<1)
			return 0;
		return coinChangeTopDown(coins, amount, new int[amount]);
	}
	
	public static int coinChangeTopDown(int[] coins, int remainingAmount, int[] dp) {
		if (remainingAmount < 0)
			return -1;
		if (remainingAmount == 0)
			return 0;
		if (dp[remainingAmount - 1] != 0)
			return dp[remainingAmount - 1];

		int minimum = Integer.MAX_VALUE;
		for (int coin : coins) {
			System.out.println("remaining Amt : "+ remainingAmount + " Coins: "+coin);
			int changeResult = coinChangeTopDown(coins, remainingAmount - coin, dp);
			
			/*
			 * If making change was possible (changeResult >= 0) and the change result beats
			 * our present minimum, add one to that smallest value
			 * 
			 * We accept that coin as the last coin in our change making sequence up to this
			 * point since it minimizes the coins we need
			 */
			if (changeResult >= 0 && changeResult < minimum) {
				minimum = 1 + changeResult;
			}
			System.out.println("changeResult : "+ changeResult + " Minimum : "+ minimum);
			
		}
		/*
		 * If no answer is found (minimum == Integer.MAX_VALUE) then the sub problem
		 * answer is just arbitrarily made to be -1, otherwise the sub problem's answer
		 * is "minimum"
		 */
		dp[remainingAmount - 1] = (minimum == Integer.MAX_VALUE) ? -1 : minimum;

		// Return the sub problem's answer
		return dp[remainingAmount - 1];
	}

	// Its same as unbound knapsack problem
	public static int coinChange(int[] coins, int amount) {
		int max = amount+1; // Can be any number grater than amount
		int[] dp = new int[max];
		Arrays.fill(dp, max);
		dp[0]=0;
		for(int i=1;i<=amount;i++) {
			for(int j=0;j<coins.length;j++) {
				if(coins[j]<=i) {
					dp[i] = Math.min(1 + dp[i-coins[j]], dp[i]);
				}
			}
		}
		 /*
	      dp[amount] has our answer. If we do not have an answer then dp[amount]
	      will be amount + 1 and hence dp[amount] > amount will be true. We then
	      return -1.
	      Otherwise, dp[amount] holds the answer
	    */
		return dp[amount] > amount ? -1 : dp[amount];
	}
	
	
	static int birthdayCakeCandles(int[] ar) {
		int count = 0;
		int max = Integer.MIN_VALUE;
		int prevMax = max;
		for (int i = 0; i < ar.length; i++) {
			max = Math.max(ar[i], max);
			if (max == prevMax && max == ar[i])
				count++;
			else {
				if(max != prevMax) {
					count = 1;
				}
				prevMax = max;
			}
		}
		
		return count;
	}
	
	/*
	 *  Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

		Each number in candidates may only be used once in the combination.
		
		Note:
		
		All numbers (including target) will be positive integers.
		The solution set must not contain duplicate combinations.
		
		Input: candidates = [10,1,2,7,6,1,5], target = 8,
		A solution set is:
		[
		  [1, 7],
		  [1, 2, 5],
		  [2, 6],
		  [1, 1, 6] --- Here 1 is used twice because its present twice in the original array
		]
	 */
	public static List<List<Integer>> combinationSum2(int[] nums, int target){
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		backtrackCombSum2(result, nums, target, 0, new ArrayList<>());
		return result;
	}
	
	public static void backtrackCombSum2(List<List<Integer>> result, int[] nums, int remaining, int start, List<Integer> tempList) {
		if(remaining < 0) return;
		else if(remaining == 0) result.add(new ArrayList<>(tempList));
		else {
			for(int i=start;i<nums.length;i++) {
				if(i > start && nums[i] == nums[i-1]) continue;
				tempList.add(nums[i]);
				backtrackCombSum2(result, nums, remaining - nums[i], i+1, tempList);
				tempList.remove(tempList.size()-1);
			}
		}
	}
	
	/*
	 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
		The same repeated number may be chosen from candidates unlimited number of times.
		
		Note:
		
		All numbers (including target) will be positive integers.
		The solution set must not contain duplicate combinations.
	 * 
	 * Input: candidates = [2,3,6,7], target = 7,
		A solution set is:
		[
		  [7],
		  [2,2,3] -- Here 2 used twice
		]
	 */
	
	public static List<List<Integer>> combinationSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, target, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
		if (remain < 0)
			return;
		else if (remain == 0)
			list.add(new ArrayList<>(tempList));
		else {
			for (int i = start; i < nums.length; i++) {
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
				tempList.remove(tempList.size() - 1);
			}
		}
	}
	
	public static List<List<Integer>> combinationSumItr(int[] cands, int t) {
		Arrays.sort(cands); // sort candidates to try them in asc order
		List<List<List<Integer>>> dp = new ArrayList<>();
		for (int i = 1; i <= t; i++) { // run through all targets from 1 to t
			List<List<Integer>> newList = new ArrayList<>(); // combs for curr i
			// run through all candidates <= i
			for (int j = 0; j < cands.length && cands[j] <= i; j++) {
				// special case when curr target is equal to curr candidate
				if (i == cands[j])
					newList.add(Arrays.asList(cands[j]));
				// if current candidate is less than the target use prev results
				else
					for (List<Integer> l : dp.get(i - cands[j] - 1)) {
						if (cands[j] <= l.get(0)) {
							List<Integer> cl = new ArrayList<>();
							cl.add(cands[j]);
							cl.addAll(l);
							newList.add(cl);
						}
					}
			}
			dp.add(newList);
		}
		return dp.get(t - 1);
	}
	
	public static List<String> generateParenthesis1(int n) {
		List<String> ans = new ArrayList<>();
		if (n == 0) {
			ans.add("");
		} else {
			for (int c = 0; c < n; ++c)
				for (String left : generateParenthesis1(c))
					for (String right : generateParenthesis1(n - 1 - c))
						ans.add("(" + left + ")" + right);
		}
		return ans;
	}
	
	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		//generateAllParenthesis(new char[2*n],0,result); // More time consuming
		backtrack(result, "", 0, 0, n);
		return result;
	}
	
	public static void backtrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			System.out.println("Result: "+cur);
			return;
		}
		if (open < max)
			backtrack(ans, cur + "(", open + 1, close, max);
		
		if (close < open)
			backtrack(ans, cur + ")", open, close + 1, max);
	}
	public static void generateAllParenthesis(char[] c,int pos,List<String> result){
		if(c.length==pos) {
			if(validParan(c))
				result.add(new String(c));
		}
		else {
			c[pos]='(';
			generateAllParenthesis(c, pos+1, result);
			c[pos]=')';
			generateAllParenthesis(c, pos+1, result);
		}
	}
	public static boolean validParan(char[] current) {
		int balance=0;
		for(char c: current) {
			if(c=='(')
				balance++;
			else
				balance--;
			if(balance<0)
				return false;
		}
		return balance==0;
	}
	public static int searchRotatedSorted(int[] nums, int target) {
		if (nums.length < 1)
			return -1;
		int i = 0, j = nums.length - 1;

		while (i < j) {
			int mid = (i + j) / 2;
			if (nums[mid] == target)
				return mid;
			if (nums[i] <= nums[mid]) {
				if (target >= nums[i] && target < nums[mid]) {
					j = mid - 1;
				} else {
					i = mid + 1;
				}
			} else {
				if (target > nums[mid] && target <= nums[j]) {
					i = mid + 1;
				} else {
					j = mid - 1;
				}
			}
		}
		return nums[i] == target ? i : -1;
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Set<List<Integer>> result = new LinkedHashSet<>();
		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;
				int k = j + 1;
				int l = nums.length - 1;
				while (k < l) {
					int sum = nums[i] + nums[j] + nums[k] + nums[l];
					if (sum < target)
						k++;
					else if (sum > target)
						l--;
					else {
						List<Integer> temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[k]);
						temp.add(nums[l]);
						result.add(temp);
						if (nums[k] == nums[l])
							break;
						while (k + 1 < l && nums[k] == nums[k + 1])
							k++;
						while (l - 1 > k && nums[l] == nums[l - 1])
							l++;
						k++;
						l--;
					}
				}
			}
		}
		List<List<Integer>> f = new ArrayList<>(result);
		return f;
	}
	
	
	/*
	 *  Input :  n = 25 
        d = 2
		Output : 9
		The occurrences are 2, 12, 20, 21
		22 (Two occurrences), 23, 24, 25
	 */
	
	public static int getOccurence(int n, int d) {

		// Initialize result
		int result = 0;

		// Count appearances in numbers
		// starting from d.
		int itr = d;

		while (itr <= n) {
			// When the last digit is
			// equal to d
			if (itr % 10 == d)
				result++;

			// When the first digit is
			// equal to d then
			if (itr != 0 && itr / 10 == d) {
				// increment result as
				// well as number
				result++;
				itr++;
			}

			// In case of reverse of number
			// such as 12 and 21
			else if (itr / 10 == d - 1)
				itr = itr + (10 - d);
			else
				itr = itr + 10;
		}

		return result;
	}
	
	// Sum
	public static int numberOfPairs(int[] a, long k) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == k)
					count++;
			}
		}
		return count;
	}
	// Difference -- For Positive int k
	public static int countPairsWithDiffK(int arr[], int n, int k) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++)
				if (Math.abs(arr[i] - arr[j]) == k)
					count++;
		}
		return count;
	}
	
	public double myPow(double x, int n) {
		if (n == 0)
			return 1; // base case
		// account for negative exponent, and handle Integer.MIN_VALUE overflow
		// always reduce |n| by 1 before converting to positive, to fix overflow
		if (n < 0)
			return 1 / x * myPow(1 / x, -(n + 1));
		return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2); // the trick
	}
	
	public static List<String> letterCombinationsBacktrack(String digits) {
		List<String> result = new ArrayList<>();
		Map<String,String> digitCharMap = new HashMap<>();
        digitCharMap.put("2","abc");
        digitCharMap.put("3","def");
        digitCharMap.put("4","ghi");
        digitCharMap.put("5","jkl");
        digitCharMap.put("6","mno");
        digitCharMap.put("7","pqrs");
        digitCharMap.put("8","tuv");
        digitCharMap.put("9","wxyz");
		backtrackLetterCombination("", digits, digitCharMap, result);
		return result;
	}
	
	public static void backtrackLetterCombination(String combination, String nextDigit, Map<String, String> map, List<String> result) {
		if(nextDigit.length()==0)
			result.add(combination);
		else {
			String digit = nextDigit.substring(0, 1);
			String letters = map.get(digit);
			for(int i=0;i<letters.length();i++) {
				String letter = letters.substring(i, i+1);
				backtrackLetterCombination(combination+letter, nextDigit.substring(1), map, result);
			}
		}
	}
	
	public List<String> letterCombinations(String digits) {
        Map<String,String> digitCharMap = new HashMap<>();
        digitCharMap.put("2","abc");
        digitCharMap.put("3","def");
        digitCharMap.put("4","ghi");
        digitCharMap.put("5","jkl");
        digitCharMap.put("6","mno");
        digitCharMap.put("7","pqrs");
        digitCharMap.put("8","tuv");
        digitCharMap.put("9","wxyz");
        
        List<String> result = new ArrayList<String>();
        char[] digitsCharArray = digits.toCharArray();
        for(int i=0;i<digitsCharArray.length;i++){
            String charMap = digitCharMap.get(digitsCharArray[i]+"");
            result = getCombination(result,charMap);
        }
        return result;
    }
    
    public List<String> getCombination(List<String> result,String charMap){
        List<String> newResult = new ArrayList<>();
    	if(result.size()==0){
            for(char c: charMap.toCharArray()){
            	newResult.add(String.valueOf(c));
            }
            return newResult;
        }
        for(int i=0;i<result.size();i++){
            for(int j=0;j<charMap.length();j++){
            	newResult.add(result.get(i)+charMap.charAt(j));
            }
        }
        
        return newResult;
    }
	
	List<List<Integer>> combine(int n, int k){
		List<List<Integer>> result = new ArrayList<>();
		if (n <= 0 || n < k)
			return result;
		List<Integer> item = new ArrayList<>();
		combine(n, k, 1, item, result);
		return result;
	}
	
	static void combine(int n, int k, int start, List<Integer> item, List<List<Integer>> result) {
		if(item.size() == k) {
			result.add(new ArrayList<>(item));
			return;
		}
		for(int i=start; i<=n;i++) {
			item.add(i);
			combine(n, k, i+1, item, result);
			item.remove(item.size()-1);
		}
	}
	static String balancedSums(List<Integer> arr) {
		int size = arr.size();
		int l = 0, r = size - 1;
		int val1 = arr.get(0);
		int val2 = arr.get(r);
	
		while (l < size && r >= 0) {
			if (val1 == val2 && r - l > 1) {
				return "YES";
			}
			if(val1==val2 && r-l<=1)
				if(l==0)
					return "YES";
				else
					return "NO";
			if (val1 > val2) {
				val2 += arr.get(--r);
				//r--;
			} else if (val1 < val2) {
				val1 += arr.get(++l);
				//l++;
			}
		}
		return "NO";
	}
	
	public static int[] missingNumbers(int[] arr, int[] brr) {
		int[] result = new int[brr.length-arr.length];
        TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
        for(int i=0;i<brr.length;i++){
        	tmap.put(brr[i], tmap.getOrDefault(brr[i], 0)+1);
        	/*if(!tmap.containsKey(brr[i])){
                tmap.put(brr[i], 1);
            }
            else{
                int val = tmap.get(brr[i]) + 1;
                tmap.put(brr[i],val);
            }*/
        }
        for(int i=0;i<arr.length;i++){
            if (tmap.containsKey(arr[i])) {
                int val = tmap.get(arr[i]) - 1;
                tmap.put(arr[i], val);
            }
        }

        int resIndex = 0;
        for(Map.Entry<Integer,Integer> m : tmap.entrySet()){
            if(tmap.get(m.getKey()) != 0){
                result[resIndex++] = m.getKey();
            }
        }

        return result;
    }
	
	public static int floorSqrt1(int x) {
		// Base cases
		if (x == 0 || x == 1)
			return x;

		// Staring from 1, try all numbers until
		// i*i is greater than or equal to x.
		int i = 1, result = 1;

		while (result <= x) {
			i++;
			result = i * i;
		}
		return i - 1;
	}	
	public static int floorSqrt(int x) {
		// Base Case
		if(x<=1)
			return x;
		
		int result = 0;
		int start=1,end=x;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(mid*mid==x) {
				return mid;
			}
			if(mid*mid<x) {
				start = mid+1;
				result = mid;
			}
			else {
				end = mid-1;
			}
		}
		
		return result;
	}
	
	public static char firstNonRepeatingChar(String s) {
		char c = '-';
		char[] charSet = new char[256];
		for(int i=0;i<s.length();i++) {
			charSet[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++) {
			if(charSet[s.charAt(i)]==1)
				return s.charAt(i);
		}
		return c;
	}
	
	public static boolean matchingBrackets(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char curr = s.charAt(i);
			if(curr == '(') {
				stack.push(')');
			}
			else if(curr == '{') {
				stack.push('}');
			}
			else if(curr == '[') {
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop()!=curr) {
				return false;
			}
		}
		
		return stack.isEmpty();
	}
	
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2,int[] arr3) {
		int i=0, j=0, k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			}
			else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(i<arr1.length) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
		
		return arr3;
	}
	
	public static void moveAllZeros(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while(count<arr.length) {
			arr[count]=0;
			count++;
		}
	}

	public static int findBitWiseAndMaxToK(int n, int k) {
		int result = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int val = i & j;
				if (val < k && val > result) {
					result = val;
				}
			}
		}
		return result;
	}

	
	/////////////////////////////////////////////////////// #485 #1004 #487 /////////////////////////////////////////////////////////////////////
	/// #485 -- K=1 --- #487 -- K=2 and #1004 K=K
	//			   0 1 2 3 4 5 6 7 8 9 10
	// Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
	// Output: 6
	public static int findMaxConsecutiveOnesKZeros(int[] nums) {
		int result=0, zero=0,k=2;
		for(int l=0, h=0;h<nums.length;h++) {
			if(nums[h]==0)
				zero++;
			while(zero > k) {
				if(nums[l++] == 0)
					zero--;
			}
			result = Math.max(result, h-l+1);
		}
		return result;
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int result = Integer.MIN_VALUE;
		if (nums.length == 1)
			result = nums[0];
		int prev = nums[0];
		int count = prev == 1 ? 1 : 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == 1 && prev == 1)
				count++;
			else if(nums[i] == 1)
				count=1;
			result = Math.max(result, count);
			prev = nums[i];
		}
		return result;
	}
	
	public static int findMostConsecutiveOne(int n) {
		int result = 0;
		int prev = 0;
		int count = 1;
		while (n > 0) {
			int a = n % 2;
			if (a == 1 && a == prev) {
				count++;
				result = Math.max(result, count);
			} else {
				result = Math.max(result, count);
				count = 1;
			}
			prev = a;
			n /= 2;
		}
		return result;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////// #189
	public static void rotateLeft(int[] arr, int order) {
		if (arr == null || arr.length <= 1 || order == 0) {
			return;
		}
		
		if(order > arr.length) {
		//	order = order%arr.length; 
			order = Math.abs(arr.length-order);
		}
		
		for(int i=0;i<order;i++){
			leftRotate(arr);
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void leftRotate(int[] arr) {
		int tmp = arr[0];
		int i=0;
		for(i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = tmp;
	}
	
	public static void rotateLeft1(int[] arr, int order) {
		if (arr == null || arr.length <= 1 || order == 0) {
			return;
		}
		
		if(order > arr.length)
			order = order%arr.length; // order = Math.abs(arr.length-order);
		
		int[] tmp = new int[order];
		for(int i=0;i<order;i++) {
			tmp[i] = arr[i];
		}
		int j = order;
		for(int i=0;i<arr.length-order;i++) {
			arr[i] = arr[j++];
		}
		int k=0;
		for(j=arr.length-order;j<arr.length;j++) {
			arr[j] = tmp[k++];
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	// Rotate right -- #189
	public static void rotate(int[] arr, int order) {
		if (arr == null || arr.length == 0 || order == 0) {
			return;
		}
		if (order > arr.length)
			order = order % arr.length;

		int a = arr.length - order;
		reverse(arr, 0, a - 1);
		reverse(arr, a, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void reverse(int[] arr, int st, int end) {
		if (arr == null || arr.length == 1)
			return;

		while (st < end) {
			int temp = arr[st];
			arr[st] = arr[end];
			arr[end] = temp;
			st++;
			end--;
		}

	}
}
