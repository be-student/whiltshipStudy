https://github.com/whiteship/live-study/issues/3

# 목표

자바가 제공하는 다양한 연산자를 학습하세요.

# 학습할 것

1. 산술 연산자
2. 비트 연산자
3. 관계 연산자
4. 논리 연산자
5. instanceof
6. assignment(=) operator
7. 화살표(->) 연산자
8. 3항 연산자
9. 연산자 우선 순위
10. (optional) Java 13. switch 연산자

# 산술 연산자

+, -, *, /, % 가 존재함
둘 중 하나가 부동 소수점이면 그쪽을 따라감
모든 연산은 한 줄로 표현되지만, 바이트코드상 여러개를 사용함

```
1+1 을 바이트코드로 표현하면
  L1
        LINENUMBER 7 L1
        ICONST_1
        ILOAD 1
        IADD
        ISTORE 2
```

# 비트 연산자

&, |, ^, ~, <<, >>, >>> 가 존재함
비트 단위로 연산을 수행함

```
int a = 0b00000000_00000000_00000000_00000001;
int b = 0b00000000_00000000_00000000_00000010;
System.out.println(a & b); // 0
System.out.println(a | b); // 3
System.out.println(a ^ b); // 3
System.out.println(~a); // -2
System.out.println(a << 1); // 2
System.out.println(a >> 1); // 0
System.out.println(a >>> 1); // 0
```

같은 것들이 있음
| or<br/>
& and<br/>
^ xor<br/>
~ not 2의 보수이기에 *-1 -1 의 역할을 함<br/>
<< left shift 공백은 0으로 채움<br/>
&gt; &gt; right shift 공백은 부호비트로 채움<br/>
&gt;&gt;&gt; unsigned right shift 공백은 0으로 채움
음수 shift 시에 주의하는 것이 필요함. 부호가 무너질 수 있음

# 관계 연산자

==, !=, &gt;, &lt;, &gt;=, &lt;= 가 존재함
비교 연산을 수행함

```
int a = 1;
int b = 2;
System.out.println(a == b); // false
System.out.println(a != b); // true
System.out.println(a > b); // false
System.out.println(a < b); // true
```

Object 끼리 비교할 때 ==은 주소값을 비교함
Integer 끼리 비교할 때 언박싱이 되는 경우가 있음

# 논리 연산자

&&, ||, ! 가 존재함
논리 연산을 수행함

```
boolean a = true;
boolean b = false;
System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(!a); // false
```

# instanceof

객체가 특정 타입인지 확인할 때 사용함
이때 타입은 클래스, 인터페이스, 배열 모두 가능함
그리고 상속 관계에 있는지도 확인할 수 있음
null 은 어떤 타입이든 false 를 반환함

reference 타입만 넣을 수 있음. 원시 타입의 경우 에러가 나옴
Generic 을 사용할 때도 instanceOf 를 사용할 수 있음
단 T 타입같은 경우에는 검사할 수 없음

```java
class Error {

    public static <T> void sort(List<T> collection) {
        if (collection instanceof List<String>) {
        }
    }
}
```

를 작성하면 예외가 발생함
그 이유는 T 타입이 String 이 아닐 수도 있기 때문임 컴파일 타임에 알 수 없음

# assignment(=) operator

=, +=, -=, *=, /=, %=, &=, |=, ^=, &lt;&lt;=, &gt;&gt;=, &gt;&gt;&gt;= 가 존재함
할당 연산을 수행함

# 화살표(->) 연산자

람다식을 사용할 때 사용함
-> 뒤에 바로 나오면 그 결과를 return 하고
-> 뒤에 { } 가 나오면 그 안에 있는 것을 실행함

```java
public class ArrowOperator {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello");
        runnable.run();
    }
}
```

FunctionalInterface 를 사용할 때 사용함

# 3항 연산자

조건식 ? true 일 때 : false 일 때
조건식이 true 일 때는 true 일 때의 값이 반환되고
조건식이 false 일 때는 false 일 때의 값이 반환됨

# 연산자 우선 순위

연산자 우선 순위는 다음과 같음

| 우선 순위 | 연산자 | 설명 |
| --- | --- | --- |
| 1 | () | 괄호 |
| 2 | ++, -- | 단항 연산자 |
| 3 | *, /, % | 곱셈, 나눗셈, 나머지 |
| 4 | +, - | 덧셈, 뺄셈 |
| 5 | &lt;&lt;, &gt;&gt;, &gt;&gt;&gt; | 비트 이동 |
| 6 | &lt;, &lt;=, &gt;, &gt;= | 비교 |
| 7 | ==, != | 비교 |
| 8 | & | 비트 AND |
| 9 | ^ | 비트 XOR |
| 10 | \| | 비트 OR |
| 11 | &amp;&amp; | 논리 AND |
| 12 | \|\| | 논리 OR |
| 13 | ?: | 3항 연산자 |
| 14 | =, +=, -=, *=, /=, %=, &=, |=, ^=, &lt;&lt;=, &gt;&gt;=, &gt;&gt;&gt;= | 할당 |
| 15 | -&gt; | 람다식 |

# optional

null 반환시 null pointer exception 발생을 방지하기 위해 사용함

optional 은 null 이 될 수 있는 객체를 감싸는 래퍼 클래스임
null 이 될 수 있는 객체를 감싸서 null 이 될 수 없는 객체로 만들어줌
empty() 를 사용하면 빈 optional 을 만들 수 있음
of() 를 사용하면 null 이 아닌 객체를 감싸서 optional 을 만들 수 있음
ofNullable() 을 사용하면 null 이 될 수 있는 객체를 감싸서 optional 을 만들 수 있음
get() 을 사용하면 optional 에 담긴 객체를 꺼낼 수 있음
isPresent() 를 사용하면 optional 에 객체가 담겨있는지 확인할 수 있음
ifPresent() 를 사용하면 optional 에 객체가 담겨있으면 실행할 수 있음
orElse() 를 사용하면 optional 에 객체가 담겨있지 않으면 기본값을 반환함
orElseGet() 을 사용하면 optional 에 객체가 담겨있지 않으면 기본값을 반환함(이때는 함수를 사용함)

잘못 사용하면 NoSuchElementException 이 발생할 수 있음

```java
public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Hello");
        optional.ifPresent(s -> System.out.println(s));
        optional.ifPresent(System.out::println);
    }
}
```

Optional은 serializable이 안됨
가독성이 떨어짐
속도가 느림
공간이 더 많이 필요함

반환 타입을 위해서만 사용하는 것이 권장됨

stream에서
or() Optional을 바로 반환함

# switch

switch 문은 조건식의 결과에 따라 실행할 문장을 선택함

```java
class Switch {

    public static void main(String[] args) {
        switch (args[0]) {
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }
    }
}
```

같은 느낌으로 사용할 수 있음
break가 없으면 다음 case로 넘어감
