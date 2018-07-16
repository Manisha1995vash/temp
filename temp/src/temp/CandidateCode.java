package temp;


	import java.io.*;
	import java.util.*;

	class Node 
	{
	    int key;
	    Node left, right;
	  
	    public Node(int key) 
	    {
	        this.key = key;
	        left = right = null;
	    }
	}

	public class CandidateCode {
	    
	    static Node root;
	    
	    static void delete(Node root, int i) {
	        if (root != null) {
	            delete(root.left, i);
	            if (root.key == i) {
	                root.left = null;
	                root.right = null;
	                return;
	            }
	            delete(root.right, i);
	        }
	    }
	    
	    static void createNode(int i, int parent[], Node created[]) {
	        if (created[i] != null) {
	            return;
	        }
	        
	        created[i] = new Node(i);
	        
	        if (parent[i] == -1) {
	            root = created[i];
	            return;
	        }
	        
	        if (created[parent[i]] == null) {
	            createNode(parent[i], parent, created);
	        }
	        
	        Node parentNode = created[parent[i]];
	        if (parentNode.left == null) {
	            parentNode.left = created[i];
	        } else {
	            parentNode.right = created[i];
	        }
	        
	    }
	    
	    static int getLeafCount(Node root) {
	        if (root == null) {
	            return 0;
	        }
	        if (root.left == null && root.right == null) {
	            return 1;
	        } else {
	            return getLeafCount(root.left) + getLeafCount(root.right);
	        }
	    }
	    
	    public static void main(String args[] ) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        Node created[] = new Node[n];
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int del = sc.nextInt();
	        for(int i = 0; i < n; i++) {
	            created[i] = null;
	        }
	        for(int i = 0; i < n; i++) {
	            createNode(i, arr, created);
	        };
	        
	        Node current = root;
	        delete(current, del);
	        
	        int count = getLeafCount(root);
	        System.out.println(count-1);
	   }
	}

