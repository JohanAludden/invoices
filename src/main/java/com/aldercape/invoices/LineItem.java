package com.aldercape.invoices;

import java.util.Objects;

public class LineItem {
    private String description;
    private int quantity;
    private int unitPrice;

    public LineItem(String description, int quantity, int unitPrice) {
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String description() {
        return description;
    }

    public int quantity() {
        return quantity;
    }

    public int unitPrice() {
        return unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineItem lineItem = (LineItem) o;
        return  // quantity == lineItem.quantity &&
//                unitPrice == lineItem.unitPrice &&
                description.equals(lineItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, quantity, unitPrice);
    }
}
