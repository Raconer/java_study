# 📘 리플렉션
📘 > 📝 > 🔷 > 📍

> Java는 클래스와 인터페이스의 메타 정보를 Class 객체로 관리 한다.<br/>
> 메타정보
> * 패키지 정보
> * 타입정보
> * 멤버(생성자, 필드, 메소드)
> <br/>
> 이러한 메타 정보를 프로그램에서 읽고 수정하는 행위를 리플렉션 이라고 한다.

```java
 // 프로그램에서 Class 객체를 얻으려면 다음 3가지 방법중 하나를 이용

 // 클래스로부터 얻는 방법
 Class clazz = 클래스이름.class;
 Class clazz = Class.forName("패키지...클래스 이름");
 // 객체로 부터 얻는 방법
 Class clazz = 객체참조변수.getClass();
```
## 📝 패키지와 타입 정보 얻기

| 메소드                    | 용도               |
|------------------------|------------------|
| Package getPackage()   | 패키지 정보 읽기        |
| String getSimpleName() | 패키지를 제외한 타입 이름   |
| String getName()       | 패키지를 포함한 전체 타입이름 |


## 📝 멤버 정보 얻기
| 메소드                                     | 용도        |
|-----------------------------------------|-----------|
| Constructor[] getDeclaredConstructors() | 생성자 정보 읽기 |
| Field[] getDeclaredFields()             | 필드 정보 읽기  |
| Method[] getDeclaredMethods()           | 메소드 정보 읽기 |

## 📝 리소스 경로 얻기

| 메소드                                           | 용도                     |
|-----------------------------------------------|------------------------|
| URL getResource(String name)                  | 리소스 파일의 URL 리턴         |
| InputStream getResourcesAsStream(String name) | 리소스 파일의 InputStream 리턴 |