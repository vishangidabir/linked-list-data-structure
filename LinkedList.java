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

	// Method to append element at desired position
	public void appendingNode(int before, int data) {
		Node currentNode = head;
		while (currentNode.data != before) {
			currentNode = currentNode.next;
		}
		Node node = new Node(data);
		node.next = currentNode.next;
		currentNode.next = node;

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

	// Method to delete any node
	public void deleteAnyNode(int data) {
		Node currentNode = head, previousNode = head;
		while (currentNode != null) {
			if (currentNode.data == data) {
				previousNode.next = currentNode.next;
			}
			previousNode = currentNode;
			currentNode = currentNode.next;
		}
	}

	// Method to print the list in ascending order
	public void ascendingOrder() {
		Node currentNode = head, index;
		if (currentNode == null) {
			System.out.println("List is empty");
		}
		while (currentNode != null) {
			index = currentNode.getNext();
			while (index != null) {
				if (currentNode.getData() > index.getData()) {
					int temp = currentNode.getData();
					currentNode.setData(index.getData());
					index.setData(temp);
				}
				index = index.getNext();
			}
			currentNode = currentNode.getNext();
		}
	}
}