package com.study.project.ch07.ex03;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane su = new SupersonicAirplane();
        su.takeOff();
        su.fly();
        su.flyMode = SupersonicAirplane.SUPERSONIC;
        su.fly();
        su.flyMode = SupersonicAirplane.NORMAL;
        su.fly();
        su.land();
    }
}
