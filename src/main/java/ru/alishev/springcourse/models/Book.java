package ru.alishev.springcourse.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Book {
    private int id;

    @NotEmpty(message = "name cannot be empty")
    @Size(min = 2, max = 30, message = "name should be between 2 and 30 characters")
    private String title;

    @NotEmpty(message = "author cannot be empty")
    @Size(min = 2, max = 100, message = "Имя автора должно быть от 2 до 100 символов")
    private String author;

//    @NotEmpty(message = "year cannot be empty")
    @Min(value = 1500, message = "year should be more than 1500")
    private int year;

    public Book(int id, String name, String author, int year) {
        this.id = id;
        this.title = name;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
