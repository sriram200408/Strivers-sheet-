package LinkedLists.Mediumproblems;

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

public class detectloopinlist {
    static void detectloop(Node head) {
        Node hare = head;
        Node tortoise = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
            if (hare == tortoise) {
                System.out.println("loop detected");
                return;
            }
        }
        System.out.println("loop not detected");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node mover = new Node(arr[i]);
            temp.next = mover;
            temp = mover;
            if (i == 4) {
                mover.next = head;
            }
        }
        detectloop(head);
    }
}