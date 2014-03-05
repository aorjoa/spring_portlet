package com.t2decode.sample;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

/**
 * @author ankeet
 *
 */
@Component
public class Book {
    @NotEmpty(message="NotEmpty.book.name")
    private String name;

    @Digits(fraction = 0, integer = 3)
    private int price;

    @NotEmpty(message="NotEmpty.book.author")
    private String author;

    @NotEmpty(message="NotEmpty.book.email")
    @Email(message="Email.book.email")
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
