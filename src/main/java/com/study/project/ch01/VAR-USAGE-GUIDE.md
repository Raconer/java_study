# Java에서 `var` 사용 가이드

Java 10부터 도입된 `var` 키워드는 **지역 변수 타입 추론(Local Variable Type Inference)** 기능을 제공합니다. 
컴파일러가 변수의 타입을 자동으로 추론하여 코드 작성이 더 간결해집니다.

---

## ✅ `var`의 장점

1. **코드 간결성**  
   타입을 명시하지 않아도 되므로 코드가 더 간결해집니다.
   ```java
   var list = new ArrayList<String>();
   // 기존: ArrayList<String> list = new ArrayList<>();
   ```

2. **가독성 향상**  
   제네릭 타입이 복잡할 때 가독성이 더 좋아집니다.
   ```java
   var map = new HashMap<String, List<Integer>>();
   ```

3. **유지보수 용이성**  
   타입 변경 시 코드 수정이 더 간편해집니다.
   ```java
   var numbers = List.of(1, 2, 3); // 나중에 LinkedList로 쉽게 변경 가능
   ```

4. **불필요한 중복 제거**  
   선언과 초기화에서 타입이 중복되는 것을 줄일 수 있습니다.
   ```java
   var stream = list.stream();
   ```

---

## ❌ `var`의 단점

1. **타입이 불명확할 수 있음**  
   변수 선언만으로는 타입을 직관적으로 알기 어려울 수 있습니다.
   ```java
   var obj = getObject(); // 타입이 무엇인지 알기 어려움
   ```

2. **초기화 없이 사용 불가**  
   타입 추론이 필요하기 때문에 선언과 동시에 초기화가 필수입니다.
   ```java
   var num; // 컴파일 에러 발생
   num = 10;
   ```

3. **리터럴 사용 시 주의 필요**  
   `var x = 1;` → `int`로 추론, `var x = 1.0;` → `double`로 추론됩니다.

4. **가독성 저하 가능성**  
   너무 남용하면 오히려 코드 가독성을 해칠 수 있습니다.

---

## 🔍 `var`로 선언된 변수의 타입을 알아내는 방법

### 1. **`getClass()` 사용**
`int`와 같은 기본형은 `getClass()` 사용이 불가능하므로, `Object`로 캐스팅하여 확인합니다.

```java
var data = 20;
System.out.println(((Object) data).getClass().getName());
// 출력: java.lang.Integer
```

### 2. **IDE 기능 활용 (추천)**
- IntelliJ, Eclipse에서 `data` 변수 위에 마우스를 올리거나 `Ctrl`(`Cmd`) + 클릭 시 타입이 표시됩니다.

### 3. **`instanceof`로 확인**
```java
var data = 20;
Object obj = data;
System.out.println(obj instanceof Integer); // true
```

### 4. **컴파일 오류로 추론**
일부러 잘못된 메서드 호출로 타입을 추론할 수 있습니다.
```java
var data = 20;
data.substring(1); // 컴파일 에러 발생 -> String이 아님을 확인 가능
```

---

## ⚠️ 타입 추론 시 주의사항

| 코드 | 추론된 타입 |
|------|-------------|
| `var data = 20;` | `int` |
| `var data = 20L;` | `long` |
| `var data = 20.0;` | `double` |
| `var data = 20.0f;` | `float` |

---

## ✅ `var` 사용 추천 예시
```java
var name = "John";                     // 명확한 경우
var numbers = new ArrayList<Integer>(); // 명확한 경우
```

## ❌ `var` 사용 비추천 예시
```java
public Object process() {
    return "Hello"; // 리턴 타입이 Object지만 실제로는 String
}

var obj = process(); // obj가 Object인지 String인지 명확하지 않음
// 해결 방법
// String obj = (String) process();

```

---

## ✅ 결론
- 타입이 **명확하고 직관적**일 때만 `var` 사용
- 타입이 **불명확하거나 복잡**한 경우, 명시적인 타입 사용 권장
- `getClass()`나 IDE 기능을 적극 활용하여 타입 확인
- 공개 API에서는 `var` 사용을 지양

