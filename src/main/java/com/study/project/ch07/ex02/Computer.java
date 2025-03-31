package com.study.project.ch07.ex02;

public class Computer extends Calculator{

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer area circle");
        return Math.PI * r * r;
    }
}
