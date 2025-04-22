package com.tnsif.kprit.collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//Demo for linked list
public class DemoLinkedList {

	public static void main(String[] args) {

		//two ways of initialization 
		LinkedList<String> ll=new LinkedList();
		
		List l=new LinkedList();
		
		//adding of data
		ll.add("booby");
		ll.add("Vicent");
		ll.add("Swetha");
		ll.add("Abhi");
		ll.add("Swetha");
		ll.add(null);
		//ll.addFirst("Sam");
		//ll.addLast("Bindu");
		//ll.getFirst();
		//System.out.println(ll);
		
		//iterating through the linked list data structure
		
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println("The data is"+it.next());
		}
		
		System.out.println("The data after removing");
		ll.remove(2);
		for(String s:ll) {
			System.out.println("The data"+s);
		}
		
		Stack s=new Stack();
		s.push(10);
		s.push(23);
		s.push(2);
		s.push(45);
		//s.pop();
		System.out.println(s);
	}

}
