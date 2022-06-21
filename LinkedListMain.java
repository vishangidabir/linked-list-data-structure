package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Linked List program");

		LinkedList linkedList = new LinkedList();
		System.out.println("Linked list is :");
		linkedList.addFirstNode(56);
		linkedList.addLast(70);
		linkedList.toPrint();
		System.out.println("List after adding element in middle of the list is");
		linkedList.addInBetween(56, 70, 30);
		linkedList.toPrint();
		System.out.println("Linked list after deleting first element");
		linkedList.deleteFirst();
		linkedList.toPrint();

	}
}
