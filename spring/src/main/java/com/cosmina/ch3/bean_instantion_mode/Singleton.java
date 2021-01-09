package com.cosmina.ch3.bean_instantion_mode;

public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
        //needed so developers cannot instantiate this class directly
    }
}
