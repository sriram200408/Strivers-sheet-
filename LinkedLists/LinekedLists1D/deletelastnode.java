package LinkedLists.LinekedLists1D;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class deletelastnode {
    static Node deletelast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            Node mover = new Node(arr[i]);
            temp.next = mover;
            temp = mover;
        }
        Node ans = deletelast(head);
        while (ans != null) {
            System.out.println(ans.data + " ");
            ans = ans.next;
        }

    }

}
