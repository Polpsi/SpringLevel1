 package Lesson7.domain;

 import javax.persistence.*;
 import java.util.List;


 @Entity
 @Table(name = "clients")
 public class Client {
     @Id
     @Column(name = "id")
     @GeneratedValue
     private Long id;

     @Column(name = "Name")
     private String name;

     @OneToMany(mappedBy = "client",cascade = CascadeType.REMOVE)
     private List<Order> orders;


     public Client() {
     }

     public Long getId() {
        return id;
    }

     public String getName() {
        return name;
    }

     public void setName(String name) {
        this.name = name;
    }

     public List<Order> getOrders() {
        return orders;
    }

     public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
 }
