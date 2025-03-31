package org.example;

class IncomingParts {
    private final Stock stock;

    public IncomingParts(Stock stock) {
        this.stock = stock;
    }

    public void receivePart(String name, int quantity) {
        for (Part part : stock.parts) {
            if (part.getName().equals(name)) {
                part.addQuantity(quantity);
                return;
            }
        }
        stock.addPart(new Part(name, quantity));
    }
}