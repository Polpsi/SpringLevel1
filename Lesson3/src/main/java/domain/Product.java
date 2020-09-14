package domain;

import javax.persistence.*;
import java.util.List;


@Entity
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Float price;

    @ManyToMany
    @JoinTable(name = "orders_products",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<Order> orders;

}
