package com.study.project.ch07.ex05;

public class Car {
    public int speed;

    public void speedUp(){
        this.speed += 1;
    }

    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
