package com.algorithms.minheap;

import java.util.Arrays;

public class MinHeap {
	private int capacity = 10;
	private int size = 0;
	private int[] heap;
	
	public MinHeap() {
		heap = new int[capacity];
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int peek() {
		if(isEmpty())
			throw new IllegalStateException();
		return heap[0];
	}
	
	public int remove() {
		if(isEmpty())
			throw new IllegalStateException();
		int min = heap[0];
		heap[0] = heap[size-1];
		size--;
		heapifyDown();
		return min;
	}
	
	public void add(int item) {
		ensureCapacity();
		heap[size] = item;
		size++;
		heapifyUp();
	}
	
	public void ensureCapacity() {
		if(size == capacity) {
			capacity *= 2;
			heap = Arrays.copyOf(heap, capacity);
		}
	}
	
	public void heapifyUp() {
		int index = size - 1;
		while (hasParent(index) && parent(index) > heap[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
	public void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index)) {
			int smallChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
				smallChildIndex = getRightChildIndex(index);
			}
			if(heap[index]<heap[smallChildIndex])
				break;
			else
				swap(index, smallChildIndex);
			index = smallChildIndex;
		}
	}
	
	private void swap(int indexOne, int indexTwo) {
		int temp = heap[indexOne];
		heap[indexOne] = heap[indexTwo];
		heap[indexTwo] = temp;
	}

	private boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}

	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}
	
	private int parent(int index) {
		return heap[getParentIndex(index)];
	}
	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;
	}
	
	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}
	
	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}
	
	private int leftChild(int index) {
		return heap[getLeftChildIndex(index)];
	}

	private int rightChild(int index) {
		return heap[getRightChildIndex(index)];
	}
}
