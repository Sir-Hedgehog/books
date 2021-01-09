package com.cosmina.ch3.beanname.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class BeanNameRun {
    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("spring/ch3/bean_name_xml.xml");
        context.refresh();

        Map<String, String> beans = context.getBeansOfType(String.class);

        beans.entrySet().stream().forEach(bean -> System.out.println(bean.getKey()));

        context.close();
    }
}
