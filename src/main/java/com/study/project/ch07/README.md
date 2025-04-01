# 상속

## 상속 개념 (ex01)
* 상속은 부모가 자식에게 물려주는 행위
* 개발된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 중복되는 코드를 줄여 개발 시간을 단축
* extends로 작성하여 상속 받는다.
* Java는 다중 상속 X

```
 부모 클래스 =  field1 + method1
     ↓                ↓
 자식 클래스 = (field1 + method1) + field2 + method2
```

```java
    // EX_1
    public class A{
        int field1;
        void method1(){}
    }
    
    public class B extends A { // extends로 상속 받는다.
        String field2;
        void method2(){}
    }
    
    // 사용
    public static void main(String[] args) {
        B b = new B();
        
        b.field1 = 10; // A로 부터 상속 받은 필드와 메소드
        b.method1();

        b.field2 = "홍길동"; // B가 추가한 필드와 메소드
        b.method2();
    }
```

## 부모 생성자 호출
```
  스택 영역
  |변수| 자식 객체 주소 |
                ↓ 
            힙 영역  
            |자식 객체|
                |
               상속
                ↓
            |부모 객체|
```
```java
    자식클래스 변수 = new 자식클래스();
```

* 자식 객체를 생성하면 부모 객체가 먼저 생성된 다음 자식 객체가 생성된다.

### 부모 객체의 생성자는 어디서 호출된 것일까?
* 부모 생성자는 자식 생성자의 맨 첫 줄에 숨겨져 있는 super()에 의해 호출
* super()는 컴파일 과정에서 자동 추가되는데, 이것은 부모의 기본 생성자를 호출
* 만약 부모 클래스에 기본 생성자가 없다면 자식 생성자 선언에서 컴파일 에러가 발생
* 부모 클래스에 기본 생성자가 없다면 매개변수를 갖는 생성자를 직접 선언 해야한다.
```java 
    // 자식 생성자 선언
    public 자식클래스(){
        super(); // 생략 가능( 컴파일 시 자동 추가됨)
        super(매개변수); // 반드시 작성
    }
```

## 메소드 재정의(오버라이딩) (ex02)
* 부모 클래스에서 정의 되었지만 자식 클래스에 맞게 재정의 하는 것
* 규칙
  * 부모 메소드의 선언부(리턴 타입, 메소드 이름, 매개변수)와 동일 해야한다.
  * 접근 제한을 더 강하게 오버라이딩할 수 없다.(public -> private 변경 불가)
  * 새로운 예외를 throws할 수 없다.(예외는 10장에서 학습)

### @Override
> 자바는 개발자의 실수를 줄여주기 위해 정확히 오버라이딩이 되었는지 체크해주는 @Override 어노테이션을 제공
> @Override를 붙이면 컴파일 단계에서 정확히 오버라이딩 되었는지 체크 하고, 문제가 있다면 컴파일 에러를 출력한다.

### 부모 메소드 호출 (ex03)
> 메소드를 재 정의 하면, 부모 메소드는 숨겨지고 자식 메소드만 사용되기 때문에 비록 부모 메소드의 일부만 변경된다 하더라도
> 중복된 내용을 자식 메소드도 가지고 있어야한다. 예를 들어 부모 메소드가 100줄의 코드를 가지고있을 경우, 자식 메소드에서 1줄만 추가 하고 싶더라도 100줄의 코드를 자식 메소드에서 다시 작성해야한다.
> 하지만 Super을 사용하여 해결 가능

## final 클래스와 final 메소드
> 6장 11절에서 살펴 보았듯이, 필드 선언시에 final을 붙이면 초기값 설정 후 값을 변경할수 없다.
> 그렇다면 클래스와 메소드에 final을 붙이면 어떤 효과가 일어날까?
> final 클래스와 final 메소드는 상속과 관련이 있다.

### final 클래스 (ex04)
* 클래스를 선언할때 final 키워드를 class 앞에 붙이면 최종적인 클래스이므로 더 이상 상속할 수 없는 클래스가 된다.
* 즉 final클래스는 부모 클래스가 될 수 없어 자식 클래스를 만들 수 없다.
```java
    public final class 클래스{...}
    // 대표적인 예가 String 클래스이다. String 클래스는 다음과 같이 선언되어있다.
    public final class String{ ... }

    // 그래서 다음과 같이 자식 클래스를 만들수 없다.
    public class NewString extends String {} // XXXXXXX
```

### final 메소드 (ex05)
* 메소드를 선언할 대 final 키워드를 붙이면 이 메소드는 최종적인 메소드이므로 오버라이딩 할수 없다
* 즉. 부모 클래스를 상속해서 자식 클래스를 선언할 때, 부모 클래스에 선언된 final 메소드는 자식 클래스에서 재 정의 할수 없다.

## protected 접근 제한자 (ex6)
* public > protected > default > private

| 접근 제한자    | 제한 대상        | 제한 범위                  |
|-----------|--------------|------------------------|
| protected | 필드, 생성자, 메소드 | 같은 패키지이거나, 자식 객체만 사용가능 |

## 타입 변환
* 자동 타입 변환은 의미 그대로 자동적으로 타입 변환이 일어나는 것을 말한다.
* 자동 타입 변환은 다음과 같은 조건에서 일어난다.
* 자식은 부모의 특징과 기능을 상속받기 때문에 부모와 동일하게 취급 될수있다.
* 바로 위의 부모가 아니더라도 상속 계층에서 상위 타입이라면 자동 타입 변환 가능 (ex07)
```
       <-자동 타입 변환-
  부모타입 변수 = 자식타입 객체
```
```java
    /**
     * 고양이가 동물의 특징과 기능을 상속받았다면 고양이는 "고양이는 동물이다"가 성립한다. 
     **/
    Cat cat = new Cat();
    Animal animal = cat;
```
> 부모 타입으로 자동 타입 변환된 이후에는 부모클래스에 선언된 필드와 메소드만 접근이 가능하다<br>
> 비록 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정된다.<br>
> 그러나 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드가 호출 된다.<br>
> 이것은 다형성과 관련되었다.

## 강제 타입 변환
* 자식 타입은 부모 타입으로 자동 변환되만, 반대로 부모 타입은 자식 타입으로 자동 변환 되지 않는다.
* 대신 다음과 같이 캐스팅 연산자로 강제 타입 변환을 할 수 있다.
```
            <- 강제 타입 변환 -
  자식타입 변수 = (자식타입) 부모타입객체;
                // 캐스팅 연산자
```

### 그렇지만 부모 타입 객체를 자식 타입으로 무조건 강제 변환 할수 있는 것은 아니다.
* 자식 객체가 부모 타입으로 자동 변환 된후 다시 자식 타입으로 변환할대 강제 타입 변환 사용가능
```java
    Parent parent = new Child();
    Child child = (Child) parent;
```
#### 만약 자식 타입에 선언된 필드와 메소드를 고 갓용해야 한다면 강제 타입 변환을 해서 다시 자식 타입으로 변환해야 한다.
```java
  class childExample{
    public static void main(String[] args) {
        Parent parent = new child();
        parent.field1 = "xxx";
        parent.method();
        parent.method2();
        parent.field2 = "yyy"; // 불가능!!!
        parent.method3(); // 불가능!!!
        
        // field2, method3() Child필드와 메소드
        Child child = (Child) parent;
        child.field2 = "yyy"; // 가능!!! 
        child.method3(); // 가능!!!
    }
  }
```

## 다형성
* 사용 방법은 동일하지만 실행 결과가 다양하게 나오는 성질
* 다형성 = 자동 타입 변환 + 메소드 오버라이딩

### 필드 다형성
* 필드 타입(사용 방법)은 동일하지만 대입되는 객체가 달라져서 실행 결과가 다양하게 나올수 있는것

```java
 public class Car{
  // 필드 선언
  public Tire tire;

  public void run(){
   tire.rolle();
  }
 }
 public static void main(String[] args) {
  Car myCar = new Car();
  myCar.tire = new HankookTire();
  myCar.tire = new KumhoTire();
 }

 // 타이어 클래스
 public class Tire{
  public void roll(){
   System.out.println("회전 합니다.");
  }
 }

 public class HankookTire extends Tire{
  @Override
  public void rolle(){
   System.out.println("한국 타이어가 회전 합니다.");
  }
 }
 public class KumhoTire extends Tire{
  @Override
  public void rolle(){
   System.out.println("금호 타이어가 회전 합니다.");
  }
 }
```

### 매개변수 다형성
* 다형성은 필드 보다는 메소드를 호출할 때 많이 발생
 * 메소드가 클래스 타입의 매개변수를 가지고 있을 경우, 호출할 때 동일한 타입의 객체를 제공하는 것이 정석이지만 자식 객체를 제공할 수도 있다.

```java
 public classs Vehicle{
  public void drive(){
   // 메소드 선언
   System.out.println("차량이 달립니다.");
  }
 }

 public class Bus extends Vehicle {
  @Override
  public void run(){
   System.out.println("버스가 달립니다.");
  }
 }

 public class Taxi extends Vehicle {
  @Override
  public void run(){
   System.out.println("택시가 달립니다.");
  }
 }

 public classs Driver{
  // 메소드 선언 (클래스 타입의 매개변수를 가지고 있음)
  public void drive(Vehicle vehicle){
   // 메소드 선언
   System.out.println("차량이 달립니다.");
  }
 }

 public class DriverExample{
  public static void main(String[] args) {
   // Driver 객체 생성
   Driver driver = new Driver();

   // 매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
   Bus bus = new Bus();
   driver.drve(bus);

   // 매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
   Taxi taxi = new Taxi();
   driver.drve(taxi); 
  }
 }
```

## 객체 타입 확인
> 매개 변수의 다형성에서 실제로 어떤 객체가 매개 값으로 제공 되었는지 확인하는 방법

* 꼭 매개 변수가 아니더라도 변수가 참조하는 객체의 타입을 확인하고자 할때, instanceof 연산자를 사용

```java
 // `객체`의 타입과 `타입`이 같다면 true 그렇지 않으면 false
 boolean result = `객체` insteanceof `타입`;


 public void method(Parent parent){
  if(parent instanceof Child){
   Child child = (Child) parent; // 성공
  }
 }

 public void method(Parent parent){
  // Java 12 부터는 instanceof연산의 결과가 true일 경우, 우측 타입 변수를 사용 가능하여 강제 타입 변환이 필요 없다!!!
  if(parent instanceof Child child){
    // child 변수 사용가능!!!!
  }
 }
```
## 추상 클래스
* 실체 클래스 : 객체를 생성할 수 있는 클래스
* 추상 클래스 : 실체 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스
 * 실체 클래스의 부모 역할을 한다.

ex)
* Animal.class(추상 클래스)
 * Bird.class // 실체 클래스 (추상 클래스를 상속 받는다)
 * Insect.class  // 실체 클래스 (추상 클래스를 상속 받는다)
 * Fish.class   // 실체 클래스 (추상 클래스를 상속 받는다)

### 추상 클래스 특징
* 새로운 실체 클래스를 만들기 위한 부모 클래스로만 사용된다.
 * 즉. 추상 클래스는 extends 뒤에만 올수있다. 
* 실체 클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 new 연산자를 사용해서 객체를 직접 생성 불가
 * Animal animal =  new Animal(); X
* 필드, 메소드 선언 가능
 * 자식 생성자에서 super()로 추상 클래스 생성자가 선언 되기 때문에 생성자 필요   

### 추상 클래스 선언
```java
 // 클래스 선언에 abstract 추가
 public abstract class 클래스명 {
  
 }
```

#### 예시
```java
 public abstract class Phone{
  // 필드 선언
  String owner;

  // 생성자 선언
  Phone(String owner){
   this.owner = owner;
  }

  //메소드 선언
  void turnOn(){
   Systme.out.println("폰 전원을 켭니다.");
  }

  void turnOff(){
   Systme.out.println("폰 전원을 끕니다.");
  }
 }
```

### 추상 메소드와 재정의
* 재정의 상황
 * 공통 메소드를 뽑아내어 추상 클래스로 작성할 때
 * 메소드 선언부(리턴타입, 메소드명, 매개변수)만 동일 하고 실행 내용은 자식 클래스마다 달라야 하는 경우
  * ex) Animal을 선언하여 sound()메소드를 선언 하였지만 동물마다 울음소리가 다를경우
```java
 abstract 리턴타입 메소드명(매개변수...);

 public abstract class Animal {
  abstract void sound();
 }
```

## 봉인된 클래스(부모 클래스로 사용하지 맙시다~~~)
* 기본적으로 final 클래스를 제외한 모든 클래스는 부모 클래스가 될 수 있다.
* 그러나 Java15 부터는 무분별한 자식 클래스 생성을 방지 하기 위해 봉인된(sealed) 클래스가 도입

```java
 // Person의 자식 클래스는 Employee와 Manager만 가능 합니다~~
 public sealed class Person permits Employee, Manager { ... }

 // final 또는 non-sealed 키워드로 다음과 같이 선언 하고나 sealed 키워드를 사용해서 또 다른 봉인 클래스로 선언 해야 한다.
 public final class Employee extends Person{...} // final : 더 이상 상속 불가
 public non-sealed class Manager extends Person{...} // 봉인을 해제한다. 따라서 Manager는 다른 클래스에 상속이 가능하다.
 // public class Director extends Manager {...}
```
