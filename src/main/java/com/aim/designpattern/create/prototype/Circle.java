package com.aim.designpattern.create.prototype;

public class Circle extends Shape{
    public Circle() {
        type = "circle";
    }

    @Override
    void draw() {
        System.out.println("circle draw()");
    }
}
