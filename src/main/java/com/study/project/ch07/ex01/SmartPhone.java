package com.study.project.ch07.ex01;

public class SmartPhone extends Phone{
    public boolean wifi;
    public SmartPhone(String model, String color) {
        // Phone에서 상속 받은 필드
        this.model = model;
        this.color = color;
    }

     public void setWifi(boolean wifi) {
        this.wifi = wifi;
         System.out.println("와이파이 상태를 변경했습니다.");
     }

     public void internet(){
         System.out.println("인터넷에 연결 합니다.");
     }
}
