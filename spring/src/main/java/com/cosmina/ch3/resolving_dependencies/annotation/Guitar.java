package com.cosmina.ch3.resolving_dependencies.annotation;

import org.springframework.stereotype.Component;

@Component("gopher")
public class Guitar {
    public void sing(){
        System.out.println("Cm Eb Fm Ab Bb");
    }
}
