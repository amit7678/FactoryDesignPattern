package org.example.TemplateDesignPattern;

public class TestOrder {
    public static void main(String args[])
    {
        OrderTemplate store=new StorePickUpOrder();
        store.processOrder();
    }

}
