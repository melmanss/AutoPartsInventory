package org.example;

// Клас для обробки витрат
class Expenses {
    private final Stock stock;

    public Expenses(Stock stock) {
        this.stock = stock;
    }

    public void usePart(String name, int quantity) {
        for (Part part : stock.parts) {
            if (part.getName().equals(name)) {
                if (part.getQuantity() >= quantity) {
                    part.removeQuantity(quantity);
                    System.out.println("Витрачено: " + quantity + " одиниць " + name);
                } else {
                    System.out.println("Недостатньо запчастин на складі.");
                }
                return;
            }
        }
        System.out.println("Запчастина не знайдена.");
    }
}