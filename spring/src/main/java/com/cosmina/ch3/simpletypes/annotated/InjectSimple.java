package com.cosmina.ch3.simpletypes.annotated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimple {

    @Value("Peter Stallone")
    private String name;

    @Value("45")
    private int age;

    @Value("1.88")
    private float height;

    @Value("true")
    private boolean programmer;

    @Value("23232123213123")
    private Long ageInSeconds;

    @Override
    public String toString() {
        return "Person:" + "\n"
                + "name: " + name + "\n"
                + "age: " + age + "\n"
                + "height: " + height + "\n"
                + "programmer: " + programmer + "\n"
                + "ageInSeconds: " + ageInSeconds;
    }
}
