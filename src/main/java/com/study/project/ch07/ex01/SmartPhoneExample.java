package com.study.project.ch07.ex01;

public class SmartPhoneExample {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // Phone 으로 부터 상속 받은 필드
        System.out.println("모델 : " +  myPhone.model);
        System.out.println("색상 : " +  myPhone.color);

        // SmartPhone의 필드 읽기
        System.out.println("와이파이 상태 : " + myPhone.wifi);

        // Phone 으로부터 상속받은 메소드
        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~~ 네 반갑습니다.");
        myPhone.hangUp();

        // SmartPhone의 메소드
        myPhone.setWifi(true);
        myPhone.internet();

        /*
        * 모델 : 갤럭시
        * 색상 : 은색
        * 와이파이 상태 : false
        * 벨이 울립니다.
        * ...대화내용
        * 전화를 끊습니다.
        * 와이파이 상태를 변경했습니다.
        * 인터넷에 연결합니다.
        */
    }
}
