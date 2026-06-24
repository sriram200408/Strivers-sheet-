class Node {
    int data;
    Node prev;
    Node next;

    Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class reverselinkedlist {

    // O(n) time and O(n) space
    static Node reverselist(Node head) {
        Node curr = head.next;
        Node tail = head;
        tail.next = null;
        while (curr != null) {
            Node mover1 = new Node(curr.data);
            mover1.next = tail;
            if (curr.next == null) {
                tail.prev = null;
            }
            tail.prev = mover1;
            curr = curr.next;
            tail = mover1;

        }
        return tail;

    }

    // O(n) time and O(1) space
    static Node reverselist1(Node head) {
        Node curr = head;
        Node temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            if (curr.prev == null) {
                head = curr;
            }
            curr = curr.prev;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node mover = new Node(arr[i]);
            temp.next = mover;
            mover.prev = temp;
            temp = mover;
        }
        Node reverselist = reverselist(head);
        Node temp1 = reverselist;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
        System.out.println(" ");
        Node reverselist1 = reverselist1(reverselist);
        while (reverselist1 != null) {
            System.out.print(reverselist1.data + " ");
            reverselist1 = reverselist1.next;
        }

    }
}
