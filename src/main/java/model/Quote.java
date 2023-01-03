package model;

public class Quote {
    private int id;
    private String content;
    private Author author;

    public Quote(int id, String content, Author author){
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public int getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

    public Author getAuthor() {
        return this.author;
    }
}
