package linkedlist;

import base.Node;

import java.util.Random;

/**
 * @description:
 * @author: hejinlong
 * @create: 2018-11-08 10:22
 */
public class Solution {

    public static void main(String[] args) {
        Node list = constructList(10);
        printList(list);
        Node trversedList = trverseList(list);
        printList(trversedList);
    }

    public static Node trverseList(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static Node constructList(int length) {
        Node dummy = new Node();
        Node head = dummy;
        for (int i = 0; i < length; i++) {
             dummy.next = new Node(new Random().nextInt(100));
             dummy = dummy.next;
        }
        return head.next;
    }

    public static void printList(Node head) {
        System.out.println();
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }
}
