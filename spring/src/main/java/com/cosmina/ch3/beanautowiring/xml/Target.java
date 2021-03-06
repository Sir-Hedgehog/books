package com.cosmina.ch3.beanautowiring.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Target {
    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;

    public Target() {
    }

    public Target(Foo foo) {
        System.out.println("Target(Foo) called");
    }

    public Target(Foo foo, Bar bar) {
        System.out.println("Target(Foo, Bar) called");
    }

    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }

    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Property fooTwo set");
    }

    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/ch3/autowiring_mode_xml.xml");
        ctx.refresh();

        Target target = null;

        System.out.println("Using byName:\n");
        target = (Target) ctx.getBean("targetByName");

        System.out.println("\nUsing byType:\n");
        target = (Target) ctx.getBean("targetByType");

        System.out.println("\nUsing constructor:\n");
        target = (Target) ctx.getBean("targetConstructor");

        ctx.close();

    }
}
