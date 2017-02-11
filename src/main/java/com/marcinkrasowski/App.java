package com.marcinkrasowski;

public class App {
    public static void main( String[] args )
    {
        Product p1 = new Product("product01");

        p1.addAttribute(new Attribute("attr01","value of 01"));
        p1.addAttribute(new Attribute("attr02","value of 02"));
        p1.addAttribute(new Attribute("attr03","value of 03"));

        AttributeGroup attributeGroup01 = new AttributeGroup("group01");
        attributeGroup01.addAttribute(new Attribute("attr01g01","value of 01g01"));
        attributeGroup01.addAttribute(new Attribute("attr02g01","value of 02g01"));

        AttributeGroup attributeGroup02 = new AttributeGroup("group02");
        attributeGroup02.addAttribute(new Attribute("attr01g02","value of 01g02"));
        attributeGroup02.addAttribute(new Attribute("attr02g02","value of 02g02"));

        p1.addAttribute(attributeGroup01);
        p1.addAttribute(attributeGroup02);

        System.out.println(p1);
    }
}
