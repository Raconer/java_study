package com.study.project.ch07.ex03;

public class SupersonicAirplane extends Airplane{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly(){
        if(flyMode == SUPERSONIC){
            System.out.println("초음속을 비행합니다.");
        } else {
            super.fly();
        }
    }
}
