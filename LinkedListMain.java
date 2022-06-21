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
        System.out.println("Searching element");
        linkedList.findNode(30);
        linkedList.toPrint();
        System.out.println("Element 40 added after node 30");
        linkedList.appendingNode(30 ,40);
        linkedList.toPrint();
        System.out.println("Element 40 deleted from list");
        linkedList.deleteAnyNode(40);
        linkedList.toPrint();

	}
}
