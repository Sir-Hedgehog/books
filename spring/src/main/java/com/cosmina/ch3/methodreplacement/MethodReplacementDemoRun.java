package com.cosmina.ch3.methodreplacement;

import org.springframework.context.support.GenericXmlApplicationContext;

import static com.cosmina.ch3.methodreplacement.MethodReplacementDemo.displayInfo;

public class MethodReplacementDemoRun {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/replacement-method.xml");
        context.refresh();

        ReplacementTarget replacementTarget = (ReplacementTarget) context.getBean("replacementTarget");
        ReplacementTarget standardTarget = (ReplacementTarget) context.getBean("standardTarget");

        displayInfo(replacementTarget);
        displayInfo(standardTarget);

        context.close();

    }
}
