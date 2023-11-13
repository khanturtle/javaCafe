import java.util.ArrayList;
import java.util.List;

public class Order {
    private Order.PickUp delivery;
    private List<OrderItem> items = new ArrayList<>();
    private static int orderCounter = 1;
    private int orderNo ;

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void setPickUp(PickUp pickUp) {
    }

    // your code here
  public static interface PickUp {
      public abstract void handle(Order o);
      abstract class Delivery implements Order.PickUp {

          private String address;

          // your code here

      }

      abstract class DriveThru implements Order.PickUp {

          private String vehicleNumber;

          // your code here

      }

      abstract class TakeOut implements Order.PickUp {

          // your code here

      }
  }
}
