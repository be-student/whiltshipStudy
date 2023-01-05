package whiltshipstudy.week4.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class LinkedListTest {

    @Test
    void add_메서드는_노드를_추가한다() {
        // given
        ListNode head = new ListNode(1);
        ListNode nodeToAdd = new ListNode(2);
        int position = 1;

        // when
        ListNode result = head.add(head, nodeToAdd, position);

        // then
        assertEquals(result, head);
        assertEquals(result.next, nodeToAdd);
    }

    @Test
    void remove_메서드는_노드를_삭제한다() {
        // given
        ListNode head = new ListNode(1);
        ListNode nodeToAdd = new ListNode(2);
        int position = 1;
        head.add(head, nodeToAdd, position);

        // when
        ListNode result = head.remove(head, position);

        // then
        assertEquals(result, head);
        assertEquals(result.next, null);

        //when
        result = result.remove(result, 0);
        assertEquals(result, null);
    }

    @Test
    void contains_메서드는_노드가_포함되어있는지_체크한다() {
        // given
        ListNode head = new ListNode(1);
        ListNode nodeToAdd = new ListNode(2);
        int position = 1;
        head.add(head, nodeToAdd, position);

        // when
        boolean result = head.contains(head, nodeToAdd);

        // then
        assertEquals(result, true);
        assertFalse(head.contains(head, new ListNode(3)));
    }
}
