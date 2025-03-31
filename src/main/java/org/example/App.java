package org.example;

// Головний клас програми
public class App {
    public static void main(String[] args) {
        Stock stock = new Stock();
        IncomingParts incomingParts = new IncomingParts(stock);
        Expenses expenses = new Expenses(stock);

        // Додавання запчастин
        incomingParts.receivePart("Гальма", 10);
        incomingParts.receivePart("Масло", 20);

        // Виведення залишків
        stock.showStock();

        // Використання запчастин
        expenses.usePart("Гальма", 5);
        expenses.usePart("Масло", 25); // недостатньо запчастин

        // Виведення залишків після витрат
        stock.showStock();
    }
}