package model;

import java.io.Serializable;

public class Author implements Serializable {
    private int id;
    private String first_name;
    private String last_name;

    public Author(int id, String first_name, String last_name){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }
}
