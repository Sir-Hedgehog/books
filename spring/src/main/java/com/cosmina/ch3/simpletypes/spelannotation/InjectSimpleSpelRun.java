package com.cosmina.ch3.simpletypes.spelannotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimpleSpelRun {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/simple-type-spel-annotation.xml");
        context.refresh();

        InjectSimpleSpel simple = (InjectSimpleSpel) context.getBean("injectSimpleSpel");
        System.out.println(simple);
        context.close();
    }
}
