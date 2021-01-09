package com.cosmina.ch3.bean_name.configuration;

import com.cosmina.ch3.bean_name.annotation.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class AliasConfigDemo {

    @Configuration
    static class AliasBeanConfig {
        @Bean(name={"johnMayer","john","jonathan","johnny"})
        public Singer singer() {
            return new Singer();
        }
    }

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(AliasBeanConfig.class);
        Map<String, Singer> beans = context.getBeansOfType(Singer.class);
        beans.forEach((key, value) ->
                System.out.println("id: " + key + "\n aliases: " + Arrays.toString(context.getAliases(key)) + "\n"));
        context.close();
    }
}
