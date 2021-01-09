package com.cosmina.ch3.twoconstructors;

import com.cosmina.ch2.hello.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/app-context-annotation.xml");
        context.refresh();

        MessageProvider messageProvider = context.getBean("provider", MessageProvider.class);

        System.out.println(messageProvider.getMessage());
    }
}
