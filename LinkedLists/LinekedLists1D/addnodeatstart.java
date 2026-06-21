package LinkedLists;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data2) {
        this.data = data2;
        this.next = null;
    }

}

public class addnodeatstart {
    static Node insertfirst(Node head, int data) {
        Node curr = new Node(data);
        curr.next = head;
        head = curr;
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
        Node ans = insertfirst(head, 24);
        while (ans != null) {
            System.out.println(ans.data + " ");
            ans = ans.next;
        }
    }
}
