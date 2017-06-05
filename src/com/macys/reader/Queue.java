package com.macys.reader;

import java.util.LinkedList;
import java.util.Stack;

public class Queue {

	@SuppressWarnings("rawtypes")
	LinkedList queue;
	
	/*
	 * Making a Queue instance
	 */
	@SuppressWarnings("rawtypes")
	public Queue(){
		queue = new LinkedList();
	}
	
	/*
	 * Is our Queue Empty
	 */
	public boolean isEmpty(){
		
		return queue.isEmpty();
		
	}
	
	/*
	 * Returning the Size
	 */
	public int size(){
		return queue.size();
	}
	
	/*
	 * ENqueuing an item
	 */
	public void enQueue(int n){
		queue.addLast(n);
		
	}
	
	/*
	 * Dequeuing the first object everytime.
	 */
	public int deQueue(){
		return (int)queue.remove(0);
	}
	
	/*
	 * Peek at the first item
	 */
	public int peek(){
		
		return (int)queue.get(0);
	}
	
	
	public static void main(String arg[]){
		Queue qw = new Queue();
		qw.enQueue(5);
		qw.enQueue(6);
		qw.enQueue(7);
		
		
		Stack<Integer> aStack = new Stack<Integer>();
		aStack.push(7);
		aStack.push(6);
		aStack.push(5);
		System.out.println(qw.size());
		
		for(int i=0; i <= qw.size(); i++){
			if(qw.deQueue() == aStack.pop())
				System.out.println("Same");
			else
				System.out.println("Different");
		}
		
	}
}
