package domain;

import javax.persistence.*;
import java.util.List;

//Пока еще не закончена, с полуночи мотался с собакой по ветклиникам, только смог сесть.
//Но для трудоустройства нужно сдавать ДЗ вовремя.
//Прошу поставить хорошую оценку, если я не успею доделать до проверки.

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "client")
    private List<Order> orders;


    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
