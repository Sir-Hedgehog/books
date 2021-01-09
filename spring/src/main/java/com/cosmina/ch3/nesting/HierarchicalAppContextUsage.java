package com.cosmina.ch3.nesting;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextUsage {
    public static void main(String... args) {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("spring/ch3/nesting-parent.xml");
        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("spring/ch3/nesting-child.xml");
        child.setParent(parent);
        child.refresh();

        Song song1 = (Song) child.getBean("song1");
        Song song2 = (Song) child.getBean("song2");
        Song song3 = (Song) child.getBean("song3");

        System.out.println("From parent context: " + song1.getTitle());
        System.out.println("From child context: " + song2.getTitle());
        System.out.println("From parent context: " + song3.getTitle());

        child.close();
        parent.close();
    }
}
