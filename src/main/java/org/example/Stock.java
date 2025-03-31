package org.example;

import java.util.ArrayList;
import java.util.List;

// Клас для управління залишками запчастин
class Stock {
    List<Part> parts;

    public Stock() {
        parts = new ArrayList<>();
    }

    public void addPart(Part part) {
        parts.add(part);
    }

    public void showStock() {
        for (Part part : parts) {
            System.out.println("Запчастина: " + part.getName() + ", Кількість: " + part.getQuantity());
        }
    }
}
