import java.util.ArrayList;
import java.util.List;

class Order {
    String orderNumber;
    String status;
    Double total;
    String username;
    List<Product> products;
    User user;
  public Order( String orderNumber,String status,Double total,List<Product> products,User user){
    this.orderNumber = orderNumber;
    this.status = status;
    this.total = total;
    this.products = products;
    this.user = user;
  }
  Order create(Order order) {
    System.out.println("Creating order...");
    System.out.println(order);
    return order;
  }
  Order update(Order order) {
    System.out.println("Updating order...");
    System.out.println(order);
    return order;
  }
  void  delete(Order order) {
    System.out.println("Deleting order...");
    System.out.println(user);
  }
  public static void main(String[] args) {
    User user = new User("Test User","TestUser@mku.ac.ke","0713887070","testuser","Ktyey6&900");
    Product product = new Product("Shirt","Polo shirt",500.00,2);
    List<Product> products =new ArrayList<>();
    products.add(product);
    Order order = new Order("123456","pending",500.00,products,user);
    order.create(order);
    order.update(order);
    order.delete(order);
  }
}