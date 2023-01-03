package mvc_lecture.dao;

import mvc_lecture.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProducts implements Products {
    //DAO - Import the interface [has no details of HOW to do things] here.
    //The DAO here will provide the HOW to do things - in this local example, it answers the question : "How do I interact with Product objects coming from an ArrayList datasource?

    private List<Product> products = new ArrayList();


    //Constructor to add initial items.
    public ArrayListProducts(){
        insert(new Product("Product One",10.99));
        insert(new Product("Generator",300.00));
        insert(new Product("Flux Capacitors",4999.99));
    }

    //Mock getting all
    @Override
    public List<Product> all() {
        return this.products;
    }

    //Mock inserting
    @Override
    public void insert(Product product) {
        this.products.add(product);
    }
}
