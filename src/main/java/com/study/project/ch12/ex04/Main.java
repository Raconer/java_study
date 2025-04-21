package com.study.project.ch12.ex04;

public class Main {
    public static void main(String[] args) {
        RecordPerson recordPerson = new RecordPerson("눈송이", 22);
        System.out.println(recordPerson.name());
        System.out.println(recordPerson.name());
        System.out.println(recordPerson.toString());
        System.out.println("-------------------------");

        RecordPerson rp1 = new RecordPerson("눈송이", 22);
        RecordPerson rp2 = new RecordPerson("눈송이", 22);
        System.out.println("rp1.hashCode() = " + rp1.hashCode());
        System.out.println("rp2.hashCode() = " + rp2.hashCode());
        System.out.println("rp1.equals(rp2) = " + rp1.equals(rp2));
    }
}
