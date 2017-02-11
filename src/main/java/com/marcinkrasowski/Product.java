package com.marcinkrasowski;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by gorg on 11.02.17.
 */
public class Product {

    private String name ;

    private Set<AbstractAttribute> attributes = new HashSet<AbstractAttribute>();

    public Set<AbstractAttribute> getAttributes() {
        return attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAttribute(AbstractAttribute abstractAttribute) {
        attributes.add(abstractAttribute);
    }

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", attributes=\n" + attributes +
                '}';
    }
}
