package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Linked List program");
		LinkedList list = new LinkedList();
        System.out.println("Adding elements");
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        list.display();
	}
}