# 📘 System 클래스
📘 > 📝 > 🔷 > 📍
> 자바 프로그램은 JVM 위에서 실행되어 운영체제의 모든 기능을 자바 코드로 직접 접근하기란 어렵다<br/>
> 하지만 java.lang 에 속하는 System 클래스를 이용하면 운영체제 기능을 일부 이동 할수있다.<br/>
> ex) Syste 클래스 정적 필드와 메소드를 이용하면 프로그램 종료, 키보드 입력, 콘솔(모니터)출력, 현재 시간 읽기, 시스템 프로퍼티 읽기

<table>
    <tr>
        <th colspan="2">
            정적 멤버
        </th>
        <th>
            용도
        </th>
    </tr>
    <tr>
        <td rowspan="3">필드</td>
        <td>out</td>
        <td>콘솔(모니터)에 문자 출력</td>
    </tr>
    <tr>
        <td>err</td>
        <td>콘솔(모니터)에 에러 내용 출력</td>
    </tr>
    <tr>
        <td>in</td>
        <td>키보드 입력</td>
    </tr>
    <tr>
        <td rowspan="5">메소드</td>
        <td>exit(int status)</td>
        <td>프로세스 종료</td>
    </tr>
    <tr>
        <td>currentTimeMillis()</td>
        <td>현재 시간을 밀리초 단위의 long 값으로 리턴</td>
    </tr>
    <tr>
        <td>nanoTime()</td>
        <td>현재 시간을 나노초 단위의 long 값으로 리턴</td>
    </tr>
    <tr>
        <td>getProperty()</td>
        <td>운영체제와 사용자 정보 제공</td>
    </tr>
    <tr>
        <td>getenv()</td>
        <td>운영체제의 환경 변수 정보 제공</td>
    </tr>
</table>

## 📝 콘솔 출력
```java
public static void main(String[] args) {
    try{
        int value = Integer.parseInt("1oo");
    }  catch (NumberFormatException e){
        System.err.println("[에러내용]");
        System.err.println(e.getMessage());
    }
}
```
## 📝 키보드 입력
```java
    public static void main(String[] args) {
        int keyCode = System.in.read();
    }

```

## 📝 프로세스 종료

> 종료 상태값은 System에 설정되는 SecurityManager에서 활용되는데, 종료 상태값에 따라 특정 행위를 할 수 있도록 코딩할 수 있다.<br/>
> 하지만 java 17에서 SecurityManager가 Deprecated됨에 따라 사용 X

```java
    public static void main(String[] args) {
        /*
         * 0 : 정상 종료
         * 1 or -1 : 비정상 종료 
         * */
        int status = 0; 
        System.exit(status);
        System.exit(); // 강제 종료
    }
```

## 📝 진행 시간 읽기
> System 클래스의 currentTimeMillis() 메소드와 nanoTime() 메소드는 1970년 1월 1일 0시 <br/>
> 왜? 1970년 1월 1일 일까? 단순히 당분간 편리 할 것 같아서
> [Unix Tick Tocks to a Billion](https://www.wired.com/2001/09/unix-tick-tocks-to-a-billion/)

| 메소드                      | 용도                         |
|--------------------------|----------------------------|
| long currentTimeMillis() | 1/1000초 단위로 진행된 시간을 return |
| long nanoTime()          | 1/10^9초 단위로 진행된 시간을 return |

## 📝 시스템 프로퍼티 읽기
> 프로퍼티란?
> 자바 프로그램이 시작될 때 자동으로 설정되는 시스템의 속성
