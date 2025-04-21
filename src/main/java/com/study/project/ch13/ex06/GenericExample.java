package com.study.project.ch13.ex06;

public class GenericExample {

    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        // 제네릭 메소드 호출
        Box<Integer> box = new Box<>();
        int intValue = box.get();
        System.out.println(intValue);

        // 제네릭 메소드 호출
        Box<String> box2 = new Box<>();
        String stringValue = box2.get();
        System.out.println(stringValue);

        /*
         실행 결과
         -----------------------
            100
            홍길동
         -----------------------
        */
    }
}
