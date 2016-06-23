package ro.ubbcluj.movies.core.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Patri on 6/16/2016.
 */

@Entity
@EqualsAndHashCode
@ToString
@Table(name = "movie")
public class Movie extends BaseEntity<Long> {

    @Column(name = "diskNumber")
    private int diskNumber;

    @Column(name = "title")
    private String title;


//    @Column(name = "price")
//    private int price;

//    @Column(name = "genre")
//    private String genre;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

//    public Movie(String title, String genre, int price, Client client) {
//        this.title = title;
//        this.genre = genre;
//        this.price = price;
//        this.client = client;
//    }


    public Movie(int diskNumber, String title, Client client) {
        this.diskNumber = diskNumber;
        this.title = title;
        this.client = client;
    }

    public Movie(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDiskNumber() {
        return diskNumber;
    }

    public void setDiskNumber(int diskNumber) {
        this.diskNumber = diskNumber;
    }

    //    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
