package whiltshipstudy.week4.linkedlist;

public class ListNode {

    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        if (position == 0) {
            nodeToAdd.next = head;
            return nodeToAdd;
        }
        ListNode current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        nodeToAdd.next = current.next;
        current.next = nodeToAdd;
        return head;
    }

    public ListNode remove(ListNode head, int positionToRemove) {
        if (positionToRemove == 0) {
            return head.next;
        }
        ListNode current = head;
        for (int i = 0; i < positionToRemove - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

    public boolean contains(ListNode head, ListNode nodeTocheck) {
        ListNode current = head;
        while (current != null) {
            if (current == nodeTocheck) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
