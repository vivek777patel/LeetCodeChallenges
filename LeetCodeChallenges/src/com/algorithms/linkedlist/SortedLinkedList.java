package com.algorithms.linkedlist;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
class ListNode{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class SortedLinkedList {
	Node head;
	
	Node newNode(int data) {
		Node n = new Node(data);
		return n;
	}
	
	void sortedInsert(Node n) {
		
		Node current;
		
		if(head == null || head.data >= n.data) {
			n.next = head;
			head = n;
		}
		else {
			current = head;
			while(current.next != null && current.next.data < n.data) {
				current = current.next;
			}
			
			n.next = current.next;
			current.next = n;
			
		}
	}

	/*void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}*/
	
	public ListNode reverseKGroup(ListNode head, int k) {

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode begin = dummy;

		int i = 0;

		while (head != null) {
			i++;
			if (i % k == 0) {
				begin = reverse(begin, head.next);
				head = begin.next;
			} else {
				head = head.next;
			}
		}
		return dummy.next;
	}

	private ListNode reverse(ListNode begin, ListNode end) {

		ListNode curr = begin.next;
		ListNode prev = begin;
		ListNode first;
		ListNode next;
		first = curr;
		while (curr != end) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		begin.next = prev;
		first.next = curr;
		return first;
	}
	
	public Node reverseKGroup(Node head, int k) {
		if(head == null || head.next == null)
			return head;
		Node t = new Node(0);
		Node result = t;
		Node p1 = head;
		Stack<Integer> stack = new Stack<>();
		while(p1 != null) {
			for(int i=1; p1!=null && i<=k; i++) {
				stack.add(p1.data);
				p1 = p1.next;
			}
			if(stack.size() == k) {
				for(int i=1;i<=k;i++) {
					t.next = new Node(stack.pop());
					t = t.next;
				}
			}
		}
		Stack<Integer> tStack = new Stack<>();
		while(!stack.isEmpty()) {
			tStack.push(stack.pop());
		}
		while(!tStack.isEmpty()) {
			t.next = new Node(tStack.pop());
			t = t.next;
		}
		return result.next;
	}
	
	public Node swapPair1(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node result = new Node(0);
		Node t = result;
		Node p1 = head;
		Node p2 = head.next;
		while(p1 != null && p2 != null) {
			result.next = new Node(p2.data);
			result = result.next;
			result.next = new Node(p1.data);
			result = result.next;
			p1 = p2.next;
			p2 = p1.next;
		}
		if(p1 != null)
			result.next = new Node(p1.data);
		return t.next;
	}
	public Node swapPair(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node h = new Node(0);
		h.next = head;
		Node p1 = head;
		Node p2 = head.next;
		Node pre = h;
		while(p1 != null && p2 != null) {
			pre.next = p2;
			Node temp = p2.next;
			p2.next = p1;
			pre = p1;
			p1.next = temp;
			
			p1 = p1.next;
			if(temp!=null)
				p2 = temp.next;
		}
		return h.next;
	}
	
	public Node cloneLLRandomConstantSpace(Node root) {
		Node curr = root;
		Node next = null;
		while(curr!=null) {
			next = curr.next;
			Node n = new Node(curr.data);
			curr.next = n;
			n.next = next;
			curr = next;
		}
		curr = root;
		while(curr!=null) {
			if(curr.random!=null)
				curr.next.random = curr.random.next;
			curr = curr.next.next;
		}
		
		curr = root;
		Node cloned = new Node(0);
		Node dummy = cloned;
		while(curr!=null) {
			next = curr.next.next;
			// Append to cloned list
			dummy.next = curr.next;
			// changing the clone's next
			dummy = curr.next;
			// Restoring the original list
			curr.next = next;
			curr = next;
		}
		return cloned.next;
	}
	public Node cloneLLRandom(Node root) {
		Node curr = root;
		Map<Node, Node> map = new HashMap<>();
		
		while(curr != null) {
			map.put(curr, new Node(curr.data));
			curr = curr.next;
		}
		curr = root;
		while(curr != null) {
			map.get(curr).next = map.get(curr.next);
			map.get(curr).random = map.get(curr.random);
			curr = curr.next;
		}
		return map.get(root);
	}
	
	public Node mergeKSortedRecursive(Node[] nodes) {
		if(nodes == null || nodes.length<1)
			return null;
		return mergeKSortedRecursive(nodes,0,nodes.length-1);
		//return null;
	}
	public Node mergeKSortedRecursive(Node[] nodes, int left, int right) {
		if(left<right) {
			int mid = left + (right-left)/2;
			Node n1 = mergeKSortedRecursive(nodes,left,mid);
			Node n2 = mergeKSortedRecursive(nodes,mid+1,right);
			return merge(n1,n2);
		}
		
		return nodes[left];
	}
	public Node merge(Node n1, Node n2) {
		if(n1==null) return n2;
		if(n2==null) return n1;
		if(n1.data<n2.data) {
			n1.next = merge(n1.next,n2);
			return n1;
		}
		n2.next = merge(n1,n2.next);
		return n2;
	}
	public Node mergeKSortedListSolutioin2(Node[] nodes) {
		if(nodes == null || nodes.length<1)
			return null;
		// Takes log n time to insert elements, Here we dont need to have comparator
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(nodes.length);
		for(Node n: nodes) {
			while(n!=null) {
				queue.add(n.data);
				n = n.next;
			}
		}
		Node result = new Node(0);
		Node temp = result;
		
		while(!queue.isEmpty()) {
			temp.next = new Node(queue.poll());
			temp = temp.next;
		}
		return result.next;
	}
	public Node mergeKSortedList(Node[] nodes) {
		if(nodes == null || nodes.length<1)
			return null;
		PriorityQueue<Node> queue = new PriorityQueue<Node>(nodes.length, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if(o1.data>o2.data)
					return 1;
				else if(o1.data<o2.data)
					return -1;
				return 0;
			}
			
		});
		// Add the data in sorted order--> i.e. whichever node starts from smallest among all
		for(Node n: nodes) {
			if(n!=null)
				queue.add(n);
		}
		Node result = new Node(0);
		Node temp = result;
		
		while(!queue.isEmpty()) {
			temp.next = queue.poll();
			temp = temp.next;
			if(temp.next!=null)
				queue.add(temp.next);
		}
		return result.next;
	}
	
	// Add values to alternate position
	void merge(SortedLinkedList q) {
		
		Node pCurr = head;
		Node qCurr = q.head;
		
		Node pNext = null, qNext = null;
		
		while(pCurr != null && qCurr != null) {
			pNext = pCurr.next;
			qNext = qCurr.next;
			
			qCurr.next = pNext;
			pCurr.next = qCurr;
			
			pCurr = pNext;
			qCurr = qNext;
		}
	}
	// 1->2-3->-4->null , n=2
	Node removeNthFromEndSinglePass(Node node, int n) {
		Node fast=node;
		Node slow=node;
		for(int i=0;i<n;i++) {
			if(fast!=null)
				fast=fast.next;
			else return node;
		}
		if (fast == null) {
			head = head.next;
			return head;
		}
		while(fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		slow.next=slow.next.next;
		return node;
	}
	// 1->2-3->-4->null , n=2
	Node removeNthFromEnd(Node node, int n) {
		int len = getLength(head);
        int indexRemove = len-n+1;
        if(indexRemove==1)  
            return head.next;
        //1>2>3>4>5, n=2, indexRemove=4
		Node temp = head;
		for(int i=1;i<indexRemove-1;i++) {
			temp=temp.next;
		}
        if(temp!=null && temp.next!=null)
		    temp.next = temp.next.next;
        return node;
	}
	// 1->2-3->-4->null
	int getLength(Node node) {
		int count=0;
		while(node!=null) {
			count++;
			node = node.next;
		}
		return count;
	}
	
	Node reverseLL2(Node head, int m, int n) {
		if(head == null)
            return head;
        Node prev = null;
        Node curr = head;
        while(m > 1){
            prev = curr;
            curr = curr.next;
            m--;
            n--;
        }
        Node con = prev, tail = curr;
        Node third = null;
        while(n > 0){
            third = curr.next;
            curr.next = prev;
            prev = curr;
            curr = third;
            n--;
        }
        if(con != null)
            con.next = prev;
        else
            head = prev;
        tail.next = curr;
        return head;
	}
	Node reverseLLRecursive(Node curr, Node prev) {
		if(curr.next==null) {
			head = curr;
			curr.next = prev;
			return head;
		}
		Node next=curr.next;
		curr.next=prev;
		reverseLLRecursive(next, curr);
		return head;			
	}
	// 0-->1-->2-->3-->NULL
	Node reverseLL(Node n) {
		Node prev = null;
		Node curr = n;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		n = prev;
		return n;
	}
	
	boolean detechLoop(Node head) {
		Node slow = head, fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				return true;
		}
		return false;
	}
	
	Node getIntersection(Node head1, Node head2) {
		Node result = null;
		Node n1 = head1, n2 = head2;
		Set<Integer> duplicateCheck = new HashSet<>();
		while(n1 != null) {
			duplicateCheck.add(n1.data);
			n1 = n1.next;
		}
		
		while(n2 != null) {
			if(duplicateCheck.contains(n2.data))
				result = pushLast(result, n2);
			n2 = n2.next;
		}
		
		return result;
	}
	
	Node getUnion(Node head1, Node head2) {
		Node n1 = head1, n2 = head2;
		Node result = null;
		Set<Integer> duplicateCheck = new HashSet<>();
		while(n1 != null) {
			duplicateCheck.add(n1.data);
			result = pushLast(result,n1);
			n1 = n1.next;
		}
	
		while(n2 != null) {
			if(!duplicateCheck.contains(n2.data))
				result = pushLast(result,n2);
			n2 = n2.next;
		}
		return result;
	}
	
	Node pushLast(Node result, Node n1) {
		Node new_node = new Node(n1.data);
		/*new_node.next = head;
		head = new_node;*/
		Node temp = result;
		if(temp==null)
			return new_node;

		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = new_node;
		return result;
	}
	
	Node addReverseLL(Node n1, Node n2) {
		Node result = null;
		Node prev = null, temp = null;
		int carry=0,sum;
		
		while(n1 != null || n2 != null) {
			sum = carry + (n1!=null?n1.data:0) + (n2!=null?n2.data:0);
			carry = sum>=10 ? 1 : 0;
			sum = sum%10;
			temp = new Node(sum);
			
			if(result == null)
				result = temp;
			else
				prev.next = temp;
			
			prev = temp;
			
			if(n1!=null)
				n1 = n1.next;
			
			if(n2!=null)
				n2 = n2.next;
		}
		
		
		if(carry>0)
			temp.next = new Node(carry);
		
		return result;
	}
	
	int compare(Node n1, Node n2) {
		if(n1 == null && n2 == null) {
			return 0;
			// return 1; // Its a preference what you want to return
		}
		
		while(n1!=null && n2!=null && n1.data==n2.data) {
			n1 = n1.next;
			n2 = n2.next;
		}
		
		if(n1 != null && n2 != null) {
			return (n1.data>n2.data)?1:-1;
		}
		
		if(n1 != null && n2 == null) {
			return 1;
		}
		
		if(n1 == null && n2 != null) {
			return -1;
		}
		
		return 0;
	}
	
	// 0 1 2 3 4 5 6 7 --> delete 3
	void deleteNode(Node node, Node n) {
		if(node == n) {
			if(node.next == null) {
				System.out.println("Linkedlist can't be empty");
				return;
			}
			
			node.data = node.next.data;
			node.next = node.next.next;
			return;			
		}
		
		Node prev = node;
		while(prev.next != null && prev.next!=n) {
			prev = prev.next;
		}
		
		if(prev.next == null) {
			System.out.println("Given node not present");
			return;
		}
		prev.next = prev.next.next;
	}
	
	void printList(Node n) {
		
		Node temp = null;
		if(n==null)
			temp = head;
		else
			temp = n;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
}
