package com.aim.designpattern.create.singleton;

/**
 * 饿汉式
 * 线程安全
 * 容易产生垃圾对象
 * 基于classloader避免多线程问题、可能有其它方式导致类装载
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("hello world");
    }
}
