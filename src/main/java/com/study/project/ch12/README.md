# 📘 Chapter 12 java.base 모듈
📘 > 📝 > 🔷 > 📍
## 📝 12.1 API Document
> 자바 표준 모듈에서 제공하는 방대한 라이브러리를 쉽게 찾고 사용 방법이 기술된 API Document
* [API Document](https://docs.oracle.com/en/java/javase/index.html)

### 🔷 Document 찾는 3가지 방법
1. 웹사이트 메뉴 이용
   1. [All Modules] 탭에서 java.base 모듈을 클릭한다.
   2. java.base의 Package 목록에서 java.lang 패키지를 클릭한다.
   3. java.lang의 [All Classes and Interfaces] 탭에서 String 클래스를 클릭한다.
1. 웹사이트 검색 이요
   1. 오른쪽 상단의 Search 검색란에 "String"을 입력한다.
   2. 드롭다운 목록에서 java.lang.String 항복을 선택한다.
1. 이클립스 이용
   1. Java 코드에서 String 클래스를 마우스로 선택한 다음 "F1" 키를 누르면 Help 뷰가 나타난다.
   2. Help 뷰에서 Javadoc for "java.lang.String" 링크를 클릭하면 String 도큐 먼트롤 이동한다.

결과
![java.lang.String](./imgs/StringAPIDocument.png)

## 📝 문서 확인 하는법
### 🔷 1. 클래스 선언부 보기
확인 할수있는 내용
* 클래스가 final 인지 추상(abstract)인지
* 부모 클래스와 구현 인터페이스 확인
* 전체 상속 관계
### 🔷 2. 구성 멤버 보기
* 상단 메뉴 SUMMARY를 활용
  * 선언된 멤버별로 이동하는 링크 제공
    * 링크가 있으면 공개된 멤버가 있단는 뜻(public, protected)
    * 링크가 없으면 공개된 멤버가 없다는 뜻
* 멤버
    * NESTED : 중첩 클래스/중첩 인터페이스 목록으로 이동하는 링크
    * FIELD : 필드 목록으로 이동하는 리읔
    * CONSTR : 생성자 목록으로 이동하는 링크
    * METHOD : 메소드 목록으로 이동하는 링크
      * All Methods : 모든 메소드 목록을 보여준다.
      * Static Methods : 정적 메소드 목록을 보여준다.
      * Instance Methods : 인스턴스 메소드 목록을 보여준다.
      * Concrete Methods : 완전한 실행부를 갖춘 메소드 목록을 보여준다.
      * Deprecated Methods : 향후 제거될 메소드 목록을 보여준다.

## 📝 java.base 모듈
📍 정의
* 모든 모듈이 의존하는 기본 모듈
* 유일하게 requires(모듈 선언 키워드)하지 않아도 사용할 수 있다.
  * ```java
    module com.myapp {
        requires java.sql;
        requires com.fasterxml.jackson.databind;
    }
    ```
📍 java.base 모듈에 포함된 주요 패키지와 용도

| 패키지                                | 용도                                      |
|------------------------------------|-----------------------------------------|
| [java.lang](./readme/lang/Lang.md) | 자바 언어의 기본 클래스를 제공                       |
| java.util                          | 자료 구조와 관련된 컬렉션 클래스를 제공                  |
| java.text                          | 날짜 및 숫자를 원하는 형태의 문자열로 만들어 주는 포맷 클래스를 제공 |
| java.time                          | 날짜 및 시간을 조작하거나 연산하는 클래스를 제공             |
| java.io                            | 입출력 스트림 클래스를 제공                         |
| java.net                           | 네트워크 통신과 관련된 클래스를 제공                    |
| java.nio                           | 데이터 저장을 위한 Buffer 및 새로운 입출력 클래스 제공      |

* java.lang
  * Java 언어의 기본적인 클래스를 담고 있는 패키지
  * 이 패키지에 있는 클래스와 인터페이스는 import 없이 사용할 수 있다.
  * String, System, Integer, Double, Exception, RuntimeException
* java.util
  * Scanner







---
## 참고
* API : Application Programming Interface

