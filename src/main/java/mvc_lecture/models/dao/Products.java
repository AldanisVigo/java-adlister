package mvc_lecture.models.dao;

import mvc_lecture.models.Product;

import java.util.List;

public interface Products {
    List<Product> all();
    void insert(Product product); //Persist add
}
