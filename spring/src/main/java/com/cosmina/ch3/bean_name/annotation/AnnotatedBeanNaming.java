package com.cosmina.ch3.bean_name.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class AnnotatedBeanNaming {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/bean_name_annotation.xml");
        context.refresh();

        Map<String, Singer> beans = context.getBeansOfType(Singer.class);
        beans.forEach((key, value) ->
                System.out.println("id: " + key + "\n aliases: " + Arrays.toString(context.getAliases(key))));

    }
}
