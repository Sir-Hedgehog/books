package com.cosmina.ch3.simple_types.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimpleRun {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/simple-type-annotation.xml");
        context.refresh();

        InjectSimple simple = (InjectSimple) context.getBean("injectSimple");
        System.out.println(simple);
        context.close();
    }
}
