package com.cosmina.ch3.collections.xml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
    private Map<String, Object> map;
    private Properties props;
    private Set set;
    private List list;

    public void displayInfo() {
        System.out.println("Map contents:\n");
        map.forEach((key, value) -> System.out.println("Key: " + key + "; Value: " + value));

        System.out.println("Properties contents:\n");
        props.forEach((key, value) -> System.out.println("Key: " + key + "; Value: " + value));

        System.out.println("Set contents:\n");
        set.forEach(object -> System.out.println("Value: " + object));

        System.out.println("List contents:\n");
        list.forEach(object -> System.out.println("Value: " + object));
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setList(List list) {
        this.list = list;
    }
}
