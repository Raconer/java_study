## ✅ Override와 Overload 차이 정리

Java에서 메서드를 재정의하거나 같은 이름으로 여러 개 정의할 수 있는 기능은 다음과 같이 나뉩니다.

---

### 🔁 Override (오버라이드)

- **정의**: 상위 클래스(부모 클래스)의 메서드를 하위 클래스(자식 클래스)에서 **재정의**하여 사용하는 것
- **조건**:
    - 메서드 이름, 매개변수, 반환형이 **완전히 같아야 함**
    - `@Override` 어노테이션을 붙여 사용 권장 (실수 방지)
- **사용 목적**: 부모 클래스의 기능을 그대로 쓰지 않고 **자식 클래스에서 맞게 바꾸어 사용**할 때

#### ✅ 예시:

```java
class Animal {
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("강아지가 멍멍 짖습니다.");
    }
}
```

---

### ➕ Overload (오버로드)

- **정의**: 같은 이름의 메서드를 **매개변수의 타입이나 개수만 다르게 하여 여러 개 정의**하는 것
- **조건**:
    - 메서드 이름은 같아야 함
    - 매개변수의 타입, 개수, 순서 중 하나라도 달라야 함
- **사용 목적**: 하나의 이름으로 다양한 입력에 대응하는 메서드를 만들 때

#### ✅ 예시:

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

### 📝 정리 표

| 항목         | Override                           | Overload                             |
|--------------|------------------------------------|--------------------------------------|
| 대상         | 부모 클래스의 메서드              | 같은 클래스 내의 메서드             |
| 메서드 이름  | 같음                               | 같음                                 |
| 매개변수     | **완전히 동일**해야 함             | **다르게** 정의해야 함               |
| 반환형       | 같아야 함                          | 달라도 무방함 (하지만 매개변수 다름 필수) |
| 어노테이션   | `@Override` 사용 권장               | 없음                                 |
| 목적         | 기능 재정의                        | 다양한 입력 처리                     |

---

> 💡 한 단어로 정리하면
> - **Override = 재정의 (상속 관계)**
> - **Overload = 중복 정의 (매개변수 다르게)**
