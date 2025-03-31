package com.study.project.ch07.ex02;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calc = new Calculator();
        System.out.println("원 면적 : " + calc.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));
    }

    /*
        Calculating area of Circle
        원 면적 : 314.159

        Computer area circle
        원 면적 : 314.1592653589793
    */
}
