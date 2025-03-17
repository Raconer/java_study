# 리터럴 접미사


### ✅ Java 리터럴 접미사

| 접미사 | 의미 | 예시 |
|--------|------|------|
| `L` 또는 `l` | `long` 타입을 지정 | `long num = 100L;` |
| `F` 또는 `f` | `float` 타입을 지정 | `float num = 10.0f;` |
| `D` 또는 `d` | `double` 타입을 지정 (생략 가능) | `double num = 10.0d;` 또는 `double num = 10.0;` |


## 🔍 사용 예시

1. 정수
```java
// 정수 리터럴 (기본값은 int)
int intNum = 100;

// long 타입 리터럴 (L 또는 l 사용)
long longNum = 100L;

// float 타입 리터럴 (F 또는 f 사용)
float floatNum = 10.5f;

// double 타입 리터럴 (D 또는 d 사용, 기본값은 double이므로 생략 가능)
double doubleNum1 = 10.5;
double doubleNum2 = 10.5d;
```

2. **`float`을 사용할 때는 접미사 `f` 필수**

```java
  float num = 3.14; // 오류 발생 (기본은 double)
  float num = 3.14f; // 정상
```

3. **`double`은 접미사 `d`가 기본값이므로 생략 가능**

```java
  double num = 3.14;   // 정상
  double num = 3.14d;  // 정상
```
