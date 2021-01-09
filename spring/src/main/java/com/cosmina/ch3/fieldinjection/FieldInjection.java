package com.cosmina.ch3.fieldinjection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/field-app-context.xml");
        context.refresh();

        Singer singerBean = context.getBean(Singer.class);
        singerBean.sing();

        context.close();
    }
}
