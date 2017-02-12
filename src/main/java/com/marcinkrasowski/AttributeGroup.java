package com.marcinkrasowski;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by gorg on 11.02.17.
 */
public class AttributeGroup extends  AbstractAttribute{

    private Set<AbstractAttribute> attributes =new HashSet<AbstractAttribute>();

    private String name ;

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

    public AttributeGroup(String name) {
        this.name = name;
    }

    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(createPrefix(level))
                .append("{ Attribute Group: ")
                .append(this.getName())
                .append(" }\n");
        for (AbstractAttribute attribute : attributes) {
            sb.append(createPrefix(level))
            .append(attribute.toString(level+1));
        }
        return sb.toString();
    }

}
