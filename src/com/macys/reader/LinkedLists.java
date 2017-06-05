package com.macys.reader;

import java.util.Scanner;

public class LinkedLists {
	
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
    
    public static  Node insert(Node head,int data) {
        //Complete this method
    	
    	/*
    	 * First we are checking if the Node is null or not.
    	 * If Null than we are creating a new node with the data as input and the next node pointing to null.
    	 */
    	if(head == null){
    		return new Node(data);
    		/*
    		 * If we have a value in the next than the below condition is not met.
    		 * But if we dont have a value i.e. it is the last node than we are creating a new node
    		 * with the same condition as above i.e. setting the node with data and pointing the next
    		 * node to null.
    		 */
    	}else if(head.next == null){
    		head.next = new Node(data);
    	}else{
    		/*
    		 * This is a recursive function where we are trying to get the last node
    		 * and than adding the value to the node and pointing the next node to null.
    		 */
    		insert(head.next, data);
    	}
    	
    	return head;
    }

}

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
