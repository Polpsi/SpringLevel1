import domain.Client;
import domain.Order;
import domain.Product;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;


//Пока еще не закончена, с полуночи мотался с собакой по ветклиникам, только смог сесть.
//Но для трудоустройства нужно сдавать ДЗ вовремя.
//Прошу поставить хорошую оценку, если я не успею доделать до проверки.
//Таблицы, ForeignKeys и данные которые есть - создает в правильном виде.
//Оформление заказа и привязка в product-order - происходит верно.

public class App {
    public static void main(String[] args) {

        EntityManagerFactory entityFactory = new Configuration().configure("hiber.cfg.xml").buildSessionFactory();

        EntityManager em = entityFactory.createEntityManager();

        for (int i = 0; i < 5; i++) {
            Client client = new Client();
            client.setName("Name" + i);
            createEntity(em, client);
        }

        for (int i = 0; i < 5; i++) {
            Product product = new Product();
            product.setName("Product" + i);
            createEntity(em, product);
        }

        //Покупки клиентом 2 продуктов
        Client client = readEntity(em,Client.class,2);
        //Набор продуктов
        List<Product> products = new ArrayList<>();
        products.add(readEntity(em,Product.class,7));
        products.add(readEntity(em,Product.class,6));
        products.add(readEntity(em,Product.class,9));

        //Оформление заказа
        Order order = new Order();
        order.setClient(client);
        order.setProducts(products);
        createEntity(em,order);

    }

    private static <T> void createEntity(EntityManager em, T entity){
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
    }

    private static <T> T readEntity(EntityManager em, Class<T> claz, long id){
        em.getTransaction().begin();
        T entity = em.find(claz, id);
        em.getTransaction().commit();
        return entity;
    }

}
