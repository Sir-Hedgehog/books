package com.cosmina.ch3.simple_types.spel_annotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpel")
public class InjectSimpleSpel {

    @Value("#{injectSimpleConfig.name}")
    private String name;

    @Value("#{injectSimpleConfig.age + 1}")
    private int age;

    @Value("#{injectSimpleConfig.height}")
    private float height;

    @Value("#{injectSimpleConfig.programmer}")
    private boolean programmer;

    @Value("#{injectSimpleConfig.ageInSeconds}")
    private Long ageInSeconds;

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
