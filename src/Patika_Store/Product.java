package Patika_Store;

public class Product {

    private int id;
    private double price;
    private String name;
    private Brand brand;


    public Product(int id, double price, String name, Brand brand) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.brand = brand;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}
