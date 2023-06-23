package com.firstapp;

import com.firstapp.model.Task;

public class MainApp {
    public static void main(String[] args) {
        Task task1 = new Task("Nauka", "Zrobić elearning");
        Task task2 = new Task("Praca", "Przygotować raport");

        System.out.println("Zadanie 1: " + task1);
        System.out.println("Zadanie 2: " + task2);
    }
}
