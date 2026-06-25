package LinkedLists.Mediumproblems;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class findmiddleoflist {
    static Node middle(Node head, int n) {
        Node hare = head;
        Node tortoise = head;
        if (n % 2 != 0) {
            while (hare.next != null) {
                hare = hare.next.next;
                tortoise = tortoise.next;
            }
        } else {
            while (hare.next.next != null) {
                hare = hare.next.next;
                tortoise = tortoise.next;
            }

        }
        return tortoise;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < n; i++) {
            Node mover = new Node(arr[i]);
            temp.next = mover;
            temp = mover;
        }
        Node middle = middle(head, n);
        System.out.println("middle element of linkedlist is " + middle.data);
        sc.close();
    }
}
