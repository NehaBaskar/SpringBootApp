package com.demo.LibraryManagement.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "book_name")
    private String bookname;
    @Column(name = "price")
    private int price;
    @Column(name ="category")
    private String category;
    @Column(name = "author")
    private String authorname;

    public Books() {
    }

    public Books(String bookname, int price, String category, String authorname) {
        this.bookname = bookname;
        this.price = price;
        this.category = category;
        this.authorname = authorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", authorname='" + authorname + '\'' +
                '}';
    }
}
