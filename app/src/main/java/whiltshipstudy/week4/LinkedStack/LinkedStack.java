package whiltshipstudy.week4.LinkedStack;

import whiltshipstudy.week4.linkedlist.ListNode;

public class LinkedStack {

    private ListNode top;

    public void push(int value) {
        ListNode node = new ListNode(value);
        node.next = top;
        top = node;
    }

    public int pop() {
        if (top == null) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        return value;
    }
}
