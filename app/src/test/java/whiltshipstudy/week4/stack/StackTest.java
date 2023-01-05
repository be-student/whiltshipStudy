package whiltshipstudy.week4.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    void stack_이_잘_작동한다() {
        // given
        Stack stack = new Stack(2);

        // when
        stack.push(1);
        stack.push(2);
        assertEquals(stack.pop(), 2);
        stack.push(2);

        // then
        // 스택이 꽉 찼다는 예외가 발생한다.
        assertThrows(StackOverflowError.class, () -> stack.push(3));
    }
}
