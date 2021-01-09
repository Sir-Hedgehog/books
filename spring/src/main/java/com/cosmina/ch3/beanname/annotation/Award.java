package com.cosmina.ch3.beanname.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Award {

    @AliasFor("prize")
    String[] value() default {};

    @AliasFor("value")
    String[] prize() default {};
}
