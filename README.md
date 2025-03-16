# Java Study 📚

**"이것이 자바다"** 책을 기반으로 자바를 공부하며 기록하는 저장소입니다.  
기본적인 예제 코드와 학습 내용을 정리해 나갈 예정입니다.

---

## 📦 개발 환경
- **Java Version:** JDK 17 ([다운로드 링크](https://www.oracle.com/java/technologies/downloads/#java21))
- **IDE :** IntelliJ IDEA 
- **Build Tool :** Gradle

## ✅ Intellij "--enable-preview"설정

> - Java에서 새롭게 제안되었지만, 아직 공식적으로 확정되지 않은 **실험적인 기능**입니다.
>   - 예: Java 21의 `String Templates`, `Unnamed Patterns` 등
> - Preview 기능은 기본적으로 비활성화되어 있어, **명시적으로 활성화**해야 합니다.
> - IntelliJ에서 `--enable-preview` 설정을 추가해야 **컴파일과 실행 모두 정상적으로 동작**합니다.
> - 이렇게 함으로써, **불안정성이나 예상치 못한 오류로부터 개발자를 보호**하려는 의도입니다.

### --enable-preview가 하는 일
- **컴파일 시**: Preview 기능을 사용한 코드를 허용
- **실행 시**: Preview 기능이 포함된 프로그램이 정상적으로 동작하도록 지원
- 이렇게 하지 않으면, IntelliJ는 경고 메시지를 띄우면서 Preview 기능을 사용할 수 없도록 차단합니다.

### 🔥 왜 IntelliJ에서 설정이 필요할까?
- 따라서 다음과 같은 이유로 직접 활성화해줘야 합니다.

- **컴파일러가 Preview 기능을 허용하도록 설정** → `--enable-preview`
- **런타임에서도 Preview 기능을 허용하도록 설정** → `--enable-preview`

```groovy
tasks.withType(JavaCompile).configureEach {
    options.compilerArgs += "--enable-preview"
}

tasks.withType(Test).configureEach {
    jvmArgs += "--enable-preview"
}
```
---

## 🚀 Java 21 주요 특징

* [공식 발표 문서](https://www.oracle.com/kr/news/announcement/ocw-oracle-releases-java-21-2023-09-19/?utm_source=chatgpt.com)
* [Oracle JDK 21 공식 문서](https://www.oracle.com/java/technologies/javase/21-relnote-issues.html)

### 1. 언어 기능

- **레코드 패턴(Record Patterns)**
    - 레코드 값을 분해(deconstruct)할 수 있게 되었습니다. 데이터 탐색과 처리를 선언적이고 조합 가능한 형태로 표현할 수 있습니다.

- **`switch`의 패턴 매칭(Pattern Matching for `switch`)**
    - `switch` 표현식과 문에서 패턴 매칭을 지원해서, 표현식을 여러 패턴과 비교하고 각 패턴에 따른 특정 동작을 안전하고 간결하게 표현할 수 있습니다.

### 2. 언어 기능 프리뷰

- **문자열 템플리트(String Templates) (Preview)**
    - 문자열 템플리트를 도입해서 리터리얼 텍스트와 내장된 표현식 및 템플리트 프로세서를 결합해서 특수한 결과를 생성할 수 있습니다.
    - ```java
        String name = "ChatGPT";
        int age = 3;
        String template = STR."Name: \{name}, Age: \{age}";
        System.out.println(template);  // 출력: Name: ChatGPT, Age: 3
        ```

- **이름 없는 패턴 및 변수(Unnamed Patterns and Variables) (Preview)**
    - 이름 없는 패턴과 변수를 도입해서, 패턴 매칭에서 특정 구성 요소를 무시하거나 사용되지 않는 로커변수나 매개변수를 명시적으로 표시할 수 있습니다.

### 3. API 기능 프리뷰

- **범위 지정 값(Scoped Values) (Preview)**
    - 스레드 로커 변수의 대안으로, 불변 데이터를 스레드와 작업 간에 안전하고 효율적으로 공유할 수 있도록 합니다.

- **시칭스 컨린션(Sequenced Collections)**
    - `SequencedCollection`, `SequencedSet`, `SequencedMap` 인터페이스를 도입해서 컨린션의 순서를 명시적으로 처리할 수 있도록 합니다.

- **외부 함수와 메모리 API (Preview)**
    - 자바 프로그램이 자바 호외의 코드를 호출하고, 자바 히프의 머리에 안전하게 접근할 수 있도록 합니다.

- **벡터 API (Incubating)**
    - 벡터 연산을 표현하기 위한 API를 도입해서, 고성능 벡터 계산을 런타임에 최적화된 방식으로 수행할 수 있도록 합니다.



