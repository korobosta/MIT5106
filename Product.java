class Product {
    String name;
    String description;
    Double price;
    int quantity;
  public Product( String name,String description,Double price,int quantity){
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }
  Product  add(Product product) {
    System.out.println("Creating product...");
    System.out.println(product);
    return product;
  }
  Product  update(Product product) {
    System.out.println("Updating product...");
    System.out.println(product);
    return product;
  }
  void  delete(Product product) {
    System.out.println("Deleting product...");
    System.out.println(product);
  }
  public static void main(String[] args) {
    String name = "Shirt";
    String description = "Polo shirt";
    Double price = 500.00;
    int quantity = 2;
    Product product = new Product(name,description,price,quantity);
    product.add(product);
    product.update(product);
    product.delete(product);
  }
}