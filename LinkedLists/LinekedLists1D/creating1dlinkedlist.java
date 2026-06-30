package LinkedLists.LinekedLists1D;

import java.util.Scanner;



public class creating1dlinkedlist {
    private static Node createlinkedlist(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp1 = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp2 = new Node(arr[i]);
            temp1.next = temp2;
            temp1 = temp2;
        }
        return head;
    }

    private static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node list = createlinkedlist(arr);
        traverse(list);
        sc.close();
    }

}
