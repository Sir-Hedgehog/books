package com.cosmina.ch3.beanname.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class BeanIdRun {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/ch3/alias_xml_02.xml");
        ctx.refresh();
        Map<String, String> beans = ctx.getBeansOfType(String.class);
        beans.forEach((key, value) -> System.out.println("id: " + key
                + "\n aliases: " + Arrays.toString(ctx.getAliases(key)) + "\n"));
        ctx.close();
    }
}
