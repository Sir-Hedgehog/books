package com.cosmina.ch3.beanautowiring.xml.complicated;

import com.cosmina.ch3.beanautowiring.xml.Bar;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CTarget {
    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;

    public CTarget() {
    }

    public CTarget(Foo foo) {
        System.out.println("Target(Foo) called");
    }

    public CTarget(com.cosmina.ch3.beanautowiring.xml.Foo foo, Bar bar) {
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
        //using primary
        ctx.load("spring/ch3/autowiring_complex_mode_xml.xml");

        //using qualifier
        //ctx.load("classpath:spring/app-context-05.xml");
        ctx.refresh();
        System.out.println("\nUsing byType:\n");
        CTarget t = (CTarget) ctx.getBean("targetByType");
        ctx.close();
    }
}
