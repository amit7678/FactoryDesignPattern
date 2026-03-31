package org.example.TemplateDesignPattern;

public class StorePickUpOrder extends OrderTemplate{
    @Override
    public void PackItem() {
        System.out.println("Packing item for store pickup...");
    }

    @Override
    public void DeliverItem() {
        System.out.println("Customer will pick up the item from store...");
    }
}
