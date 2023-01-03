package mvc_lecture.models;


import java.io.Serializable;

public class Product implements Serializable {
    private String name;

    private double price;

    public Product(){}

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String name() {
        return this.name;
    }

    public double price() {
        return this.price;
    }

}
