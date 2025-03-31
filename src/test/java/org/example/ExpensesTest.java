package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpensesTest {
    private Stock stock;
    private Expenses expenses;

    @BeforeEach
    public void setUp() {
        stock = new Stock();
        stock.addPart(new Part("Гальма", 10));
        expenses = new Expenses(stock);
    }

    @Test
    public void testUsePart() {
        expenses.usePart("Гальма", 5);
        assertEquals(5, stock.parts.get(0).getQuantity()); // Проверяем количество после использования
    }

    @Test
    public void testUsePartNotEnough() {
        expenses.usePart("Гальма", 15); // Попытка использовать больше, чем есть
        assertEquals(10, stock.parts.get(0).getQuantity()); // Количество не должно измениться
    }
}
