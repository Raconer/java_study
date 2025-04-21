package com.study.project.ch13.ex04;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();

        /*
         실행 결과
         -----------------------
            전등을 켭니다.
            자동차가 달립니다.
         -----------------------
        */
    }
}
