package com.cosmina.ch3.constructorinjection;

import com.cosmina.ch3.cdl.Dependency;

public class ConstructorInjection {
    private Dependency dependency;

    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return dependency.toString();
    }
}
