import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class OrderRepository implements Iterator<Order> {
    List<Order> orders = new ArrayList<>();

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Order next() {
        return null;
    }

    public void add(Order order) {
        orders.add(order);
    }
    // your code here
}
