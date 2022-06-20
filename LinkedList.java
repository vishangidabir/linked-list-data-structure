package com.bridgelabz;

public class LinkedList {
	Node head;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else if (head.next == null){
			head.next = newNode;
		}else {
			Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
		}
	}
	public void display() {
		if (head == null)
			System.out.println("No elements to display.");

		else {
			Node temp = head;
			while (temp != null) {

				if (temp.next != null)
					System.out.print(temp.data + " -> ");

				else

					System.out.println(temp.data);
				temp = temp.next;

			}
		}

	}
}
