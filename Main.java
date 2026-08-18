import Restaurant.Restaurant;
import Restaurant.Order;
import Delivery.Delivery;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant(
                101,
                "RKode",
                "Chennai",
                "Pizza", 250,
                "Burger", 150,
                "Pasta", 200
        );

        restaurant.displayRestaurantDetails();

        Order order = new Order(
                1001,
                "Praveena",
                "Pizza",
                2,
                restaurant.getPrice1()
        );

        order.displayOrderDetails();

        Delivery delivery = new Delivery(
                501,
                "Chennai",
                "Arun",
                "Out for Delivery"
        );

        delivery.displayDeliveryDetails();

        delivery.updateStatus("Delivered");

        System.out.println("\nAfter Updating Status:");
        System.out.println("Delivery Status : " + delivery.getStatus());
    }
}
