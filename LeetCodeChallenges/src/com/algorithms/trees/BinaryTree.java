package com.algorithms.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

class Res { 
    public int val; 
} 

public class BinaryTree {
	Node root;
	TreeNode head;
	
	public TreeNode sortedArrayToBST(int[] nums) {
		return sortedArrayToBST(nums, 0, nums.length-1);
    }
	
	public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
		if(left > right)
			return null;
		int mid = left + (right-left)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBST(nums, left, mid-1);
		node.right = sortedArrayToBST(nums, mid+1, right);
		return node;
	}
	
	public boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;
		int lTreeHeight = getHeight(root.left);
		int rTreeHeight = getHeight(root.right);
		if(Math.abs(lTreeHeight-rTreeHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right))
			return true;
		return false;
	}
	
	public int getHeight(TreeNode root) {
		if(root == null)
			return 0;
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		postorderTraversal(root, result);
		return result;
	}
	
	public void postorderTraversal(TreeNode root, List<Integer> result) {
		if(root == null)
			return;
		if(root.left != null) {
			postorderTraversal(root.left, result);
		}
		if(root.right != null) {
			postorderTraversal(root.right, result);
		}
		result.add(root.val);
	}
	
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		preorderTraversal(root, result);
		return result;
	}
	
	public void preorderTraversal(TreeNode root, List<Integer> result) {
		if(root == null)
			return;
		result.add(root.val);
		if(root.left != null) {
			preorderTraversal(root.left, result);
		}
		if(root.right != null) {
			preorderTraversal(root.right, result);
		}
	}
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		if (root.left == null)
			return minDepth(root.right) + 1;
		if (root.right == null)
			return minDepth(root.left) + 1;
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
	
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		if(p == null || q == null || p.val != q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
	
	public int kthSmallest(TreeNode root, int k) {
		if(root == null)
			return 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			TreeNode tn = q.poll();
			pq.add(tn.val);
			if(tn.left != null) {
				q.offer(tn.left);
			}
			if(tn.right != null) {
				q.offer(tn.right);
			}
			
			if(pq.size()>k) {
				pq.poll();
			}
		}
		return pq.poll();
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root == null) {
			return result;
		}
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		
		s1.push(root);
		List<Integer> levelList = new ArrayList<>();
		while(!s1.isEmpty() || !s2.isEmpty()) {
			levelList = new ArrayList<>();
			while(!s1.isEmpty()) {
				TreeNode tn = s1.pop();
				levelList.add(tn.val);
				if(tn.left != null) {
					s2.push(tn.left);
				}
				if(tn.right != null) {
					s2.push(tn.right);
				}
			}
			if(!levelList.isEmpty())
				result.add(levelList);
			levelList = new ArrayList<>();
			while(!s2.isEmpty()) {
				TreeNode tn = s2.pop();
				levelList.add(tn.val);
				if(tn.right != null) {
					s1.push(tn.right);
				}
				if(tn.left != null) {
					s1.push(tn.left);
				}
			}
			if(!levelList.isEmpty())
				result.add(levelList);
		}
		return result;
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		inorderTraversal(root, result);
		return result;
	}

	public void inorderTraversal(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		}

		if (root.left != null) {
			inorderTraversal(root.left, result);
		}
		result.add(root.val);
		if (root.right != null) {
			inorderTraversal(root.right, result);
		}
	}
	
	public boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
	}
	
	public boolean isMirror(TreeNode n1, TreeNode n2) {
		if(n1 == null || n2 == null) {
			return true;
		}
		if(n1 == null || n2 == null || n1.val!=n2.val) {
			return false;
		}
		return n1.val==n2.val && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
	}
	
	int findMaxSum() { 
        return findMaxSum(root); 
    } 
	public static List<Integer> getElementsAtKDistance(Queue<TreeNode> queue){
		List<Integer> result = new ArrayList<>();
		for(TreeNode n: queue) {
			result.add(n.val);
		}
		return result;
	}
	public static void fillNodeToParentMap(Map<TreeNode, TreeNode> map, TreeNode node, TreeNode parent) {
		if(node == null)
			return;
		map.put(node, parent);
		fillNodeToParentMap(map, node.left, node);
		fillNodeToParentMap(map, node.right, node);
	}
	public static List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
		if(root == null || target == null)
			return new ArrayList<>();
		if(K==0) {
			List<Integer> l = new ArrayList<>();
			l.add(target.val);
			return l;
		}
		
		Map<TreeNode, TreeNode> map = new HashMap<>();
		fillNodeToParentMap(map, root, null);
		Set<TreeNode> seen = new HashSet<>();
		seen.add(target);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(target);
		int currentDistance = 0;
		while(!queue.isEmpty()) {
			if(currentDistance == K) {
				return getElementsAtKDistance(queue);
			}
			int size = queue.size();
			for(int i=0;i<size;i++) {
				TreeNode n = queue.poll();
				if(n.left != null && !seen.contains(n.left)) {
					seen.add(n.left);
					queue.add(n.left);
				}
				if(n.right != null && !seen.contains(n.right)) {
					seen.add(n.right);
					queue.add(n.right);
				}
				
				TreeNode parentOfCurrentNode = map.get(n);
				if (parentOfCurrentNode != null && !seen.contains(parentOfCurrentNode)) {
					seen.add(parentOfCurrentNode);
					queue.offer(parentOfCurrentNode);
				}
			}
			currentDistance++;
		}
		return new ArrayList<>();	        
	}	
	
	boolean isSameTreeIterative(Node p, Node q) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(p);
		queue.add(q);
		while(!queue.isEmpty()) {
			Node n1 = queue.poll();
			Node n2 = queue.poll();
			if(n1 == n2 && n1==null)
				continue;
			if(n1 == null || n2 == null || n1.data != n2.data)
				return false;
			queue.add(n1.left);
			queue.add(n2.left);
			queue.add(n1.right);
			queue.add(n2.right);
		}
		return true;
	}
	
	boolean isSameTree(Node p, Node q) {
		if(p == null && q == null)
			return true;
		if(p == null || q == null || p.data != q.data)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		/*if(p == null || q == null)
			return p==q;
		return p.data == q.data && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);*/ 
	}
	boolean pathSum(Node node, int target) {
		if(node == null)
			return false;
		if(node.left == null && node.right == null && target - node.data == 0)
			return true;
		return pathSum(node.left, target-node.data) || pathSum(node.right, target-node.data);
	}
	
    // Returns maximum path sum in tree with given root 
    int findMaxSum(Node node) { 
  
        // Initialize result 
        // int res2 = Integer.MIN_VALUE; 
        Res res = new Res(); 
        res.val = Integer.MIN_VALUE; 
  
        // Compute and return result 
        findMaxUtil(node, res); 
        return res.val; 
    } 
	
    public double average(int... list) {
    	double result = 0.0;
    	
    	if(list.length != 0) {
    		int sum = 0;
    		for(int i: list) {
    			sum += i;
    		}
    		
    		result = (double)sum/list.length;
    	}
    	
    	return result;
    }
    
	int findMaxUtil(Node node, Res res) 
    { 
  
        // Base Case 
        if (node == null) 
            return 0; 
  
        // l and r store maximum path sum going through left and 
        // right child of root respectively 
        System.out.println(node.data);
        int l = findMaxUtil(node.left, res); 
        System.out.println("returned left : "+node.data);
        int r = findMaxUtil(node.right, res); 
        System.out.println("returned right : "+node.data);
        // Max path for parent call of root. This path must 
        // include at-most one child of root 
        int max_single = Math.max(Math.max(l, r) + node.data, 
                                  node.data); 
  
        System.out.println(node.data + " L : R "+l + " : "+r);
        // Max Top represents the sum when the Node under 
        // consideration is the root of the maxsum path and no 
        // ancestors of root are there in max sum path 
        int max_top = Math.max(max_single, l + r + node.data); 
  
        // Store the Maximum Result. 
        res.val = Math.max(res.val, max_top); 
  
        return max_single; 
    } 
	
	public int getMinDepth(Node node) {
		int result = 0;
		
		if(node == null) {
			return result;
		}
		
		LinkedList<Node> nodes = new LinkedList<>();
		LinkedList<Integer> counts = new LinkedList<>();
		
		nodes.add(node);
		counts.add(1);
		
		while(!nodes.isEmpty()) {
			Node n = nodes.remove();
			int count = counts.remove();
			
			if(n.left == null && n.right == null) {
				return count;
			}
			
			if(n.left != null) {
				nodes.add(n.left);
				counts.add(count+1);
			}
			
			if(n.right != null) {
				nodes.add(n.right);
				counts.add(count+1);
			}
		}
		
		return result;
	}
	
	void printSpiral(Node node) {
		if(node == null) {
			return;
		}
		
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		s1.push(node);
		
		while(!s1.isEmpty() ||!s2.isEmpty()) {
			
			while(!s1.isEmpty()) {
				Node temp = s1.pop();
				System.out.print(temp.data+" ");
				
				if(temp.right != null) {
					s2.push(temp.right);
				}
				
				if(temp.left != null) {
					s2.push(temp.left);
				}
			}
			
			while(!s2.isEmpty()) {
				Node temp = s2.pop();
				System.out.print(temp.data + " ");
				
				if(temp.left != null) {
					s1.push(temp.left);
				}
				
				if(temp.right != null) {
					s1.push(temp.right);
				}
			}
			
		}
		
	}
	
}
