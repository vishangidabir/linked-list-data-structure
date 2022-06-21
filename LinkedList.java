package com.bridgelabz;

public class LinkedList {
	Node head;

	// Method to insert elements at first node in linked list
	public void addFirstNode(int data) {
		Node node = new Node(data);
		node.setData(data);
		node.setNext(head);
		head = node;
	}

	// Method to insert elements at last node in linked list
	public void addLast(int data) {
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node node = new Node(data);
		node.setData(data);
		currentNode.setNext(node);
	}

	// Method to print the list
	public void toPrint() {
		Node currentNode = head;
		while (currentNode != null) {
			currentNode.toPrint();
			currentNode = currentNode.next;
		}
	}

	// Method to insert the element in between the list
	public void addInBetween(int before, int after, int data) {
		Node currentNode = head;
		while (currentNode.data != before && currentNode.data != after) {
			currentNode = currentNode.next;
		}
		Node node = new Node(data);
		node.next = currentNode.next;
		currentNode.next = node;
	}

	// Method to delete the first element of the list
	public void deleteFirst() {
		Node currentNode = head;
		head = head.next;
	}

	// Method to delete the last element of the list
	public void deleteLast() {
		Node currentNode = head, secondLast = null;
		while (currentNode.next != null) {
			secondLast = currentNode;
			currentNode = currentNode.next;
		}
		if (secondLast != null) {
			secondLast.next = null;
		}
	}

	// Method to find the node
	public void findNode(int data) {
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.data == data) {
				System.out.println(data + " Element found in the list ");
			}
			currentNode = currentNode.next;
		}
	}
}