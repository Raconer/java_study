package com.study.project.ch13.ex07;

public class GenericExample {
    // 제한된 타입 파라미터를 갖는 제네릭 메소드
    public static <T extends Number> boolean compare(T t1, T t2){
        // T의 타입을 출력
        System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2 .getClass().getSimpleName()+ ")");

        // Number 메소드 사용
        double d1 = t1.doubleValue();
        double d2 = t2.doubleValue();
        return(d1 == d2);
    }

    public static void main(String[] args) {
        // 제네릭 메소드 호출
        boolean result1 = compare(10, 20);
        System.out.println(result1);
        System.out.println();

        // 제네릭 메소드 호출
        boolean result2 = compare(4.5, 4.5);
        System.out.println(result2);

        /*
         실행 결과
         -----------------------
            compare(Integer, Integer)
            false

            compare(Double, Double)
            true
         -----------------------
        */
    }
}
