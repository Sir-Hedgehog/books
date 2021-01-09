package com.cosmina.ch3.twoconstructors;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TwoConstsRun {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/two-constructors-option.xml");
        context.refresh();
        ConstructorConfusion confusion = (ConstructorConfusion) context.getBean("constructorConfusion");
        System.out.println(confusion);
        context.close();
    }
}
