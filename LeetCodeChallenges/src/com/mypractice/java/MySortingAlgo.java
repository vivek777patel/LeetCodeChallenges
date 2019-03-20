package com.mypractice.java;

import java.util.Arrays;

public class MySortingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer arr1[] = {64,25,12,22,11};
		Integer arr[] = {5,3,1,9,8,2,4,7,1,1};
		//selectionSort(arr);
		//bubbleSort(arr);
		/*String[] str = {"paper", "true", "soap", "floppy", "flower"};
		selectionSortStr(str);*/
		//recursiveBubbleSort(arr);
		/*insertionSort(arr);*/
		//insertionSortRecursion(arr);
		//mergeSort(arr);
		//iterativeMergeSort(arr);
		quickSort(arr);
		printArr(arr," ");
	}
	public static int partitionQuick(Integer[] arr, int start, int end) {
		int pivot = arr[end];
		int pivotIndex = start;
		// We can't iterate upto i<=end as we are taking end element as "pivot"
		for(int i=start;i<end;i++) {
			if(arr[i] <= pivot) {
				swap(arr,i,pivotIndex);
				pivotIndex++;
			}
		}
		swap(arr, end, pivotIndex);
		return pivotIndex;
	}
	public static void quickSort(Integer[] arr, int start, int end) {
		if(start >= end)
			return;
		int pivotIndex = partitionQuick(arr, start, end);
		quickSort(arr, start, pivotIndex-1);
		quickSort(arr, pivotIndex+1, end);
	}
	public static void quickSort(Integer[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void iterativeMergeSort(Integer[] arr) {
		int low = 0;
		int high = arr.length-1;
		Integer[] temp = Arrays.copyOf(arr, arr.length);
		// 1,2,4,8...
		for(int m=1; m<=high; m=2*m) {
			// m=1, i=0,2,4,6,8...
			// m=2, i=0,4,8,12,16...
			// m=3, i=0,8,16,24...
			// sort chunks of 2 elements in first iteration
			// sort chunks of 4 elements in second iteration and so on...
			// then merge all sorted smaller chunks
			for(int i=low; i<=high; i += 2*m) {
				int from = i;
				int mid = i + m -1;
				int to = Integer.min(i + 2*m -1, high);
				iterativeMerge(arr, temp, from, mid, to);
			}
		}
	}
	
	public static void iterativeMerge(Integer[] arr, Integer[] temp, int from, int mid, int to) {
		int k=from, i=from, j=mid+1;
		while(i<=mid && j<=to) {
			if(arr[i]<arr[j]) {
				temp[k++] = arr[i++];
			}
			else
				temp[k++] = arr[j++];
		}
		while(i<=mid)
			temp[k++] = arr[i++];

		// no need for second half to iterate because our first while loop is designed in such a way 
		// that it always finish second half first as we take the chunks of equal halves 
		// or 1 value less then first half in second half
		/*while(j<=to)
			temp[k++] = arr[j++];*/
		
		for(i=from;i<=to;i++) {
			arr[i] = temp[i];
		}
	}
	
	// From bealdung.com
	public static void mergeSort(Integer[] arr) {
		mergeSort(arr, arr.length);
	}
	// 5,3,1,9,8,2,4,7
	public static void mergeSort(Integer[] arr, int n) {
		if(arr.length<2)
			return;
		int mid = n/2;
		Integer[] l = new Integer[mid];
		Integer[] r = new Integer[n-mid];
		for(int i=0;i<mid;i++) {
			l[i] = arr[i];
		}
		for(int i=mid;i<n;i++) {
			r[i-mid] = arr[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n-mid);
		System.out.println("Before Merge: "+ Arrays.toString(l)+" "+Arrays.toString(r));
		merge(arr, l, r, mid, n-mid);
	}
	
	public static void merge(Integer[] arr, Integer[] l,Integer[] r, int left, int right) {
		int i=0,j=0,k=0;
		while(i<left && j<right) {
			if(l[i]<=r[j]) {
				arr[k]=l[i];
				i++;
			}
			else {
				arr[k]=r[j];
				j++;
			}
			k++;
		}
		
		while(i<left) {
			arr[k] = l[i];
			i++;
			k++;
		}
		while(j<right) {
			arr[k] = r[j];
			j++;
			k++;
		}
		System.out.print("Merged: ");
		printArr(arr," ");
	}
	public static void insertionSortRecursion(Integer[] arr) {
		insertionSortRecursion(arr, arr.length-1);
	}
	public static void insertionSortRecursion(Integer[] arr, int n) {
		if(n<1)
			return;
		insertionSortRecursion(arr, n-1);
		
		int key = arr[n];
		int j=n-1;
		while(j>=0 && arr[j]>key) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1]=key;
	}
	
	
	// Insert smallest to accurate position of left sub array 
	public static void insertionSort(Integer[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	public static void recursiveBubbleSort(Integer[] arr) {
		recursiveBubbleSort(arr, arr.length);
	}
	
	public static void recursiveBubbleSort(Integer[] arr, int n) {
		if(n==1)
			return;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1])
				swap(arr, i, i+1);
		}
		recursiveBubbleSort(arr, n-1);
	}
	
	public static void swap(Integer[] arr, int f, int s) {
		int temp = arr[f];
		arr[f] = arr[s];
		arr[s] = temp;
	}
	public static void selectionSortStr(String[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			
			String str = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = str;
		}
	}
	
	// Worst if array is reverse sorted --> O(n*n) time
	public static void bubbleSort(Integer arr[]) {
		int n = arr.length;
		int temp;
		boolean swapped=false;
		for(int i=0;i<n-1;i++) {
			swapped=false;
			//Here we use n-i because at the end of each iteration the biggest value will be placed to the last position of array
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped=true;
				}
			}
			// Just to improve bubblesort slightly but still the timecomplexity is O(n^2)
			if(!swapped) {
				break;
			}
		}
		
		printArr(arr," ");
	}
	
	// Selection sort maintains two sub arrays left and right, left sub array where it keeps sorted element and right sub array where it keeps yet to be sorted elements
	// It only requires O(1) auxiliary space--> But it takes O(n*n) time
	public static void selectionSort(Integer arr[]) {
		
		int n = arr.length;
		// As it compares the left element to the right element, we use n-1 instead n
		for(int i=0;i<n-1;i++) {
			int min_index=i;
			// here we took i+1 as we are comparing next element
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index = j;
				}
			}
			// We swap the element
			int temp = arr[min_index]; // Here temp is auxiliary space O(1)
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
		//printArr(arr);
	}
	
	public static void printArr(Object arr[], String delimeter) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+delimeter);
		}
		System.out.println();
	}

}
