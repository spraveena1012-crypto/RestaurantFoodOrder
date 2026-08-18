package Restaurant;

public class Order {

    private int orderId;
    private String customerName;
    private String foodName;
    private int quantity;
    private double price;

    public Order(int orderId, String customerName,
                 String foodName, int quantity, double price) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    public void displayOrderDetails() {

        System.out.println("\n----- Order Details -----");
        System.out.println("Order ID       : " + orderId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Food Name      : " + foodName);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Price          : " + price);
        System.out.println("Total Amount   : " + calculateTotal());
    }
}
