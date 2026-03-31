package org.example.TemplateDesignPattern;

public class OnlineOrder extends OrderTemplate {


    @Override
    public void PackItem() {
        System.out.println("Packing item for online delivery...");
    }

    @Override
    public void DeliverItem() {
        System.out.println("Delivering item via courier service...");
    }
}
