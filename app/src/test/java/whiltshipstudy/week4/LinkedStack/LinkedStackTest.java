package whiltshipstudy.week4.LinkedStack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class LinkedStackTest {

    @Test
    void stack_이_잘_작동한다() {
        // given
        LinkedStack stack = new LinkedStack();

        // when
        stack.push(1);
        stack.push(2);
        assertEquals(stack.pop(), 2);
        assertEquals(stack.pop(), 1);

        // then
        // 스택이 비어있다는 예외가 발생한다.
        assertThrows(IndexOutOfBoundsException.class, () -> stack.pop());
    }
}
