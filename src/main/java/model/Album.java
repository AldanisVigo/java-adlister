package model;

import java.io.Serializable;
public class Album implements Serializable {
    private int id;
    private String artist;
    private String name;
    private String release_date;
    private double sales;
    private String genre;

    public Album(int id, String artist, String name, String release_date, double sales, String genre){
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    public int getId() {
        return this.id;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getName() {
        return this.name;
    }

    public String getReleaseDate() {
        return this.release_date;
    }

    public double getSales() {
        return this.sales;
    }

    public String getGenre() {
        return this.genre;
    }
}
