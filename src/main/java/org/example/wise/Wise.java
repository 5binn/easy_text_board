package org.example.wise;

public class Wise {
    int id;
    String content;
    String author;
    Wise (int id, String content, String author) {
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
    public String getAuthor() {
        return this.author;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

}
