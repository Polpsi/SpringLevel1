package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany
    @JoinTable(
            name = "orders_products",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;
}
