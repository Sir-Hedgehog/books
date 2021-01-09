package com.cosmina.ch3.collections.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionInjectionRun {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/collection-inject-xml.xml");
        context.refresh();

        CollectionInjection instance = (CollectionInjection) context.getBean("injectCollection");
        instance.displayInfo();

        context.close();
    }
}
