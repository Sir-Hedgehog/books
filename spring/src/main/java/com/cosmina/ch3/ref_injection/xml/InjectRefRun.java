package com.cosmina.ch3.ref_injection.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectRefRun {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/inject-ref-xml.xml");
        context.refresh();

        InjectRef injectRef = (InjectRef) context.getBean("injectRef");
        System.out.println(injectRef);

        context.close();
    }
}
