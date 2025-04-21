package com.study.project.ch12.ex05;

import lombok.Data;

/**
 * 클래스명: Member
 *
 * 📌 설명:
 * - 이 클래스는
 * - 주요 기능:
 *  - Member 클래스 정의
 * 🧠 학습 목적:
 * - Lombok 사용법
 *  - @Data가 추가하여 메소드 자동생성
 *      - Getter, Setter, hashCode(), equals(), toString()
 * 🕒 작성일: 2025-04-19
 * 👤 작성자: kimdongho
 */
@Data
public class Member {
    private String id;
    private String name;
    private int age;
}