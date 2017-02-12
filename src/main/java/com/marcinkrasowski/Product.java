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
        StringBuilder sb = new StringBuilder();
        sb.append("Product{ name: ").append(this.getName()).append(", attributes=\n");
        for (AbstractAttribute attribute : attributes) {
            sb.append(attribute.toString(0));
        }
        sb.append("}\n");
        return sb.toString();
    }
}
