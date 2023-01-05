package whiltshipstudy.week4.queue;

import whiltshipstudy.week4.linkedlist.ListNode;

public class LinkedQueue {

    private ListNode front;
    /**
     * The last node in the queue
     */
    private ListNode rear;

    /**
     * Add a node to the end of the queue
     *
     * @param value
     */
    public void enqueue(int value) {
        ListNode node = new ListNode(value);
        if (front == null) {
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
    }

    /**
     * Remove the first node in the queue
     *
     * @return
     */
    public int dequeue() {
        if (front == null) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        int value = front.value;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }
}
