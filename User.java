class User {
    String name;
    String email;
    String phone;
    String username;
    String password;
  public User( String name,String email,String phone,String username,String password){
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.username = username;
    this.password = password;
  }
  User  register(User user) {
    System.out.println("Registering user...");
    System.out.println(user);
    return user;
  }
  User  update(User user) {
    System.out.println("Updating user...");
    System.out.println(user);
    return user;
  }
  void  deleteUser(User user) {
    System.out.println("Deleting user...");
    System.out.println(user);
  }
  public static void main(String[] args) {
    String name = "Test User";
    String email = "TestUser@mku.ac.ke";
    String phone = "0713887070";
    String username = "testuser";
    String password = "Ktyey6&900";
    User user = new User(name,email,phone,username,password);
    user.register(user);
    user.update(user);
    user.deleteUser(user);
  }
}


