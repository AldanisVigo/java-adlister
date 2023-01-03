package models;

import java.io.Serializable;
//CREATE TABLE authors (
//        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
//        first_name VARCHAR(50),
//        last_name  VARCHAR(100) NOT NULL,
//        PRIMARY KEY (id)
//        );
public class Author implements Serializable {
    private int id;
    private String firstName;
    private String lastName;

    public Author(int id, String first_name, String last_name){
        this.id = id;
        this.firstName = first_name;
        this.lastName = last_name;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
