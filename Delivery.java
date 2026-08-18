package Delivery;

public class Delivery {

    private int deliveryId;
    private String deliveryAddress;
    private String deliveryPerson;
    private String status;

    public Delivery(int deliveryId, String deliveryAddress,
                    String deliveryPerson, String status) {

        this.deliveryId = deliveryId;
        this.deliveryAddress = deliveryAddress;
        this.deliveryPerson = deliveryPerson;
        this.status = status;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getDeliveryPerson() {
        return deliveryPerson;
    }

    public String getStatus() {
        return status;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setDeliveryPerson(String deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayDeliveryDetails() {

        System.out.println("\n----- Delivery Details -----");
        System.out.println("Delivery ID      : " + deliveryId);
        System.out.println("Delivery Address : " + deliveryAddress);
        System.out.println("Delivery Person  : " + deliveryPerson);
        System.out.println("Status           : " + status);
    }

    public void updateStatus(String status) {
        this.status = status;
    }
}
