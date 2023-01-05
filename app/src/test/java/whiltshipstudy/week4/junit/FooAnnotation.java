package whiltshipstudy.week4.junit;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.junit.jupiter.api.Tag;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Tag("FOO")
public @interface FooAnnotation {

}
