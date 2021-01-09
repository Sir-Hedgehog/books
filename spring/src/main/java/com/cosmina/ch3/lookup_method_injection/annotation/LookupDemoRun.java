package com.cosmina.ch3.lookup_method_injection.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

import static com.cosmina.ch3.lookup_method_injection.annotation.LookupDemo.displayInfo;

public class LookupDemoRun {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/lookup-method-annotation.xml");
        context.refresh();

        DemoBean abstractBean = context.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standardBean = context.getBean("standardLookupBean", DemoBean.class);

        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);

        context.close();
    }
}
