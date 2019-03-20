package com.algorithms.linkedlist;

public class TestLL {

	public static void main(String[] args) {
		SortedLinkedList llist = new SortedLinkedList(); 
        /*Node new_node; 
        new_node = llist.newNode(5); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(10); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(7); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(3); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(1); 
        llist.sortedInsert(new_node); 
        new_node = llist.newNode(9); 
        llist.sortedInsert(new_node); 
        System.out.println("Created Linked List"); 
        llist.printList(); */
		/*Node result = null;
		result = llist.pushLast(result, new Node(1));
		result = llist.pushLast(result, new Node(2));
		result = llist.pushLast(result, new Node(3));
		result = llist.pushLast(result, new Node(4));
		Node n2 = null;
		n2 = llist.pushLast(n2, new Node(5));
		n2 = llist.pushLast(n2, new Node(1));
		n2 = llist.pushLast(n2, new Node(7));
		n2 = llist.pushLast(n2, new Node(8));
		//Node m = llist.getUnion(result, n2);
		Node m = llist.getIntersection(result, n2);
		*//*Node t = m;
		while(t!=null) {
			System.out.println(t.data);
			t = t.next;
		}*/
		llist.head = new Node(1);
		llist.head.next = new Node(2);
		llist.head.next.next = new Node(3);
		llist.head.next.next.next = new Node(4);
		llist.head.next.next.next.next = new Node(5);
		llist.printList(llist.reverseKGroup(llist.head, 2));
		//llist.printList(llist.swapPair1(llist.head));
		/*SortedLinkedList list2 = new SortedLinkedList();
		list2.head = new Node(2);
		list2.head.next = new Node(22);
		list2.head.next.next = new Node(23);
		list2.head.next.next.next = new Node(30);
		list2.head.next.next.next.next = new Node(37);
		//llist.head.next.next.next.next.next = llist.head.next.next;
		System.out.println(llist.detechLoop(llist.head));
		
		SortedLinkedList list3 = new SortedLinkedList();
		list3.head = new Node(3);
		list3.head.next = new Node(23);
		list3.head.next.next = new Node(24);
		list3.head.next.next.next = new Node(30);
		list3.head.next.next.next.next = new Node(57);*/
		
		/*llist.reverseLLRecursive(llist.head,null);
		llist.printList();*/
		//System.out.println(llist.getLength(llist.head));
		//llist.printList(llist.mergeKSortedRecursive(new Node[] {llist.head,list2.head,list3.head}));
		/*SortedLinkedList list4 = new SortedLinkedList();
		list4.head = new Node(1);
		list4.head.next = new Node(2);
		list4.head.next.next = new Node(3);
		list4.head.next.next.next = new Node(4);
		list4.head.next.next.next.next = new Node(5);
		list4.reverseLL2(list4.head, 2, 4);
		list4.printList(list4.head);*/
	}

}
