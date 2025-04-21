package com.study.project.ch12.ex03;

/**
 * 클래스명: SmartPhone
 *
 * 📌 설명:
 * - 이 클래스는
 * - 주요 기능: toString을 재 정의 하여 제조사와 운영체제가 결합된 문자열을 return
 *
 * 🧠 학습 목적:
 * - toString 구조 파악
 *
 * 🕒 작성일: 2025-04-19
 * 👤 작성자: kimdongho
 */
public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + ", " + os;
    }
}
