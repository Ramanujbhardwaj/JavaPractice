package com.macys.reader;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Queue;

public class JavaTestPriorityQueue {

public static void main(String[] args) {
		
		//natural ordering example of priority queue
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
		Random rand = new Random();
		for(int i=0;i<7;i++){
			integerPriorityQueue.add(new Integer(rand.nextInt(100)));
		}
		
		for(int i=0;i<7;i++){
			Integer in = integerPriorityQueue.poll();
			
			System.out.println("Processing Integer:"+in);
		}
		
//		//PriorityQueue example with Comparator
//		Queue<Customer> customerPriorityQueue = new PriorityQueue<>(7, idComparator);
//		addDataToQueue(customerPriorityQueue);
//		
//		pollDataFromQueue(customerPriorityQueue);
		
	}
}
