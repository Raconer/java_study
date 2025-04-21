package com.study.project.ch12.ex03;

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);
        System.out.println(myPhone);

        /*
         실행 결과
         -----------------------
            삼성전자, 안드로이드
            삼성전자, 안드로이드
         -----------------------
        */
    }
}
