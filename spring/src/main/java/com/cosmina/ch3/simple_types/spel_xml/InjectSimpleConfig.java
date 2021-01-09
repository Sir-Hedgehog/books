package com.cosmina.ch3.simple_types.spel_xml;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {

    private String name = "Drobeiko Vasiliy";
    private int age = 32;
    private float height = 1.99f;
    private boolean programmer = false;
    private Long ageInSeconds = 1121212121L;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }
}
