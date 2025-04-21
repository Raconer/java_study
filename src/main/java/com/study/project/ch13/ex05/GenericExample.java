package com.study.project.ch13.ex05;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "100";

        Box<String> box2 = new Box<>();
        box2.content = "100";

        boolean result = box1.compare(box2);
        System.out.println("result : " + result);

        /*
         실행 결과
         -----------------------
            result : true
         -----------------------
        */
    }
}
