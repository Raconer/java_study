package com.study.project.ch13.ex05;

import com.study.project.ch13.ex03.Tv;

public class Box<T> {
    public T content;

    // Box의 내용물이 같은지 비교
    public boolean compare(Box<T> other) {
        boolean result = this.content.equals(other.content);
        return result;
    }
}