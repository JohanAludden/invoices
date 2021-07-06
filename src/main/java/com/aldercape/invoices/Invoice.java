package com.aldercape.invoices;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<LineItem> lineItems = new ArrayList<>();

    public String client() {
        return "My client";
    }

    public String company() {
        return "My company";
    }

    public int term() {
        return 30;
    }

    public List<LineItem> lineItems() {
        return lineItems;
    }

    public void addLineItem(String description, int quantity, int unitPrice) {
        lineItems.add(new LineItem(description, quantity, unitPrice));
    }
}
