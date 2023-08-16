package domain.models;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private long id;

    private String status;

    private LocalDate orderDate;

    private LocalDate deliveryData;

    private List<Product> products;

    private Client  client;

    public Order(long id, String status, LocalDate orderDate, LocalDate deliveryData, List<Product> products, Client client) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryData = deliveryData;
        this.products = products;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryData() {
        return deliveryData;
    }

    public void setDeliveryData(LocalDate deliveryData) {
        this.deliveryData = deliveryData;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double aleluya(){
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
