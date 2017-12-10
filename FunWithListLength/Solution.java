package Challenges.FunWithListLength;

public class Solution {
    static int length(Node head) {
        return head == null ? 0 : 1 + length(head.next);
    }

    class Node<T> {
        public Object data;
        public Node next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }
}
