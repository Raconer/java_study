package com.study.project.ch12.ex01;



/**
 * 클래스명: Member
 *
 * 📌 설명: Member 객체의 동등 비교를 위해서 equals() 메소드를 재 정의 한다.
 * - 이 클래스는
 * - 주요 기능: Member 타입이면서 id 필드값이 같을 경우는 true를 return하고 그 외의 경우 모두 false를 return 한다.
 *
 * 🧠 학습 목적:
 * - 객체 동등 비교가 무엇인지 확인
 *
 * 🕒 작성일: 2025-04-19
 * 👤 작성자: kimdongho
 */
public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    // Object의 equals() 메소드를 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) { // obj가 Member 타입인지 검사하고 타입 변환후 target에 변수 대입
            if(id.equals(target.id)) { // id 문자열이 같은지 비교
                return true;
            }
        }
        return false;
    }

}
