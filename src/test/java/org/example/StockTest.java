package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {
    private Stock stock;

    @BeforeEach
    public void setUp() {
        stock = new Stock();
        stock.addPart(new Part("Гальма", 10));
        stock.addPart(new Part("Масло", 20));
    }

    @Test
    public void testShowStock() {
        // Печать на консоль не может быть протестирована напрямую
        // Можно использовать системный вывод или другой метод для проверки
        stock.showStock();
    }

    @Test
    public void testAddPart() {
        stock.addPart(new Part("Фільтр", 5));
        assertEquals(3, stock.parts.size()); // Проверяем, что добавлено три запчасти
    }
}
