# 📘 포장 클래스
📘 > 📝 > 🔷 > 📍


> 포장 클래스란?<br/>
> 자바는 기본 타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체를 생성할 수 있다.<br/>
> 이런 객체를 포장 객체라고 한다.
> char, int는 각각 Character와 Integer인 것만 제외하고 기본 타입의 첫 문자를 대문자로 바꾼 이름을 가지고 있다.

| 기본 타입   | 포장 클래스    |
|---------|-----------|
| byte    | Byte      |
| char    | Character |
| short   | Short     |
| int     | Integer   |
| long    | Long      |
| float   | Float     |
| double  | Double    |
| boolean | Boolean   |

> 포장 객체는 포장하고있는 기본 타입의 값을 변경 할 수 없고, 단지 객체로 생성하는데 목적이 있다.<br/>
> 이런 객체가 필요한 이유는 컬렉션 객체 때문이다.<br/>
> 컬렉션 객체는 기본 타입의 값은 저장할 수 없고, 객체만 저장할 수 있다.

## 📝박싱과 언박싱

* 박싱 :  기본 타입 -> 포장 객체
* 언박싱 : 포장 객체 -> 기본 타입

```java
// 박싱
Integer obj = 100;
// 언박싱
int value = obj;    
int value2 = obj + 50; // obj는 50과 연산하기 전에 언박싱 된다.
```

```java
public class BoxingUnBoxingExample{
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;
        System.out.println("Value : " + obj.intValue());
        
        // UnBoxing
        int value = obj;
        System.out.println("Value : " + value);
        
        // 연산시 UnBoxing
        int result = obj + 100;
        System.out.println("result : " + result);
 
        /*
         실행 결과
         -----------------------
            Value : 100
            Value : 100
            result : 200
         -----------------------
        */
    }
}
```

## 📝 문자열을 기본 타입으로 변환
* 문자열을 기본 타입 값으로 변환 할때도 사용
* 대부분의 포장 클래스는 "parse + 기본 타입"명 으로 되어 있는 정적 메소드가 있다.

## 📝 포장 값 비교 
> 포장 객체는 내부 값을 비교하기 위해 == 와 != 연산자를 사용할 수 없다.<br/>
> 내부의 값을 비교하는 것이 아니라 포장 객체의 번지를 비교 하기 때문이다.

```java
    
    Integer obj1 = 300;
    Integer obj2 = 300;
    
    System.out.println(obj1 == obj2);

    /*
     실행 결과
     -----------------------
        false
     -----------------------
    */
```

### 🔷 예외 상황
> 포장 객체의 효율적 사용을 위해 다음 범위의 값을 갖는 포장 객체는 공유 된다.<br/>
> 다음 범위의 포장 객체는 ==, != 연산자로 비교할 수 있지만, 내부 값을 비교하는게 아니라 객체 번지를 비교한다.
 
| 타입               | 값의 범위           |
|------------------|-----------------|
| boolean          | true, false     |
| char             | \u0000 ~ \u007f |          
| byte, short, int | -128 ~ 127      |


### 🔷Tips
> 포장 객체에 정확히 어떤 값이 저장될 지 모르는 상황 이면 ==, !=는 사용하지 않은 것이 좋다.<br/>
> 대신 equals() 메소드로 내부 값을 비교 할수 있다.<br/>
> 포장 클래스의 equals() 메소드는 내부 값을 비교 하도록 재정의 되어 있다.






