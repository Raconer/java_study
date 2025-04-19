package com.study.project.ch07.ex05;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

    // stop는 오버라이딩 할수 없다.
}
