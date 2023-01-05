package whiltshipstudy.week4.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class LinkedQueueTest {

    @Test
    void enqueue_메서드는_큐에_값을_넣는다() {
        // given
        LinkedQueue queue = new LinkedQueue();

        // when
        queue.enqueue(1);
        queue.enqueue(2);
    }

    @Test
    void dequeue_메서드는_큐에서_값을_뺀다() {
        // given
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);

        // when
        assertEquals(queue.dequeue(), 1);
        assertEquals(queue.dequeue(), 2);

        // then
        // 큐가 비어있다는 예외가 발생한다.
        assertThrows(IndexOutOfBoundsException.class, () -> queue.dequeue());
    }
}
