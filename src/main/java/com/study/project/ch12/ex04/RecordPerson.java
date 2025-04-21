package com.study.project.ch12.ex04;

/**
 * 클래스명: Person2
 *
 * 📌 설명:
 * - 이 클래스는
 * - 주요 기능:
 *  - record를 선언 함으로서
 *    - private final 필드가 자동 생성
 *    - 생성자 및 Getter 메소드가 자동으로 추가
 *    - hashCode(), equals(), toString() 메소드를 재정의 하여 자동 추가
 * 🧠 학습 목적:
 * - Person Class와 비교하여 record 클래스의 사용 목적을 확인
 *
 * 🕒 작성일: 2025-04-19
 * 👤 작성자: kimdongho
 */
public record RecordPerson(String name, int age) {
}
