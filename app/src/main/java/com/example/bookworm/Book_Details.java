package com.example.bookworm;

import java.io.Serializable;

public class Book_Details implements Serializable {
    private String name;
    private String description;
    private String price;

    public Book_Details() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

