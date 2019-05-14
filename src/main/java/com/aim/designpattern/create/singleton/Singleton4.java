package com.aim.designpattern.create.singleton;

/**
 * 登记式/静态内部类
 * 懒加载
 * 多线程安全
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    private Singleton4(){}
    public static final Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
