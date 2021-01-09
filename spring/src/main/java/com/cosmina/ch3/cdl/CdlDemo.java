package com.cosmina.ch3.cdl;

public class CdlDemo {
    public static void main(String... args) {
        Container container = new DefaultContainer();

        ManagedComponent component = new ContextualizedDependencyLookup();
        component.performLookup(container);

        System.out.println(component);
    }
}
