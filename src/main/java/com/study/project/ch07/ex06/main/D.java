package com.study.project.ch07.ex06.main;

import com.study.project.ch07.ex06.A;

public class D extends A {

    public D(){
        super();
    }

    public void method1(){
        this.field = "value";
        this.method();
    }

    // 안되는 경우
    public void method2(){
        // A a = new A();
        // a.field = "value";
        // a.method();
    }
}
