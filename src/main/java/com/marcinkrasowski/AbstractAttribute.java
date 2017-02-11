package com.marcinkrasowski;

/**
 * Created by gorg on 11.02.17.
 */
public abstract class AbstractAttribute {

    // HEre is comment done when time has ran out
    // This is very suboptimal design
    // toString() should be declared abstract and implemented in concrete subclasses

    @Override
    public String toString() {
        String result = null;
        if(this instanceof AttributeGroup){
            AttributeGroup ag = (AttributeGroup) this;
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("AttributeGroup: %s",ag.getName()));
            sb.append("\n[");
            for (AbstractAttribute abstractAttribute : ag.getAttributes()) {
                sb.append(abstractAttribute.toString());
            }
            sb.append("]\n");
            result = sb.toString();
        }else if(this instanceof Attribute) {
            result = String.format("name: %s value: %s\n", ((Attribute) this).getName(), ((Attribute) this).getValue());
        }
        return result;
    }
}
