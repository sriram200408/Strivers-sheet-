
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
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

class create2dlinkedlist {

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
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node list = create2dlinkedList(arr);
        while (list != null) {
            System.out.print(list.data + " ");
            list = list.next;
        }
        sc.close();

    }
}