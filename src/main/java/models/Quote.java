package models;

import java.io.Serializable;
//CREATE TABLE quotes (
//        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
//        content TEXT NOT NULL,
//        author_id INT UNSIGNED NOT NULL,
//        PRIMARY KEY (id),
//        FOREIGN KEY (author_id) REFERENCES authors (id)
//        );
public class Quote implements Serializable {
    private int id;
    private String content;
    private int author_id;

    public Quote(int id, String content,int author_id){
        this.id = id;
        this.content = content;
        this.author_id = author_id;
    }

    public int getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public int getAuthorId() {
        return this.author_id;
    }
}
