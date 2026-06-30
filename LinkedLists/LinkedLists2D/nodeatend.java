package LinkedLists.LinkedLists2D;
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

public class nodeatend {
    static Node deleteatend(Node head) {
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.next == null) {
                curr.next = null;
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    static Node deleteatstart(Node head) {
        Node curr = head;
        curr = head.next;
        curr.prev = null;
        head = curr;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node mover = new Node(arr[i]);
            mover.prev = temp;
            temp.next = mover;
            temp = mover;
        }
        Node atend = deleteatend(head);
        while (atend != null) {
            System.out.print(atend.data + " ");
            atend = atend.next;
        }
        System.out.println(" ");
        Node atstart = deleteatstart(head);
        while (atstart != null) {
            System.out.print(atstart.data + " ");
            atstart = atstart.next;
        }
    }

}
