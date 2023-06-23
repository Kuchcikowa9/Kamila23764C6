package com.firstapp.test;

import com.firstapp.model.Task;

public class AppTest {
    public static void main(String[] args) {
        Task task = new Task("Testowe zadanie", "To jest testowe zadanie");

        System.out.println("Testowe zadanie: " + task);
    }
}

