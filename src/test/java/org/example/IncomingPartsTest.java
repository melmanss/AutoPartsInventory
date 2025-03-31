package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomingPartsTest {
    private Stock stock;
    private IncomingParts incomingParts;

    @BeforeEach
    public void setUp() {
        stock = new Stock();
        incomingParts = new IncomingParts(stock);
    }

    @Test
    public void testReceivePart() {
        incomingParts.receivePart("Гальма", 10);
        assertEquals(1, stock.parts.size()); // Проверяем, что запчасть добавлена
        assertEquals(10, stock.parts.get(0).getQuantity()); // Проверяем количество
    }
}
