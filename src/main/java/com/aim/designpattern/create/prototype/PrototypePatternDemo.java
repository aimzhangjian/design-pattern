package com.aim.designpattern.create.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = ShapeCache.getShape("1");

    }
}
