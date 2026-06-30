package LinkedLists.LinkedLists2D;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data, Node prev, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class insertnodeatstart {
    static Node insertatstart(int val, Node head) {
        Node temp = new Node(val);
        if (head == null)
            return temp;
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }

    static Node create2dlinkedList(int[] arr) {
        if (arr.length == 0)
            return null;
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node mover = new Node(arr[i]);
            temp.next = mover;
            mover.prev = temp;
            temp = mover;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        Node list = create2dlinkedList(arr);
        System.out.println("enter the value to insert at start");
        int val = sc.nextInt();
        Node newlist = insertatstart(val, list);
        while (newlist != null) {
            System.out.print(newlist.data + " ");
            newlist = newlist.next;
        }

        sc.close();

    }
}
