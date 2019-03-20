package com.algorithms.trees;

import java.util.ArrayList;

public class BinaryTreeDriver {

	public static void main(String[] args) {
/*		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);
		System.out.println("Spiral Order traversal of Binary Tree is ");
		tree.printSpiral(tree.root);
*/
		
		BinaryTree tree = new BinaryTree(); 
        /*tree.root = new Node(10); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(10); 
        tree.root.left.left = new Node(20); 
        tree.root.left.right = new Node(1); 
        tree.root.right.right = new Node(-25); 
        tree.root.right.right.left = new Node(3); 
        tree.root.right.right.right = new Node(4); 
        System.out.println("maximum path sum is : " + 
                            tree.findMaxSum()); 
        
        */
        
       /* System.out.println(tree.average(3,5,4,7));
        System.out.println(tree.average(3,5,4));
        tree.average(3);
        tree.average();*/
		tree.head = new TreeNode(1);
		tree.head.right = new TreeNode(2);
		System.out.println(tree.kthSmallest(tree.head, 2));
        
	}

}
