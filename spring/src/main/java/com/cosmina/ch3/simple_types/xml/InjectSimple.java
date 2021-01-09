package com.cosmina.ch3.simple_types.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimple {
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    @Override
    public String toString() {
        return "Person:" + "\n" +
                "name: " + name + "\n" +
                "age: " + age + "\n" +
                "height: " + height + "\n" +
                "programmer: " + programmer + "\n" +
                "ageInSeconds: " + ageInSeconds;
    }
}
