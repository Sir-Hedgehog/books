package com.cosmina.ch3.lookupmethodinjection.annotation.alterrun;

import com.cosmina.ch3.lookupmethodinjection.annotation.DemoBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import static com.cosmina.ch3.lookupmethodinjection.annotation.LookupDemo.displayInfo;

public class LookupDemoRun {

    @Configuration
    @ComponentScan(basePackages = {"com.cosmina.ch3.lookupmethodinjection.annotation"})
    public static class LookupConfig {

    }

    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(LookupConfig.class);
        //Arrays.stream(ctx.getBeanDefinitionNames()).forEach(s-> System.out.println(s));

        DemoBean abstractBean = ctx.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standardBean = ctx.getBean("standardLookupBean", DemoBean.class);

        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);

        ctx.close();
    }
}
