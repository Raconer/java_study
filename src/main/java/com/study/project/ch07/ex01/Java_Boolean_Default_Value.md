## Java에서 `boolean` 값을 명시하지 않으면?

Java에서 `boolean` 변수에 값을 명시하지 않으면, **변수가 선언된 위치**에 따라 기본값 적용 여부와 값이 달라집니다.

---

### 1. 멤버 변수 (클래스 필드)

클래스 내부에 선언된 `boolean` 변수는 **자동으로 `false`** 로 초기화됩니다.

```java
public class Example {
    boolean flag; // 명시적으로 값을 안 넣음

    public void printFlag() {
        System.out.println(flag); // false 출력
    }
}
```

---

### 2. 지역 변수 (메서드 내부)

메서드 내부에서 선언한 `boolean` 지역 변수는 **자동 초기화되지 않으며**, 값을 할당하지 않으면 **컴파일 에러**가 발생합니다.

```java
public void someMethod() {
    boolean flag; // 초기화 안 됨
    System.out.println(flag); // 컴파일 에러 발생
}
```

---

### ✅ 요약

| 변수 위치     | 자동 초기화 | 기본값   |
|---------------|--------------|----------|
| 멤버 변수     | O            | `false`  |
| 지역 변수     | X            | (컴파일 에러) |

> 💡 가능한 명시적으로 초기화하는 습관이 좋습니다!
