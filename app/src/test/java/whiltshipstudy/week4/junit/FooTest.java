package whiltshipstudy.week4.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@FooAnnotation
public class FooTest {

    @Test
    @DisplayName("서브테스트")
    void test() {
        System.out.println("FooTest");
    }
}
