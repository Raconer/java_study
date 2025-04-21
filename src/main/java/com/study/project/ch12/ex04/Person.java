package com.study.project.ch12.ex04;

/**
 * 클래스명: Person
 *
 * 📌 설명:
 * - 이 클래스는
 * - 주요 기능:
 *  - Person의 데이터(필드)를 읽기만 가능하도록 private final로 선언
 *  - 데이터(필드) 이름과 동일한 Getter 메도스(name(), age())를 선언
 *  - 동등 비교를 위해 hashCode(), equals()를 재정의
 *  - 의미 있는 문자열 출력을 위한 toString() 메소드 재정의
 *
 * 🧠 학습 목적:
 * - Recode Class를 비교하기 위한 클래스
 *
 * 🕒 작성일: 2025-04-19
 * 👤 작성자: kimdongho
 */
public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name(){return this.name;}
    public int age(){return this.age;}

    @Override
    public int hashCode() {
        return this.age + this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person target){
            if(target.name.equals(this.name)){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age;
    }
}
