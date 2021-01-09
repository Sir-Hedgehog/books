package com.cosmina.ch3.collections.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionInjectionRun {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/ch3/collection-inject-annotation.xml");
        ctx.refresh();

        CollectionInjection instance = (CollectionInjection) ctx.getBean("injectCollection");
        instance.displayInfo();

        ctx.close();
    }
}
