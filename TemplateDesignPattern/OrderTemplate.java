package org.example.TemplateDesignPattern;

public abstract class OrderTemplate {
    public final  void processOrder(){
     validateOrder();
     processPayment();
     PackItem();
     DeliverItem();
     sendConfirmation();
    }

    public void validateOrder() {
        System.out.println("Validating order...");
    }

    public void processPayment() {
        System.out.println("Processing payment...");
    }

    public void sendConfirmation() {
        System.out.println("Sending order confirmation...");
    }

    public  abstract  void PackItem();

    public  abstract  void DeliverItem();


}
