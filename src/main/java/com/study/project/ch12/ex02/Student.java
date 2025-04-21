package com.study.project.ch12.ex02;

/**
 * 클래스명: Student
 *
 * 📌 설명:
 * - 이 클래스는
 * - 주요 기능: 학생 번호와 이름으로 HashCode를 생성하고, 학생 번호와 이름이 동일할 경우에만 equals()가 true를 return
 *
 * 🧠 학습 목적:
 * - 동등 객체 비교 를 확인해 본다.
 *
 * 🕒 작성일: 2025-04-19
 * 👤 작성자: kimdongho
 */
public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
    public int getNo() {return no;}
    public String getName() {return name;}

    /**
     *  Object의 hashCode()를 재정의 하여
     *  학생 번호와 이름 HashCode를 합한 새로운 해시코드를 return
     *  (번호와 이름이 같으면 동일한 해시코드가 생성됨)
     * */
    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }


    /**
     * Object의 equals() 메소드를 재정의해서 Student 객체인지를 확인하고,
     * 학생 번호와 이름이 같으면 true를 return
     * */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target) {
            if(no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
}
