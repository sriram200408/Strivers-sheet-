package LinkedLists.LinkedLists2D;

public class Node {
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
