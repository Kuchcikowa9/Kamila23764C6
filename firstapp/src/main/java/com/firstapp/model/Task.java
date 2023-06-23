package com.firstapp.model;

public class Task {
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Tytuł: " + title + ", Opis: " + description;
    }
}
